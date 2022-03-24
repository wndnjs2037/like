package com.codepresso.team2app.service;

import com.codepresso.team2app.repository.CommentRepository;
import com.codepresso.team2app.repository.HashTagRepositroy;
import com.codepresso.team2app.vo.Comment;
import com.codepresso.team2app.vo.HashTag;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommentService {
    CommentRepository commentRepository;
    HashTagRepositroy hashTagRepositroy;

    public boolean saveComment(Comment comment) {
        Integer result = commentRepository.saveComment(comment);
        return result == 1;
    }

    public boolean saveHashTag(HashTag hashTag) {
        Integer result = hashTagRepositroy.saveHashTag(hashTag);
        return result == 1;
    }
    public List<Comment> getAllComment() {
        List<Comment> commentList = commentRepository.findAllComment();
        return commentList;
    }

    public Comment getOneComment(Long id) {
        Comment comment = commentRepository.findOneComment(id);
        return comment;
    }
}
