package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate birthdate;
    private final int posts;

    public ForumUser(final int userId, final String username, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int posts) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.birthdate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.posts = posts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", posts=" + posts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumUser forumUser = (ForumUser) o;

        if (userId != forumUser.userId) return false;
        if (sex != forumUser.sex) return false;
        if (posts != forumUser.posts) return false;
        if (!username.equals(forumUser.username)) return false;
        return birthdate.equals(forumUser.birthdate);
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + username.hashCode();
        result = 31 * result + (int) sex;
        result = 31 * result + birthdate.hashCode();
        result = 31 * result + posts;
        return result;
    }
}

