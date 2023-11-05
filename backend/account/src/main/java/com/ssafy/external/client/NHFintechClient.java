package com.ssafy.external.client;

import com.ssafy.account.config.ClientProxyConfig;
import com.ssafy.external.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "http://smartdev.nonghyup.com:9460/svcapi" , name = "Server1" , configuration = ClientProxyConfig.class)
public interface NHFintechClient {
    @PostMapping(value = "/OpenFinAccountARS.nhd" , headers = "ApiNm=OpenFinAccountARS")
    OpenFinAccountARSDto.Response OpenFinAccountARS(@RequestBody OpenFinAccountARSDto.Request request);

    @PostMapping(value = "/CheckOpenFinAccount.nhd" , headers = "ApiNm=CheckOpenFinAccount")
    CheckOpenFinAccountDto.Response CheckOpenFinAccount(@RequestBody CheckOpenFinAccountDto.Request request);

    @PostMapping(value = "/CloseFinAccount.nhd" , headers = "ApiNm=CloseFinAccount")
    void CloseFinAccount(@RequestBody FinAccountDto.Request request);

    @PostMapping(value = "/InquireFinAccountStatus.nhd" , headers = "ApiNm=InquireFinAccountStatus")
    FinAccountDto.Response InquireFinAccountStatus(@RequestBody FinAccountDto.Request request);

    @PostMapping(value = "/DrawingTransfer2.nhd" , headers = "ApiNm=DrawingTransfer2")
    void DrawingTransfer2(@RequestBody DrawingTransfer2Dto.Request request);

    @PostMapping(value = "/CheckOnDrawingTransfer2.nhd" , headers = "ApiNm=CheckOnDrawingTransfer2")
    CheckOnDrawingTransfer2Dto.Response CheckOnDrawingTransfer2(@RequestBody CheckOnDrawingTransfer2Dto.Request request);

    @PostMapping(value = "/ReceivedTransferFinAccount.nhd" , headers = "ApiNm=ReceivedTransferFinAccount")
    void ReceivedTransferFinAccount(@RequestBody ReceivedTransferFinAccountDto.Request request);

    @PostMapping(value = "/CheckOnReceivedTransfer.nhd" , headers = "ApiNm=CheckOnReceivedTransfer")
    CheckOnReceivedTransferDto.Response CheckOnReceivedTransfer(@RequestBody CheckOnReceivedTransferDto.Request request);

    @PostMapping(value = "/CheckDepositorFinAccount.nhd" , headers = "ApiNm=CheckDepositorFinAccount")
    CheckDepositorFinAccountDto.Response CheckDepositorFinAccount(@RequestBody CheckDepositorFinAccountDto.Request request);

    @PostMapping(value = "/InquireDepositorFinAccount.nhd" , headers = "ApiNm=InquireDepositorFinAccount")
    InquireDepositorFinAccountDto.Response InquireDepositorFinAccount(@RequestBody InquireDepositorFinAccountDto.Request request);



    @PostMapping(value = "/InquireTransactionHistory.nhd" , headers = "ApiNm=InquireTransactionHistory")
    void InquireTransactionHistory();

    @PostMapping(value = "/InquireBalance.nhd" , headers = "ApiNm=InquireBalance")
    String InquireBalance();

    @PostMapping(value = "/P2PNVirtualAccountNumberRequest.nhd" , headers = "ApiNm=P2PNVirtualAccountNumberRequest")
    String P2PNVirtualAccountNumberRequest();

    @PostMapping(value = "/P2PNVirtualAccountTerminate.nhd" , headers = "ApiNm=P2PNVirtualAccountTerminate")
    String P2PNVirtualAccountTerminate();
}
