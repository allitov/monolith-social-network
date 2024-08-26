package com.allitov.dto.request;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class CommentRequest {

    private UUID postId;

    private UUID authorId;

    private UUID parentId;

    private String content;
}
