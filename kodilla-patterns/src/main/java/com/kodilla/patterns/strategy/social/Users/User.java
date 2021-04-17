package com.kodilla.patterns.strategy.social.Users;

import com.kodilla.patterns.strategy.social.publishers.SocialPublisher;

public class User {
    private final String userName;
    protected SocialPublisher socialPublisher;

    public String getUserName() {
        return userName;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public User(String userName) {
        this.userName = userName;
    }
}
