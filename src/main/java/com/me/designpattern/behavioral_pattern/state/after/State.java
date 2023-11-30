package com.me.designpattern.behavioral_pattern.state.after;


import java.util.List;

public interface State {
    void addReview(String review, Student student);
    void addStudent(Student student);
}
