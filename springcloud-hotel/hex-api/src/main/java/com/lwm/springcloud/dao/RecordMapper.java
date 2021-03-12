package com.lwm.springcloud.dao;

import com.lwm.springcloud.entities.*;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbggenerated
     */
    int countByExample(RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbggenerated
     */
    int deleteByExample(RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(RecordKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbggenerated
     */
    int insert(Record record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbggenerated
     */
    int insertSelective(Record record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbggenerated
     */
    List<Record> selectByExampleWithBLOBs(RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbggenerated
     */
    List<Record> selectByExample(RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbggenerated
     */
    Record selectByPrimaryKey(RecordKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Record record, @Param("example") RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Record record, @Param("example") RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Record record, @Param("example") RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Record record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Record record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table record
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Record record);
}