package day3.remote;

import java.util.List;

public class SimpleObject {

    private AccountService accountService;

    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }


    public List<Account> call() {
        return accountService.getAccounts("rtyyt");
    }

    public void insert() {
        accountService.insertAccount(new Account());
    }

}