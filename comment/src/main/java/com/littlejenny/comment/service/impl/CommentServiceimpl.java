package com.littlejenny.comment.service.impl;

import com.littlejenny.comment.dao.CommentDao;
import com.littlejenny.comment.entity.Comment;
import com.littlejenny.comment.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CommentServiceimpl implements CommentService {
    @Autowired
    private CommentDao dao;
    public void addComment(Comment comment){
        dao.add(comment);
        log.info("新增:"+comment);
    }
    public List<Comment> listCommentDesc(){
        List<Comment> comments = dao.listCommentDesc();
        for (Comment comment : comments) {
            log.info("取得:",comment,"-desc");
        }
        return comments;
    }

}
