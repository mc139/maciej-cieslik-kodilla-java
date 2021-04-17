package com.kodilla.patterns.strategy.social.publishers;

import com.kodilla.patterns.strategy.social.publishers.SocialPublisher;

public class FacebookPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Facebook post";
    }
}
