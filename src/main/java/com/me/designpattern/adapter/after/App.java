package com.me.designpattern.adapter.after;

import com.me.designpattern.adapter.after.security.LoginHandler;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        AccountUserDetailsService accountUserDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(accountUserDetailsService);

        String login = loginHandler.login("hello", "hello");
        System.out.println("login = " + login);
    }
}
