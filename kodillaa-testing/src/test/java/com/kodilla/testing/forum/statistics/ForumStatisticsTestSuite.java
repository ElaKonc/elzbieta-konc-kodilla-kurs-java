package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private Statistics statisticsMock = mock(Statistics.class);
    private ForumStatistics forumStatistics;

    @Before
    public void setup() {
        forumStatistics = new ForumStatistics();
    }

    @Test
    public void testCalculateAdvStatisticsWhenUserNumb100() {
        List<String> listOfUSers = new ArrayList<>();
        for(int n=0; n<100; n++) {
            listOfUSers.add("Użtykownik " + (n+1));
        }
        when(statisticsMock.usersNames()).thenReturn(listOfUSers);

        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(100, forumStatistics.getUsersNumb());
        Assert.assertEquals(0, forumStatistics.getPostNumb());
        Assert.assertEquals(0, forumStatistics.getCommentsNumb());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsNumbOfPost(), 0);
        Assert.assertEquals(0, forumStatistics.getAverageCommentsNumbOfUser(), 0);
        Assert.assertEquals(0, forumStatistics.getAveragePostNumbOfUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenUserNumb0 () {
        //when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());

        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, forumStatistics.getUsersNumb());
        Assert.assertEquals(0, forumStatistics.getPostNumb());
        Assert.assertEquals(0, forumStatistics.getCommentsNumb());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsNumbOfPost(), 0);
        Assert.assertEquals(0, forumStatistics.getAverageCommentsNumbOfUser(), 0);
        Assert.assertEquals(0, forumStatistics.getAveragePostNumbOfUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenMoreCommentsThenPosts () {
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(20);

        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, forumStatistics.getUsersNumb());
        Assert.assertEquals(20, forumStatistics.getPostNumb());
        Assert.assertEquals(50, forumStatistics.getCommentsNumb());
        Assert.assertEquals(2.5, forumStatistics.getAverageCommentsNumbOfPost(), 0);
        Assert.assertEquals(0, forumStatistics.getAverageCommentsNumbOfUser(), 0);
        Assert.assertEquals(0, forumStatistics.getAveragePostNumbOfUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenMorePostsThenComments () {
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(20);

        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, forumStatistics.getUsersNumb());
        Assert.assertEquals(20, forumStatistics.getPostNumb());
        Assert.assertEquals(10, forumStatistics.getCommentsNumb());
        Assert.assertEquals(0.5, forumStatistics.getAverageCommentsNumbOfPost(), 0);
        Assert.assertEquals(0, forumStatistics.getAverageCommentsNumbOfUser(), 0);
        Assert.assertEquals(0, forumStatistics.getAveragePostNumbOfUser(), 0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenPostsNumb1000() {
        when(statisticsMock.postsCount()).thenReturn(1000);

        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(0, forumStatistics.getUsersNumb());
        Assert.assertEquals(1000, forumStatistics.getPostNumb());
        Assert.assertEquals(0, forumStatistics.getCommentsNumb());
        Assert.assertEquals(0, forumStatistics.getAverageCommentsNumbOfPost(), 0);
        Assert.assertEquals(0, forumStatistics.getAverageCommentsNumbOfUser(), 0);
        Assert.assertEquals(0, forumStatistics.getAveragePostNumbOfUser(), 0);
    }

    @Test
    public void testCalculateAllAdvStatistics () {
        List<String> listOfUSers = new ArrayList<>();
        for(int n=0; n<10; n++) {
            listOfUSers.add("Użtykownik " + (n+1));
        }
        when(statisticsMock.usersNames()).thenReturn(listOfUSers);
        when(statisticsMock.commentsCount()).thenReturn(40);
        when(statisticsMock.postsCount()).thenReturn(20);

        forumStatistics.calculateAdvStatistics(statisticsMock);

        Assert.assertEquals(10, forumStatistics.getUsersNumb());
        Assert.assertEquals(20, forumStatistics.getPostNumb());
        Assert.assertEquals(40, forumStatistics.getCommentsNumb());
        Assert.assertEquals(2, forumStatistics.getAverageCommentsNumbOfPost(), 0);
        Assert.assertEquals(4, forumStatistics.getAverageCommentsNumbOfUser(), 0);
        Assert.assertEquals(2, forumStatistics.getAveragePostNumbOfUser(), 0);
    }
}
