package com.kodilla.patterns.strategy.social.Users;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;

public class YGeneration extends User {
    public YGeneration(String userName) {
        super(userName);
        this.socialPublisher = new FacebookPublisher();
    }
}
