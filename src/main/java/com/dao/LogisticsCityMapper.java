package com.dao;

import com.entity.LogisticsCity;
import java.util.List;

public interface LogisticsCityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics_city
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String cityid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics_city
     *
     * @mbg.generated
     */
    int insert(LogisticsCity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics_city
     *
     * @mbg.generated
     */
    LogisticsCity selectByPrimaryKey(String cityid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics_city
     *
     * @mbg.generated
     */
    List<LogisticsCity> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics_city
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LogisticsCity record);
}