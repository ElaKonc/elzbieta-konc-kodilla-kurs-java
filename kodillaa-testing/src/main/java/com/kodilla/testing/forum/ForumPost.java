package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumPost {

    String userNick;
    String author;

    public ForumPost(String userNick, String author) {
        this.userNick = userNick;
        this.author = author;
    }

    public String getUserNick() {
        return userNick;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumPost forumPost = (ForumPost) o;

        if (!userNick.equals(forumPost.userNick)) return false;
        return author.equals(forumPost.author);
    }

    @Override
    public int hashCode() {
        int result = userNick.hashCode();
        result = 31 * result + author.hashCode();
        return result;
    }
}
