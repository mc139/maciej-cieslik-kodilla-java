package com.kodilla.exception.nullpointer;

public class MessageSender {

    public void sendMessageTo(User user, String massage) throws MessageNotSentException {
        if (user != null) {
            System.out.println("Sending message: " + massage + "to:" + user.getName());
        } else {
            throw new MessageNotSentException("Object User was null");
        }
    }
}