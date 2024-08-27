package com.allitov.dto.request;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

/**
 * Dto class for post create/update request.
 * @author Alexander Litovkin
 */
@Data
@Builder
public class PostRequest {

    private UUID authorId;

    private String title;

    private String content;
}
