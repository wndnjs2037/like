package com.codepresso.team2app.controller.dto;

import com.codepresso.team2app.vo.Post;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostRequestDto {
    Long id;
    Long author;
    String title;
    String content;

    public Post getPost(){
        return new Post(this.author, this.title, this.content);
    }
    public void postInfo(){
        System.out.println("id : "+ this.id );
    }
}
