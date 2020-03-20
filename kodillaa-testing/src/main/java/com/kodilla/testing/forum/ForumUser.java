package com.kodilla.testing.forum;

import java.util.*;

public class ForumUser {

    private String nick;
    private String realName;
    private List<ForumPost> posts = new ArrayList<ForumPost>();
    private List<ForumComment> comments = new LinkedList<ForumComment>();

    public ForumUser(String nick, String realName) {
        this.nick = nick;
        this.realName = realName;
    }

    public void addPost(String author, String postBody) {
    }

    public void addComment(ForumPost thePost, String author, String commentBody) {
    }

    public int getPostsQuantity() {
        return 100;
    }

    public int getCommentsQuantity() {
        return 100;
    }

    public ForumPost getPost(int postNumber) {
        return null;
    }

    public ForumComment getComment(int commentNumber) {
        return null;
    }

    public boolean removePost(ForumPost thePost) {
        return true;
    }

    public boolean removeComment(ForumComment theComment) {
        return true;
    }
}
