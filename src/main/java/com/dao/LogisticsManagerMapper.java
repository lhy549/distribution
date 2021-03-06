package com.dao;

import com.entity.LogisticsManager;
import java.util.List;

public interface LogisticsManagerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics_manager
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String mgid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics_manager
     *
     * @mbg.generated
     */
    int insert(LogisticsManager record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics_manager
     *
     * @mbg.generated
     */
    LogisticsManager selectByPrimaryKey(String mgid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics_manager
     *
     * @mbg.generated
     */
    List<LogisticsManager> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table logistics_manager
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LogisticsManager record);
}