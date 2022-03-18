package com.codepresso.team2app.controller.dto;

import com.codepresso.team2app.vo.HashTag;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HashTagRequestDto {
    Long id;
    String tag_content;
    Long post_id;
    Long comment_id;

    public HashTag getHashTag(){
        return new HashTag(this.id, this.tag_content, this.post_id, this.comment_id);
    }
}
