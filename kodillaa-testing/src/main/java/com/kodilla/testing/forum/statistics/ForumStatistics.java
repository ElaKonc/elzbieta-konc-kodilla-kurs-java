package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersNumb;
    private int postNumb;
    private int commentsNumb;
    private double averagePostNumbOfUser;
    private double averageCommentsNumbOfUser;
    private double averageCommentsNumbOfPost;

    public int getUsersNumb() {
        return usersNumb;
    }

    public int getPostNumb() {
        return postNumb;
    }

    public int getCommentsNumb() {
        return commentsNumb;
    }

    public double getAveragePostNumbOfUser() {
        return averagePostNumbOfUser;
    }

    public double getAverageCommentsNumbOfUser() {
        return averageCommentsNumbOfUser;
    }

    public double getAverageCommentsNumbOfPost() {
        return averageCommentsNumbOfPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersNumb = statistics.usersNames().size();
        postNumb = statistics.postsCount();
        commentsNumb = statistics.commentsCount();
        averagePostNumbOfUser = calcAveragePostNumbOfUser();
        averageCommentsNumbOfUser = calcAverageCommentsNumbOfUser();
        averageCommentsNumbOfPost = calcAverageCommentsNumbOfPost();
    }

    private double calcAveragePostNumbOfUser() {
        if(usersNumb >0) {
            return (double) postNumb/usersNumb;
        }
        return 0;
    }

    private double calcAverageCommentsNumbOfUser() {
        if(usersNumb >0) {
            return (double) commentsNumb/usersNumb;
        }
        return 0;
    }

    private double calcAverageCommentsNumbOfPost() {
        if(postNumb >0) {
            return (double) commentsNumb/postNumb;
        }
        return 0;
    }

    public void showStatistics() {
        System.out.println("Statystyki forum: ");
        System.out.println("Ilość użytkowników: " + usersNumb);
        System.out.println("Ilość postów:" + postNumb);
        System.out.println("Ilość komentarzy: " + commentsNumb);
        System.out.println("Średnia ilość postów na jednego użytkownika: " + averagePostNumbOfUser);
        System.out.println("Średnia ilość komentarzy na jednego użytkownika: " + averageCommentsNumbOfUser);
        System.out.println("Średnia ilość komentarzy na jednen post: " + averageCommentsNumbOfPost);
    }
}
