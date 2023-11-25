package com.me.designpattern.structural_pattern.adapter.after;

import com.me.designpattern.structural_pattern.adapter.after.security.UserDetails;
import com.me.designpattern.structural_pattern.adapter.after.security.UserDetailsService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountUserDetailsService implements UserDetailsService {

    private final AccountService accountService;

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
