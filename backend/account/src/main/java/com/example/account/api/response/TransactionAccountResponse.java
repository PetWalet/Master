package com.example.account.api.response;

import com.example.account.db.entity.Account;
import lombok.Data;

@Data
public class TransactionAccountResponse {
    private String accountName;
    private String accountNumber;
    private Long balance;

    public TransactionAccountResponse(Account account) {
        this.accountName = account.getAccountName();
        this.accountNumber = account.getAccountNumber();
        this.balance = account.getBalance();
    }
}
