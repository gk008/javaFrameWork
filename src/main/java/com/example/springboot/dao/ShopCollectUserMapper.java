package com.example.springboot.dao;

import com.example.springboot.entity.ShopCollectUser;
import com.example.springboot.entity.ShopCollectUserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ShopCollectUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_collect_user
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    long countByExample(ShopCollectUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_collect_user
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    int deleteByExample(ShopCollectUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_collect_user
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_collect_user
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    int insert(ShopCollectUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_collect_user
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    int insertSelective(ShopCollectUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_collect_user
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    List<ShopCollectUser> selectByExample(ShopCollectUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_collect_user
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    ShopCollectUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_collect_user
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    int updateByExampleSelective(@Param("record") ShopCollectUser record, @Param("example") ShopCollectUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_collect_user
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    int updateByExample(@Param("record") ShopCollectUser record, @Param("example") ShopCollectUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_collect_user
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    int updateByPrimaryKeySelective(ShopCollectUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shop_collect_user
     *
     * @mbg.generated Mon Jun 17 18:53:32 GMT+08:00 2019
     */
    int updateByPrimaryKey(ShopCollectUser record);
}