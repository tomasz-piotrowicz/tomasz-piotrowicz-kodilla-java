package com.kodilla.stream;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {
        Forum forumUsersList = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = forumUsersList.getUserList().stream()
                .filter(ForumUser -> ForumUser.getSex() == 'M')
                .filter(ForumUser -> ForumUser.getBirthdate().getYear() < 1997)
                .filter(ForumUser -> ForumUser.getPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser -> ForumUser));

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
        }
}
