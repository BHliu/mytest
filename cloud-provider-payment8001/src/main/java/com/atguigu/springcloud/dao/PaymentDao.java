package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author 刘波华
 * @Data 2021/2/27 11:51
 * @Description
 **/

@Mapper
public interface PaymentDao {
    int create(Payment peyment); //新建

    Payment getPaymentById(Long id);//读取
}
