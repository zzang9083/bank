package com.project.presentaion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dotp")
public class DotpCrtfController {

    @PostMapping("/active")
    public void reqActiveCrtf() {
        //1. 사용자 검증
        //2. 거래코드 생성
    }

    @GetMapping("/AppPwd")
    public void vrfyAppPwd() {
        // 1. 앱 비밀번호 검증
        // 2. 앱 인증번호 생성 요청
        // 3. 앱인증번호 카카오톡 응답
    }

    @GetMapping("/AppCrtfNbr")
    public void vrfyAppCrtfNbr() {
        // 1. 앱 인증번호 검증
        // 2. 거래코드 활성화 완료
        // 3. 인증완료 카카오톡 응답
    }



}
