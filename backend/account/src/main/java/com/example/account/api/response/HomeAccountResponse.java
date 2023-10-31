package com.example.account.api.response;

import com.example.account.db.entity.Account;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class HomeAccountResponse { // 홈 화면의 계좌 정보를 나타내기 위한 DTO
    private String accountName;
    private String accountNumber;
    private Long balance;
    private List<HomeTransactionResponse> transactions;

    public HomeAccountResponse(Account account, List<HomeTransactionResponse> transactions) {
        this.accountName = account.getAccountName();
        this.accountNumber = account.getAccountNumber();
        this.balance = account.getBalance();
        this.transactions = new ArrayList<>(transactions);
    }
}
