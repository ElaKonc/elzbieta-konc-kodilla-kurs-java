package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> users = new ArrayList<>();

    public void addUser(ForumUser user){
        users.add(user);
    }

    public List<ForumUser> getUserList() {
        return users;
    }
}
