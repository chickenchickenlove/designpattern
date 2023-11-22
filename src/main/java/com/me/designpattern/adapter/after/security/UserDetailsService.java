package com.me.designpattern.adapter.after.security;

// 외부 라이브러리로 제공되는 서비스임. 제공해주는 서비스임. (내가 수정할 수 없는 코드)
// 타겟 인터페이스임.
public interface UserDetailsService {

    UserDetails loadUser(String username);

}
