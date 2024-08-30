package com.allitov.dto.request;

import lombok.Builder;
import lombok.Data;

/**
 * Dto class for authentication request.
 * @author Alexander Litovkin
 */
@Data
@Builder
public class AuthenticationRequest {

    private String email;

    private String password;
}
