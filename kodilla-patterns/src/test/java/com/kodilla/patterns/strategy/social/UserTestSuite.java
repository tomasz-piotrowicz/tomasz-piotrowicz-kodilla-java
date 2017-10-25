package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User tommy = new Millenials("Tommy Rasmussen");
        User jim = new YGeneration("Jim Beam");
        User ross = new ZGeneration("Ros Geller");

        //When
        String tommyShare = tommy.sharePost();
        System.out.println(tommyShare);
        String jimShare = jim.sharePost();
        System.out.println(jimShare);
        String rossShare = ross.sharePost();
        System.out.println(rossShare);

        //Then
        Assert.assertEquals("[Facebook publisher] Share post on Facebook.", tommyShare);
        Assert.assertEquals("[Twitter publisher] Share post on Twitter.", jimShare);
        Assert.assertEquals("[Snapchat publisher] Share post on Snapchat.", rossShare);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User tommy = new Millenials("Tommy Rasmussen");

        //When
        String tommyShare = tommy.sharePost();
        System.out.println(tommyShare);
        tommy.setSocialPublisher(new SnapchatPublisher());
        tommyShare = tommy.sharePost();
        System.out.println("Tommy changed his mind: " + tommyShare);

        //Then
        Assert.assertEquals("[Snapchat publisher] Share post on Snapchat.", tommyShare);

    }
}
