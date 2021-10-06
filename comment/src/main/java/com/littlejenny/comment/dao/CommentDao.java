package com.littlejenny.comment.dao;

import com.littlejenny.comment.entity.Comment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public interface CommentDao {
    void add(Comment comment);
    List<Comment> list();
    List<Comment> listCommentDesc();
}
