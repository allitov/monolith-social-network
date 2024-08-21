package com.allitov.controller;

import com.allitov.dto.AuthenticateDto;
import com.allitov.dto.RecoveryPasswordLinkDto;
import com.allitov.dto.RegistrationDto;
import com.allitov.dto.SetPasswordDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Rest controller for authentication service.
 * @author Alexander Litovkin
 */
@RestController
@RequestMapping("/api/v1/auth")
public class AuthenticationController {

    /**
     * Endpoint for user registration.
     * @param requestBody a request body with registration data.
     * @return an HTTP response.
     */
    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody RegistrationDto requestBody) {
        return ResponseEntity.ok().build();
    }

    /**
     * Endpoint for recovery password link generation.
     * @param requestBody a request body with email to which to send a link.
     * @return an HTTP response.
     */
    @PostMapping("/password/recovery")
    public ResponseEntity<Void> generateRecoveryLink(@RequestBody RecoveryPasswordLinkDto requestBody) {
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
                                            @RequestBody SetPasswordDto requestBody) {
        return ResponseEntity.ok().build();
    }

    /**
     * Endpoint for user authentication.
     * @param requestBody a request body with user authentication data.
     * @return an HTTP response.
     */
    @PostMapping("/login")
    public ResponseEntity<Void> login(@RequestBody AuthenticateDto requestBody) {
        return ResponseEntity.ok().build();
    }

    /**
     * Endpoint for captcha generation.
     * @return an HTTP response.
     */
    @GetMapping("/captcha")
    public ResponseEntity<Void> generateCaptcha() {
        return ResponseEntity.ok().build();
    }
}
