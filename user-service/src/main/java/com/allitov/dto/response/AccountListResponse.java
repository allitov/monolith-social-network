package com.allitov.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Dto class for account list response.
 * @author Alexander Litovkin
 */
@Data
@Builder
public class AccountListResponse {

    private List<AccountResponse> accounts;
}
