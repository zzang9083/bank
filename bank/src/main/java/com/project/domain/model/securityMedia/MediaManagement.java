package com.project.domain.model.securityMedia;

import com.project.domain.model.bank.User;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "SecurityMediaManagement")
@Getter
public class SecurityMediaManagement {

    @Id
    private Long usrNo; // 계약번호

    private LocalDate valdFnshTs; // 유효종료일시

    private String secuMdiaDcd; // 보안매체구분코드

    private LocalDate valdSttgTs; // 유효종료일시

    private String pmedNo; // 매체별번호

    private String sysLsmdId; // 최종변경ID

    private LocalDate sysLsmdTs; // 최종변경ID

    // 앱등록코드 배부
    void genAppRegCode() {
        // 1. 앱등록코드 생성(cash)
        // 2. 앱등록코드 발송(kakao)
    }

    // 디지털 otp 등록신청 요청
    void reqApplnRegDigOtp(User cust) {
        // 1. 고객 검증
        // 2. 고객 otp검증
        // 3. 금결원 등록신청 요청
    }

    // 디지털 otp 등록신청 응답
    void repnsApplnRegDigOtp(User cust) {
        // 1. 요청 복원
        // 2. otp정보 생성
        // 3. 등록신청완료 카카오톡 메시지 발송
    }

    // 디지털 otp 발급요청
    void reqIssuDigOtp(User cust) {
        // 1. 고객 검증
        // 2. 고객 otp검증
        // 3. 금결원 발급요청
    }

    // 디지털 otp 발급요청
    void repnsIssuDigOtp(User cust) {
        // 1. 요청 복원
        // 2. otp정보 갱신
        // 3. 발급완료 카카오톡 메시지 발송
    }
}
