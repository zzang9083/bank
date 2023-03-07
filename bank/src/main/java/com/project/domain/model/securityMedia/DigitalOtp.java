package com.project.domain.model.securityMedia;

import com.project.domain.model.bank.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "DigitalOtp")
@NoArgsConstructor
@Getter
@Setter
public class DigitalOtp {

    @Id
    private Long secuCdn; // otp 일련번호

    private char sccdScd; // 보안카드 상태코드

    private String isncYmd; // 발급년월일

    private String sysLsmdId; // 최종변경ID

    private LocalDate sysLsmdTs; // 최종변경ID

    public DigitalOtp(Long secuCdn, char sccdScd, String isncYmd, String sysLsmdId, LocalDate sysLsmdTs) {
        this.secuCdn = secuCdn;
        this.sccdScd = sccdScd;
        this.isncYmd = isncYmd;
        this.sysLsmdId = sysLsmdId;
        this.sysLsmdTs = sysLsmdTs;
    }




    // 디지털 otp 생성
    public static DigitalOtp createDigOtp() {
        // 1. 디지털otp 정보생성(cash에서 관리)

        //return new DigitalOtp();
    }

    // 디지털 otp 상태 수정
    public DigitalOtp changeDigiOtpStus(User cust) {
        // 1. 고객 디지털otp 정보가지고오기
        // 2. 디지털otp 상태체크
        // 2. 고객 디지털 otp 상태 수정

        //return new DigitalOtp();
    }
}
