package com.database.util;

public class showuser {
    public static void main(){
        userinfo user = new userinfo();
        user.setPasswd("111111");
        user.setUser("test");
        System.out.println(user.getUser()+user.getPasswd());
    }
}
