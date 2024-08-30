package com.allitov.dto.request;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

/**
 * Dto class for comment create/update request.
 * @author Alexander Litovkin
 */
@Data
@Builder
public class CommentRequest {

    private UUID postId;

    private UUID authorId;

    private UUID parentId;

    private String content;
}
