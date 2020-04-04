package com.kodilla.stream.beautifier;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        /*PoemBeautifier exampleText = new PoemBeautifier();
        String normalText = "tekst z dodatkami";
        System.out.println(normalText + "\n");
        String beautifulText1 = exampleText.beautify(normalText, text -> "ABC " + normalText + " ABC");
        System.out.println(beautifulText1);
        String beautifulText2 = exampleText.beautify(normalText, text -> text.toUpperCase());
        System.out.println(beautifulText2);
        String beautifulText3 = exampleText.beautify(normalText, text -> text.toLowerCase());
        System.out.println(beautifulText3);
        String beautifulText4 = exampleText.beautify(normalText, text -> text.replace("t", "*"));
        System.out.println(beautifulText4);
        String beautifulText5 = exampleText.beautify(normalText, text -> text.replace(" ", "/"));
        System.out.println(beautifulText5);*/


        ForumUser user1 = new ForumUser(1, "Tomek", 'M', LocalDate.of(1990,1,1), 5);
        ForumUser user2 = new ForumUser(2, "Adam", 'M', LocalDate.of(1990,1,5), 0);
        ForumUser user3 = new ForumUser(3, "Kasia", 'K', LocalDate.of(1990,2,5), 2);
        ForumUser user4 = new ForumUser(4, "Jan", 'M', LocalDate.of(2005,2,5), 2);

        Forum forum = new Forum();
        forum.addUser(user1);
        forum.addUser(user2);
        forum.addUser(user3);
        forum.addUser(user4);

        Map<Integer, ForumUser> mapOfUser = forum.getUserList().stream().filter(u -> u.getSex() == 'M').filter(u -> {
            LocalDate dateOfBirth = u.getDateOfBirth() ;
            LocalDate today = LocalDate.now();
            return Period.between(dateOfBirth, today).getYears() > 20;
        }).filter(u -> u.getNumberOfPosts() > 0).collect(Collectors.toMap(ForumUser::getId, u -> u));

        System.out.println(mapOfUser);
    }
}
