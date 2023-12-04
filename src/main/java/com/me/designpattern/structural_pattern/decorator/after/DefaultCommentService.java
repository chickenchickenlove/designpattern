package com.me.designpattern.structural_pattern.decorator.after;

public class DefaultCommentService implements CommentService{
    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
