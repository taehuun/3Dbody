package com.ssafy.backend.domain.comment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CommentRequestDto {

    private String content;

    @JsonProperty("user_id")
    private Long userId;

    @JsonProperty("challenge_id")
    private Long challengeId;

    @JsonProperty("parent_id")
    private Long parentId;

}
