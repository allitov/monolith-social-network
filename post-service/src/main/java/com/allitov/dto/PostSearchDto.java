package com.allitov.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostSearchDto {

    private List<Long> ids;

    private List<Long> accountIds;

    private List<Long> blockedIds;

    private String author;

    private String title;

    private String postText;

    private Boolean withFriends;

    private Boolean isDelete;

    private List<String> tags;

    private LocalDate dateFrom;

    private LocalDate dateTo;
}
