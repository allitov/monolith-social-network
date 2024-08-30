package com.allitov.controller;

import com.allitov.dto.request.AccountRequest;
import com.allitov.dto.response.AccountListResponse;
import com.allitov.dto.response.AccountResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/api/v1/account")
public class UserController {

    @GetMapping
    public ResponseEntity<AccountListResponse> getAllAccounts() {
        log.info("Get all accounts request");

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{accountId}")
    public ResponseEntity<AccountResponse> getAccountById(@PathVariable("accountId") UUID accountId) {
        log.info("Get account by id request with id = '{}'", accountId);

        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Void> createAccount(@RequestBody AccountRequest accountRequest) {
        log.info("Create account request with body = {}", accountRequest);

        return ResponseEntity.created(URI.create("api/v1/account/" + UUID.randomUUID())).build();
    }

    @PutMapping("/{accountId}")
    public ResponseEntity<Void> updateAccountById(@PathVariable("accountId") UUID accountId,
                                                  @RequestBody AccountRequest accountRequest) {
        log.info("Update account by id request with id = '{}' and body = {}", accountId, accountRequest);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{accountId}")
    public ResponseEntity<Void> deleteAccountById(@PathVariable("accountId") UUID accountId) {
        log.info("Delete account by id request with id = '{}'", accountId);

        return ResponseEntity.noContent().build();
    }
}
