package com.allitov.dto.request;

import lombok.Builder;
import lombok.Data;

/**
 * Dto class for registration request.
 * @author Alexander Litovkin
 */
@Data
@Builder
public class RegistrationRequest {

    private String email;

    private String password1;

    private String password2;

    private String firstName;

    private String lastName;

    private String code;

    private String token;
}
