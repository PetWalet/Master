package com.ssafy.account.api.response.payment;

import lombok.Data;

@Data
public class PaymentInfoResponse {
    private String name;
    private String businessType;
    private String address;
    private String date;
    private Long paymentId;

    public PaymentInfoResponse(String name, String businessType, String address, String date, Long paymentId) {
        this.name = name;
        this.businessType = businessType;
        this.address = address;
        this.date = date;
        this.paymentId = paymentId;
    }
}
