package com.kodilla.testing.forum.statistics;
import org.junit.*;
import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    @Test //gdy liczba postów = 0,
    public void testCalculateAdvStatisticsWithMock() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        int postsCount = 0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        StatisticsCalculator calc1 = new StatisticsCalculator();
        //When
        calc1.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, calc1.averagePostsPerUser, 0.1);
        Assert.assertEquals(0.0, calc1.averageCommentsPerUser, 0.1);
    }

    @Test //gdy liczba postów = 1000
    public void testCalculateAdvStatisticsWithMock1(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        int postsCount = 1000;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(postsCount);

        StatisticsCalculator calc1 = new StatisticsCalculator();
        //When
        calc1.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, calc1.averagePostsPerUser, 0.1);
        Assert.assertEquals(0.0, calc1.averageCommentsPerUser, 0.1);
    }

    @Test //gdy liczba komentarzy = 0
    public void testCalculateAdvStatisticsWithMock2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        int commentsCount = 0;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);

        StatisticsCalculator calc1 = new StatisticsCalculator();
        //When
        calc1.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, calc1.averagePostsPerUser, 0.1);
        Assert.assertEquals(0.0, calc1.averageCommentsPerUser, 0.1);
    }

    @Test // gdy liczba komentarzy < liczba postów
    public void testCalculateAdvStatisticsWithMock3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        int commentsCount = 10;
        int postsCount = 50;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        StatisticsCalculator calc1 = new StatisticsCalculator();
        //When
        calc1.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, calc1.averagePostsPerUser, 0.1);
        Assert.assertEquals(0.0, calc1.averageCommentsPerUser, 0.1);
    }

    @Test // gdy liczba komentarzy > liczba postów
    public void testCalculateAdvStatisticsWithMock4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        int commentsCount = 200;
        int postsCount = 50;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        StatisticsCalculator calc1 = new StatisticsCalculator();
        //When
        calc1.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, calc1.averagePostsPerUser, 0.1);
        Assert.assertEquals(0.0, calc1.averageCommentsPerUser, 0.1);
    }

    @Test // gdy liczba użytkowników = 0
    public void testCalculateAdvStatisticsWithMock5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        when(statisticsMock.usersNames()).thenReturn(userNames);
        StatisticsCalculator calc1 = new StatisticsCalculator();
        //When
        calc1.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, calc1.averagePostsPerUser, 0.1);
        Assert.assertEquals(0.0, calc1.averageCommentsPerUser, 0.1);
    }

    @Test //gdy liczba użytkowników = 100
    public void testCalculateAdvStatisticsWithMock6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        for(int n = 0; n < 100; n++) {
            userNames.add("name" + n);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);

        StatisticsCalculator calc1 = new StatisticsCalculator();
        //When
        calc1.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0.0, calc1.averagePostsPerUser, 0.1);
        Assert.assertEquals(0.0, calc1.averageCommentsPerUser, 0.1);
    }

    @Test // mix danych
    public void testCalculateAdvStatisticsWithMock7() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = new ArrayList<String>();
        for(int n = 0; n < 10; n++) {
            userNames.add("name" + n);
        }
        int commentsCount = 200;
        int postsCount = 50;
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postsCount);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        StatisticsCalculator calc1 = new StatisticsCalculator();
        //When
        calc1.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(5.0, calc1.averagePostsPerUser, 0.1);
        Assert.assertEquals(20.0, calc1.averageCommentsPerUser, 0.1);

    }
}
