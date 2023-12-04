package com.me.designpattern.structural_pattern.decorator.after_one;

public class DefaultCommentService implements CommentService{

    public void addComment(String comment) {
        System.out.println(comment);
    }
}
