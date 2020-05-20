package com.cl.service.impl;

import com.cl.dao.PaymentDao;
import com.cl.entity.Payment;
import com.cl.service.PaymentService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * @author clannad
 * @version 1.0
 * @date 2020/5/18 19:13
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao payMentDao;

    @Override
    public int create(Payment payMent) {
        return payMentDao.create(payMent);
    }

    @Override
    public Payment getPayment(Long id) {
        return payMentDao.getPayment(id);
    }
}
