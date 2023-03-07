package com.project.presentaion.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dotp")
public class DotpRegMgmtController {


    @GetMapping("/appCode")
    public void reqAppRegcode() {

    }

    @PostMapping
    public void regDotp() {
        // 1. 사용자 검증
        // 2. otp 등록요청
    }

    @PutMapping
    public void issuDotp() {
        // 1. 사용자 검증
        // 2. otp 검증요청
        // 2. otp
    }

    @DeleteMapping
    public void remvDotp() {

    }

}
