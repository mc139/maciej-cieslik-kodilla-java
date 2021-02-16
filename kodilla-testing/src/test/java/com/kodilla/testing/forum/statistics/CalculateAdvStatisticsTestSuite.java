package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    void beforeMethod() {
        statisticsMock = mock(Statistics.class);
    }

    public List<String> generateListOfUsers(int numberOfUsersToAdd) {
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < numberOfUsersToAdd; i++) {
            userNames.add("TEST USER");
        }
        return userNames;
    }

    @Test
    void testCalculateAdvStatisticsTestSuiteWith0Posts() {
        //GIVEN
        List<String> userNames = generateListOfUsers(5);
        CalculateStatistics forumStatisticsWithZeroPosts = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(30);

        //WHEN
        forumStatisticsWithZeroPosts.calculateAdvStatistics(statisticsMock);

        //THEN
        assertEquals(6, forumStatisticsWithZeroPosts.calcAverageCommentPerUser());
        assertEquals(0, forumStatisticsWithZeroPosts.calcAveragePostPerUser());
        assertEquals(0, forumStatisticsWithZeroPosts.calcAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsTestSuiteWith1000Posts() {
        //GIVEN
        List<String> userNames = generateListOfUsers(5);
        CalculateStatistics forumStatisticsWithThousandPosts = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(30);

        //WHEN
        forumStatisticsWithThousandPosts.calculateAdvStatistics(statisticsMock);

        //THEN
        assertEquals(6, forumStatisticsWithThousandPosts.calcAverageCommentPerUser());
        assertEquals(200, forumStatisticsWithThousandPosts.calcAveragePostPerUser());
        assertEquals(0.03, forumStatisticsWithThousandPosts.calcAverageCommentsPerPost(),0.01);
    }

    @Test
    void testCalculateAdvStatisticsTestSuiteWith0Comments() {
        //GIVEN
        List<String> userNames = generateListOfUsers(5);
        CalculateStatistics forumStatisticsWithZeroComments = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //WHEN
        forumStatisticsWithZeroComments.calculateAdvStatistics(statisticsMock);

        //THEN
        assertEquals(0, forumStatisticsWithZeroComments.calcAverageCommentPerUser());
        assertEquals(200, forumStatisticsWithZeroComments.calcAveragePostPerUser());
        assertEquals(0, forumStatisticsWithZeroComments.calcAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsTestSuiteWithMorePostsThenComments() {
        //GIVEN
        List<String> userNames = generateListOfUsers(5);
        CalculateStatistics forumStatisticsWithMorePostsThenComments = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //WHEN
        forumStatisticsWithMorePostsThenComments.calculateAdvStatistics(statisticsMock);

        //THEN
        assertEquals(20, forumStatisticsWithMorePostsThenComments.calcAverageCommentPerUser());
        assertEquals(200, forumStatisticsWithMorePostsThenComments.calcAveragePostPerUser());
        assertEquals(0.1, forumStatisticsWithMorePostsThenComments.calcAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsTestSuiteWithMoreCommentsThenPosts() {
        //GIVEN
        List<String> userNames = generateListOfUsers(5);
        CalculateStatistics forumStatisticsWithMoreCommentsThenPosts = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //WHEN
        forumStatisticsWithMoreCommentsThenPosts.calculateAdvStatistics(statisticsMock);

        //THEN
        assertEquals(200, forumStatisticsWithMoreCommentsThenPosts.calcAverageCommentPerUser());
        assertEquals(20, forumStatisticsWithMoreCommentsThenPosts.calcAveragePostPerUser());
        assertEquals(0.1, forumStatisticsWithMoreCommentsThenPosts.calcAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsTestSuiteWith0Users() {
        //GIVEN
        List<String> userNames = generateListOfUsers(0);
        CalculateStatistics forumStatisticsWithZeroUsers = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //WHEN
        forumStatisticsWithZeroUsers.calculateAdvStatistics(statisticsMock);

        //THEN
        assertEquals(0, forumStatisticsWithZeroUsers.calcAverageCommentPerUser());
        assertEquals(0, forumStatisticsWithZeroUsers.calcAveragePostPerUser());
        assertEquals(0.1, forumStatisticsWithZeroUsers.calcAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsTestSuiteWith100Users() {
        //GIVEN
        List<String> userNames = generateListOfUsers(100);
        CalculateStatistics forumStatisticsWithHundred = new CalculateStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //WHEN
        forumStatisticsWithHundred.calculateAdvStatistics(statisticsMock);

        //THEN
        assertEquals(10, forumStatisticsWithHundred.calcAverageCommentPerUser());
        assertEquals(1, forumStatisticsWithHundred.calcAveragePostPerUser());
        assertEquals(0.1, forumStatisticsWithHundred.calcAverageCommentsPerPost());
    }
}
