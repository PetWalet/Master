package com.example.account.api.request.transaction;

import com.example.account.db.entity.transaction.TransactionType;
import lombok.Data;

@Data
public class RemittanceRequest {
    private Long myAccountId;
    private Long receiverAccountId;
    private TransactionType transactionType; // 거래 타입
    private String password;
    private Long RemittanceAmount;
}
