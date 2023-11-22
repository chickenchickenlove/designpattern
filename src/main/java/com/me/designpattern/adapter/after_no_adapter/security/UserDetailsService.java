package com.me.designpattern.adapter.after_no_adapter.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
