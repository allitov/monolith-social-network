package com.allitov.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class AccountListResponse {

    private List<AccountResponse> accounts;
}
