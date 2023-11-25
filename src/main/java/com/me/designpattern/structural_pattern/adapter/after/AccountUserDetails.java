package com.me.designpattern.structural_pattern.adapter.after;

import com.me.designpattern.structural_pattern.adapter.after.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    private final Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
