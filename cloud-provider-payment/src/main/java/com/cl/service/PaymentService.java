package com.cl.service;

import com.cl.entity.Payment;


public interface PaymentService {
    public int create(Payment payMent);


    public Payment getPayment(Long id);
}
