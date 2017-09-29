package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "Johnny", 'M', 1988, 04, 28, 0));
        userList.add(new ForumUser(2, "mike1", 'M', 1994, 01, 21, 140));
        userList.add(new ForumUser(3, "nat88", 'F', 2001, 07,03, 35));
        userList.add(new ForumUser(4, "Suzy1", 'F', 1989, 06, 28, 0));
        userList.add(new ForumUser(5, "Freddy", 'M', 2006, 03, 26, 204));
        userList.add(new ForumUser(6, "Kendra", 'F', 1990, 05,13, 148));
        userList.add(new ForumUser(7, "sandra9", 'F', 1998, 04,12, 0));
        userList.add(new ForumUser(8, "Drake", 'M', 2000, 02, 20, 270));
        userList.add(new ForumUser(9, "KIm", 'M', 1984, 05, 27, 57));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
