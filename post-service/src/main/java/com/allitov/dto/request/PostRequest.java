package com.allitov.dto.request;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class PostRequest {

    private UUID authorId;

    private String title;

    private String content;
}
