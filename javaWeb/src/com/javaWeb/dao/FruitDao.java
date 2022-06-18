package com.javaWeb.dao;

import com.javaWeb.pojo.Fruit;

import java.sql.Connection;
import java.util.List;

/**
 * @Author wzc
 * @Date 2022/5/29
 */
public interface FruitDao {

    /**
     * 创建fruit
     * @param connection
     * @param fruit
     */
    int createFruit(Connection connection, Fruit fruit);

    /**
     * 删除用户
     * @param connection
     * @param fruit
     */
    int deleteFruit(Connection connection, Fruit fruit);

    /**
     * 更新用户
     * @param connection
     * @param fruit
     */
    int updateFruit(Connection connection, Fruit fruit);

    /**
     * 查询单个用户
     * @param connection
     * @param fruit
     * @return
     */
    Fruit getOneFruit(Connection connection, Fruit fruit);

    /**
     * 批量查询用户
     * @param connection
     * @return
     */
    List<Fruit> getAllFruit(Connection connection);

    /**
     * 分页查询
     * @param connection
     * @param pageNo
     * @return
     */
    List<Fruit> getFruitPage(Connection connection, Integer pageNo);

    /**
     * 关键字查询
     * @param connection
     * @param keyword
     * @param pageNo
     * @return
     */
    List<Fruit> getFruitBykey(Connection connection, String keyword, Integer pageNo);

    /**
     * 查询用户总数
     * @param connection
     * @return
     */
    Long getTotal(Connection connection);

    /**
     * 关键字查询总数
     * @param connection
     * @param keyword
     * @return
     */
    Long getTotalByKey(Connection connection, String keyword);
}
