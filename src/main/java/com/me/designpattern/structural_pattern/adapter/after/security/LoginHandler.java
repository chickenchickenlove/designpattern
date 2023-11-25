package com.me.designpattern.structural_pattern.adapter.after.security;

// 외부 라이브러리로 제공되는 서비스임. 제공해주는 서비스임. (내가 수정할 수 없는 코드)
// LoginHandler를 이용해서 Login 하는 기능을 구현해보고 싶음.
// LoginHandler (클라이언트) 코드는 Target 인터페이스로 userDetailService를 가짐.
// AccountService는 내 로컬에서 userDetailService와 비슷한 역할을 함.
// UserDetailService는 User정보를 UserDetails로 찾아오고, AccountSerivce는 Account를 찾아옴.
public class LoginHandler {

    UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUsername();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
