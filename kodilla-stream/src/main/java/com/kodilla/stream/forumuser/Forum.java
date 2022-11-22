package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    List<ForumUser> listOfForumUsers = new ArrayList<>();

    public Forum(){

        listOfForumUsers.add(new ForumUser(1, "Mateusz", 'm', LocalDate.of(1990, 8, 14), 0));
        listOfForumUsers.add(new ForumUser(2, "Olga", 'f', LocalDate.of(1990, 4, 10), 20));
        listOfForumUsers.add(new ForumUser(3, "Nina", 'f', LocalDate.of(2000, 1, 20), 30));
        listOfForumUsers.add(new ForumUser(4, "Krzysztof", 'm', LocalDate.of(1966, 3, 13), 4));
        listOfForumUsers.add(new ForumUser(5, "Anna", 'f', LocalDate.of(1500, 12, 5), 3000));

    }

    public List<ForumUser> getUsersList(){

        return new ArrayList<>(listOfForumUsers);
    }


}
