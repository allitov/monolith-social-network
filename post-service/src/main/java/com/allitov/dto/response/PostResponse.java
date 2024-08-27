package com.allitov.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Dto class for post response.
 * @author Alexander Litovkin
 */
@Data
@Builder
public class PostResponse {

    private UUID id;

    private UUID authorId;

    private String title;

    private String content;

    private Integer commentsCount;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
