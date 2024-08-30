package com.allitov.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

/**
 * Dto class for account response.
 * @author Alexander Litovkin
 */
@Data
@Builder
public class AccountResponse {

    private UUID id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String country;

    private String city;

    private String phone;

    private String about;
}
