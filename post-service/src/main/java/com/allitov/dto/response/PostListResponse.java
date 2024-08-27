package com.allitov.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Dto class for post list response.
 * @author Alexander Litovkin
 */
@Data
@Builder
public class PostListResponse {

    private List<PostResponse> posts;
}
