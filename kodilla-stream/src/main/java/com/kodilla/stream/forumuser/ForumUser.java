package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    final private int ID;
    final private String userName;
    final private char sex;
    final private LocalDate dateOfBirth;
    final private int numberOfPosts;

    public ForumUser(int ID, String userName, char sex, LocalDate dateOfBirth, int numberOfPosts) {
        this.ID = ID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
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

    @Override
    public String toString() {
        return "ForumUser :" +
                "ID: " + ID +
                ", userName= ' " + userName + '\'' +
                ", sex: " + sex +
                ", dateOfBirth: " + dateOfBirth +
                ", numberOfPosts :" + numberOfPosts;
    }
}
