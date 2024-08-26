package com.allitov.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class CommentResponse {

    private UUID id;

    private UUID postId;

    private UUID authorId;

    private UUID parentId;

    private String content;

    private Integer commentsCount;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
