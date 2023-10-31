package com.example.account.common.api.exception;

import com.example.account.common.api.status.FailCode;
import lombok.Getter;

@Getter
public class InsufficientBalanceException extends RuntimeException{
    private final FailCode failCode;

    public InsufficientBalanceException(FailCode failCode) {
        super(failCode.getMessage());
        this.failCode = failCode;
    }

}
