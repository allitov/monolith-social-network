package com.allitov.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Dto class for setting password after recovery request.
 * @author Alexander Litovkin
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SetPasswordDto {

    private String temp;

    private String password;
}
