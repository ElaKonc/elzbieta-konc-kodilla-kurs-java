package com.kodilla.stream.forumuser;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class ForumUser {
    private int id;
    private String name;
    private char sex;
    private LocalDate dateOfBirth;
    private int numberOfPosts;

    public ForumUser(int id, String name, char sex, LocalDate dateOfBirth, int numberOfPosts) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }
}
