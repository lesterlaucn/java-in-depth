package com.smartrm.smartrmtrade.trade.application.dto;

/**
 * @author: liuyuancheng
 * @description:
 */
public class PaymentQrCodeDto {

  private long paymentId;
  private String codeUrl;

  public PaymentQrCodeDto(long paymentId, String codeUrl) {
    this.paymentId = paymentId;
    this.codeUrl = codeUrl;
  }

  public PaymentQrCodeDto() {
    
  }

  public String getCodeUrl() {
    return codeUrl;
  }

  public void setCodeUrl(String codeUrl) {
    this.codeUrl = codeUrl;
  }

  public long getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(long paymentId) {
    this.paymentId = paymentId;
  }
}
