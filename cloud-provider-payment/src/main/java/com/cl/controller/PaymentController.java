package com.cl.controller;

import com.cl.entity.CommonResult;
import com.cl.entity.Payment;
import com.cl.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author clannad
 * @version 1.0
 * @date 2020/5/18 19:16
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*****结果" + result);
        if (result > 0) {
            return new CommonResult(200, "插入成功", result);
        } else {
            return new CommonResult(200, "插入失败", null);
        }

    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPayment(id);
        log.info("*****结果" + payment+"O(∩_∩)O");
        if (payment != null) {
            return new CommonResult(200, "查询成功", payment);
        } else {
            return new CommonResult(200, "查询失败,没有对应数据", null);
        }



}
}
