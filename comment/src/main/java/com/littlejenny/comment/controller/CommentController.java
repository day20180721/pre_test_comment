package com.littlejenny.comment.controller;

import com.littlejenny.comment.entity.Comment;
import com.littlejenny.comment.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;
    @GetMapping({"/index.html","/"})
    public String index(Model model){
        List<Comment> comments = commentService.listCommentDesc();
        model.addAttribute("comments",comments);
        return "index";
    }
    @PostMapping("/comment")
    public String comment(Comment comment) throws ParseException {
        Date date = new Date();
        comment.setCreateTime(date);
        commentService.addComment(comment);
        return "redirect:index.html";
    }
}
