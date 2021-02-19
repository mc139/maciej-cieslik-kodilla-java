package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    public static List<ForumUser> getUserList() {
        final List<ForumUser> forumUserList = new ArrayList<>();
        ForumUser user1 = new ForumUser(884100,"confidentuser",'M', LocalDate.of(1990,02,21),6);
        ForumUser user2 = new ForumUser(884101,"noruser",'F', LocalDate.of(1999,03,21),602);
        ForumUser user3 = new ForumUser(884102,"widelyuser",'F', LocalDate.of(2001,12,21),100);
        ForumUser user4 = new ForumUser(884103,"serbaseball",'M', LocalDate.of(2002,02,21),0);
        ForumUser user5 = new ForumUser(884104,"selfuser",'M', LocalDate.of(1986,10,21),16);
        ForumUser user6 = new ForumUser(884105,"usergeezer",'F', LocalDate.of(1970,11,21),44);
        ForumUser user7 = new ForumUser(884106,"tshirtuser",'M', LocalDate.of(1994,05,21),90);
        ForumUser user8 = new ForumUser(884107,"userboss",'M', LocalDate.of(1993,04,21),1623);
        ForumUser user9 = new ForumUser(884108,"rainbowuser",'F', LocalDate.of(1992,02,21),9902);
        ForumUser user10 = new ForumUser(884109,"elderyuser",'M', LocalDate.of(1950,02,21),23123);

        forumUserList.add(user1);
        forumUserList.add(user2);
        forumUserList.add(user3);
        forumUserList.add(user4);
        forumUserList.add(user5);
        forumUserList.add(user6);
        forumUserList.add(user7);
        forumUserList.add(user8);
        forumUserList.add(user9);
        forumUserList.add(user10);

        return forumUserList;
    }

}
