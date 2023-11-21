package com.me.designpattern.adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
