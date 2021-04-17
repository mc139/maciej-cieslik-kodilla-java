package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.Users.Millenials;
import com.kodilla.patterns.strategy.social.Users.User;
import com.kodilla.patterns.strategy.social.Users.YGeneration;
import com.kodilla.patterns.strategy.social.Users.ZGeneration;
import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //GIVEN

        User john = new Millenials("John");
        User mike = new ZGeneration("Mike");
        User patricia = new YGeneration("Patricia");

        //WHEN

        String johnPost = john.sharePost();
        System.out.println("john shared a " + johnPost);
        String mikePost = mike.sharePost();
        System.out.println("mike shared a " + mikePost);
        String patriciaPost = patricia.sharePost();
        System.out.println("patricia shared a " + patriciaPost);

        //THEN

        assertEquals("Twitter post", johnPost);
        assertEquals("Snapchat post", mikePost);
        assertEquals("Facebook post", patriciaPost);

    }

    @Test
    void testIndividualSharingStrategy() {

        //GIVEN

        User walter = new Millenials("Walter");

        //WHEN

        String walterPostNow = walter.sharePost();
        System.out.println("walter should share a " + walterPostNow);
        walter.setSocialPublisher(new FacebookPublisher());
        walterPostNow = walter.sharePost();
        System.out.println("walter now share a " + walterPostNow);

        //THEN
        assertEquals("Facebook post", walterPostNow);

    }
}
