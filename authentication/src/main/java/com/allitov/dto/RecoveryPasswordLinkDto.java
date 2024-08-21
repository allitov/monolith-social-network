package com.allitov.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Dto class for recovery password link request.
 * @author Alexander Litovkin
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecoveryPasswordLinkDto {

    private String temp;

    private String email;
}
