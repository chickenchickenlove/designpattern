package com.me.designpattern.adapter.after;

// 내 로컬에 있는 코드지만, 수정할 수 없는 경우
public class AccountService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

}
