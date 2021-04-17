package com.kodilla.patterns.strategy.social.Users;

import com.kodilla.patterns.strategy.social.publishers.TwitterPublisher;

public class Millenials extends User {
    public Millenials(String userName) {
        super(userName);
        this.socialPublisher = new TwitterPublisher();
    }
}
