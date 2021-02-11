package com.kodilla.testing.user;

 public class SimpleUser {
     String username;
     String realName;

    public SimpleUser(String username,String realName) {
        this.username = username;
        this.realName = realName;
    }

     public String getRealName() {
         return realName;
     }

     public String getUsername() {
        return username;
    }
}
