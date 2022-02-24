package com.smartrm.smartrmpayment.payment.application.dto;

import com.smartrm.smartrmpayment.payment.domain.OrderInfo;
import com.smartrm.smartrmpayment.payment.domain.PaymentState;
import com.smartrm.smartrmpayment.payment.domain.PaymentType;

/**
 * @author: liuyuancheng
 * @description:
 */
public class PaymentStateChangeDto {
  private Long paymentId;
  private PaymentType type;
  private OrderInfo orderInfo;
  private PaymentState preState;
  private PaymentState curState;
  private Long time;

  public Long getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(Long paymentId) {
    this.paymentId = paymentId;
  }

  public PaymentType getType() {
    return type;
  }

  public void setType(PaymentType type) {
    this.type = type;
  }

  public OrderInfo getOrderInfo() {
    return orderInfo;
  }

  public void setOrderInfo(OrderInfo orderInfo) {
    this.orderInfo = orderInfo;
  }

  public PaymentState getPreState() {
    return preState;
  }

  public void setPreState(PaymentState preState) {
    this.preState = preState;
  }

  public PaymentState getCurState() {
    return curState;
  }

  public void setCurState(PaymentState curState) {
    this.curState = curState;
  }

  public Long getTime() {
    return time;
  }

  public void setTime(Long time) {
    this.time = time;
  }
}
