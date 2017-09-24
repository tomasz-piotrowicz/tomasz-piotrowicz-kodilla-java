package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    int usersCount;
    int postsCount;
    int commentsCount;
    double averagePostsPerUser;
    double averageCommentsPerUser;

    public void calculateAdvStatistics(Statistics statistics){
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if(commentsCount == 0 || usersCount == 0){
            averageCommentsPerUser = 0.0;
        } else {
            averageCommentsPerUser = commentsCount / usersCount;
        }
        if(postsCount == 0 || usersCount == 0){
            averagePostsPerUser = 0.0;
        } else {
            averagePostsPerUser = postsCount / usersCount;
        }
    }

    Integer ShowStatistics(){
        return 0;}
}

