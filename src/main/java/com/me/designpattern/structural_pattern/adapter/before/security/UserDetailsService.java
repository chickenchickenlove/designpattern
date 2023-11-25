package com.me.designpattern.structural_pattern.adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
