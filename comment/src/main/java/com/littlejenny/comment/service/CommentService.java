package com.littlejenny.comment.service;

import com.littlejenny.comment.dao.CommentDao;
import com.littlejenny.comment.entity.Comment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CommentService {
    void addComment(Comment comment);
    List<Comment> listCommentDesc();
}
