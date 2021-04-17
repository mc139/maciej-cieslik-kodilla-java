package com.kodilla.patterns.strategy.social.publishers;

import com.kodilla.patterns.strategy.social.publishers.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Snapchat post";
    }
}
