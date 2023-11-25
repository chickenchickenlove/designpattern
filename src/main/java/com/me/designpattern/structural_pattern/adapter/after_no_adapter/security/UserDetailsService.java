package com.me.designpattern.structural_pattern.adapter.after_no_adapter.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
