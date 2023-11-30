package com.me.designpattern.behavioral_pattern.state.after;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {

    private State state;
    private List<String> reviews = new ArrayList<>();

    private List<Student> students = new ArrayList<>();

    public OnlineCourse() {
        this.state = new Draft(this);
    }

    public void addReview(String review, Student student) {
        this.state.addReview(review, student);
    }

    public void addStudent(Student student) {
        this.state.addStudent(student);
        if (this.students.size() > 1) {
            changeState(new Private(this));
        }
    }


    public void changeState(State newState) {
        this.state = newState;
    }

    public State getState() {
        return state;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public List<Student> getStudents() {
        return students;
    }

}
