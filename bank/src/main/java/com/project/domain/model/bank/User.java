package com.project.domain.model.bank;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "User")
@Setter
@Getter
@EqualsAndHashCode
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usrNo; // 이용자번호

    private String ebankDcd; // 뱅킹구분코드

    private char indvCorpDtlDcd; // 개인법인상세구분코드

    private String csm; // 사용자명

    private String rnn; // 실명번호

    private String  birth; // 생년월일

    private String phNum; // 핸드폰번호

    private String usrScd ; // 이용자상태

    private LocalDate frrgTs; // 최초등록시간

    private LocalDate sysLsmdTs; // 최종변경시간

    public User() {
    }


    // 사용자 검증
    boolean vfyCust() {
      return true;
    }

}
