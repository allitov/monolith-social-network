package com.allitov.dto;

import com.allitov.domain.PostType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

    private Long id;

    private LocalDateTime time;

    private LocalDateTime timeChanged;

    private Long authorId;

    private String title;

    private PostType type;

    private String postText;

    private Boolean isBlocked;

    private Boolean isDelete;

    private Integer commentsCount;

    private List<String> tags;

    private Integer likesCount;

    private Boolean myLike;

    private String imagePath;

    private LocalDateTime publishDate;
}
