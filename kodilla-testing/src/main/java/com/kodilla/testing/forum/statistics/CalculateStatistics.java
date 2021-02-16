package com.kodilla.testing.forum.statistics;


import java.util.List;

public class CalculateStatistics {

    private List<String> userNames;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public CalculateStatistics(Statistics statistics) {
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        averageNumberOfPostsPerUser = calcAveragePostPerUser();
        averageNumberOfCommentsPerUser = calcAverageCommentPerUser();
        averageNumberOfCommentsPerPost = calcAverageCommentsPerPost();
    }

    public List<String> getUserNames() {
        return userNames;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double calcAveragePostPerUser() {
        if (numberOfPosts > 0 && numberOfUsers > 0) {
            return numberOfPosts / (double) numberOfUsers;
        } else {
            return 0;
        }
    }

    public double calcAverageCommentPerUser() {
        if (numberOfComments > 0 && numberOfUsers > 0) {
            return numberOfComments / (double) numberOfUsers;
        } else {
            return 0;
        }
    }

    public double calcAverageCommentsPerPost() {
        if (numberOfComments > 0 && numberOfPosts > 0) {
            double average = 0;
            if (numberOfPosts > numberOfComments) {
                average = numberOfComments / (double) numberOfPosts;
            }
            if (numberOfPosts < numberOfComments) {
                average = numberOfPosts / (double) numberOfComments;
            }
            return average;
        } else {
            return 0;
        }
    }

    public void showStatistics() {
        System.out.println(averageNumberOfPostsPerUser);
        System.out.println(averageNumberOfCommentsPerUser);
        System.out.println(averageNumberOfCommentsPerPost);
        System.out.println(numberOfUsers);
        System.out.println(numberOfComments);
        System.out.println(numberOfPosts);
    }
}
