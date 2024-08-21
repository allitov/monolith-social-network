package com.allitov.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDto {

    private String email;

    private String password1;

    private String password2;

    private String firstName;

    private String lastName;

    private String code;

    private String token;
}
