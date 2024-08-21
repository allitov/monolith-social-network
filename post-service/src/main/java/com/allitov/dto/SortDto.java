package com.allitov.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SortDto {

    private Boolean empty;

    private Boolean unsorted;

    private Boolean sorted;
}
