package com.allitov.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageableObjectDto {

    private Long offset;

    private SortDto sort;

    private Integer pageSize;

    private Integer pageNumber;

    private Boolean paged;

    private Boolean unpaged;
}
