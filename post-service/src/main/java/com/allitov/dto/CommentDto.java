package com.allitov.dto;

import com.allitov.domain.CommentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {

    private Long id;

    private CommentType commentType;

    private LocalDateTime time;

    private LocalDateTime timeChanged;

    private Long authorId;

    private Long parentId;

    private String commentText;

    private Long postId;

    private Boolean isBlocked;

    private Boolean isDelete;

    private Integer likesCount;

    private Boolean myLike;

    private Integer commentsCount;

    private String imagePath;
}
