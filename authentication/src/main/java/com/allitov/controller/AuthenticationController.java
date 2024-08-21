package com.allitov.controller;

import com.allitov.dto.AuthenticateDto;
import com.allitov.dto.RecoveryPasswordLinkDto;
import com.allitov.dto.RegistrationDto;
import com.allitov.dto.SetPasswordDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody RegistrationDto requestBody) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/password/recovery")
    public ResponseEntity<Void> generateRecoveryLink(@RequestBody RecoveryPasswordLinkDto requestBody) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/password/recovery/{recoveryLink}")
    public ResponseEntity<Void> setPassword(@PathVariable("recoveryLink") String recoveryLink,
                                            @RequestBody SetPasswordDto requestBody) {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity<Void> login(@RequestBody AuthenticateDto requestBody) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/captcha")
    public ResponseEntity<Void> generateCaptcha() {
        return ResponseEntity.ok().build();
    }
}
