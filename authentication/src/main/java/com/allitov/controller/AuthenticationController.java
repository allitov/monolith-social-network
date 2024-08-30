package com.allitov.controller;

import com.allitov.dto.request.AuthenticationRequest;
import com.allitov.dto.request.RecoveryPasswordLinkRequest;
import com.allitov.dto.request.RegistrationRequest;
import com.allitov.dto.request.SetPasswordRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Rest controller for authentication service.
 * @author Alexander Litovkin
 */
@Slf4j
@RestController
@RequestMapping("/api/v1/auth")
public final class AuthenticationController {

    /**
     * Endpoint for user registration.
     * @param requestBody a request body with registration data.
     * @return an HTTP response.
     */
    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody RegistrationRequest requestBody) {
        log.info("Registration request");

        return ResponseEntity.ok().build();
    }

    /**
     * Endpoint for recovery password link generation.
     * @param requestBody a request body with email to which to send a link.
     * @return an HTTP response.
     */
    @PostMapping("/password/recovery")
    public ResponseEntity<Void> generateRecoveryLink(@RequestBody RecoveryPasswordLinkRequest requestBody) {
        log.info("Generate recovery link request");

        return ResponseEntity.ok().build();
    }

    /**
     * Endpoint for changing password.
     * @param recoveryLink a recovery link that was sent to a user.
     * @param requestBody a request body with new password.
     * @return an HTTP response.
     */
    @PostMapping("/password/recovery/{recoveryLink}")
    public ResponseEntity<Void> setPassword(@PathVariable("recoveryLink") String recoveryLink,
                                            @RequestBody SetPasswordRequest requestBody) {
        log.info("Set password request");

        return ResponseEntity.ok().build();
    }

    /**
     * Endpoint for user authentication.
     * @param requestBody a request body with user authentication data.
     * @return an HTTP response.
     */
    @PostMapping("/login")
    public ResponseEntity<Void> login(@RequestBody AuthenticationRequest requestBody) {
        log.info("Login request");

        return ResponseEntity.ok().build();
    }

    /**
     * Endpoint for captcha generation.
     * @return an HTTP response.
     */
    @GetMapping("/captcha")
    public ResponseEntity<Void> generateCaptcha() {
        log.info("Generate captcha request");

        return ResponseEntity.ok().build();
    }
}
