package com.dao;

import com.entity.LogisticsDeliveryreceipt;
import java.util.List;

public interface LogisticsDeliveryreceiptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics_deliveryreceipt
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String deliveryreceiptid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics_deliveryreceipt
     *
     * @mbg.generated
     */
    int insert(LogisticsDeliveryreceipt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics_deliveryreceipt
     *
     * @mbg.generated
     */
    LogisticsDeliveryreceipt selectByPrimaryKey(String deliveryreceiptid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics_deliveryreceipt
     *
     * @mbg.generated
     */
    List<LogisticsDeliveryreceipt> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics_deliveryreceipt
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LogisticsDeliveryreceipt record);
}