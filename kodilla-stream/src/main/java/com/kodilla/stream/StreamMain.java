package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> listOfForumUsers = forum.getUsersList().stream()
                .filter(forumUser -> forumUser.getMale() == 'm')
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getDays() > 20*365)
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdentificationNumber, forumUser -> forumUser));

        listOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " : "+entry.getValue())
                .forEach(System.out::printf);
    }
}