package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    int identificationNumber;
    String userName;
    char male;
    LocalDate dateOfBirth;
    int numberOfPosts;

    public ForumUser(int identificationNumber, String userName, char male, LocalDate dateOfBirth, int numberOfPosts) {
        this.identificationNumber = identificationNumber;
        this.userName = userName;
        this.male = male;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public char getMale() {
        return male;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getIdentificationNumber() {
        return identificationNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identificationNumber=" + identificationNumber +
                ", userName='" + userName + '\'' +
                ", male=" + male +
                ", dateOfBirth=" + dateOfBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
