package com.allitov.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Dto class for authentication request.
 * @author Alexander Litovkin
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticateDto {

    private String email;

    private String password;
}
