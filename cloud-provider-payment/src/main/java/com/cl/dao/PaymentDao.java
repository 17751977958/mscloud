package com.cl.dao;


import com.cl.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public int create(Payment payMent);


    public Payment getPayment(@Param("id") Long id);


}
