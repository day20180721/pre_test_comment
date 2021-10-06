package com.littlejenny.comment.dao.impl;

import com.littlejenny.comment.dao.CommentDao;
import com.littlejenny.comment.entity.Comment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class CommentDaoImpl implements CommentDao {
    private List<Comment> comments = new ArrayList<>();
    public void add(Comment comment){
        comments.add(comment);
    }

    public List<Comment> list(){
        return new ArrayList<>(comments);
    }

    public List<Comment> listCommentDesc() {
        List<Comment> list = list();
        list.sort((item,item2) ->{
            if(item.getCreateTime().getTime() > item2.getCreateTime().getTime()){
                return -1;
            }else if(item.getCreateTime().getTime() < item2.getCreateTime().getTime()) {
                return 1;
            }else {
                return 0;
            }
        });
        return list;
    }
}
