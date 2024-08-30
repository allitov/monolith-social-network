package com.allitov.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * Dto class for comment list response.
 * @author Alexander Litovkin
 */
@Data
@Builder
public class CommentListResponse {

    private List<CommentResponse> comments;
}
