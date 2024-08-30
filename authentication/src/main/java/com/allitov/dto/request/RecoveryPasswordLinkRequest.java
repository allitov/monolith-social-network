package com.allitov.dto.request;

import lombok.Builder;
import lombok.Data;

/**
 * Dto class for recovery password link request.
 * @author Alexander Litovkin
 */
@Data
@Builder
public class RecoveryPasswordLinkRequest {

    private String temp;

    private String email;
}
