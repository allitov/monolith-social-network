package com.allitov.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageCommentDto {

    private Long totalElements;

    private Integer totalPages;

    private Integer number;

    private Integer size;

    private List<CommentDto> content;

    private SortDto sort;

    private Boolean first;

    private Boolean last;

    private Integer numberOfElements;

    private PageableObjectDto pageable;

    private Boolean empty;
}
