package com.allitov.dto.request;

import lombok.Builder;
import lombok.Data;

/**
 * Dto class for setting password after recovery request.
 * @author Alexander Litovkin
 */
@Data
@Builder
public class SetPasswordRequest {

    private String temp;

    private String password;
}
