package com.javaWeb.test;

import com.javaWeb.dao.FruitDaoImpl;
import com.javaWeb.pojo.Fruit;
import jdbc.bean.User;
import org.junit.Test;
import util.JDBCUtils;

import java.sql.Connection;

/**
 * @Author wzc
 * @Date 2022/6/5
 */
public class FruitTest {

    FruitDaoImpl fruitDao = new FruitDaoImpl();

    @Test
    public void getOneFruit() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getDruidConnection();
            Fruit fruit = new Fruit();
            fruit.setId(1L);
            System.out.println(fruitDao.getOneFruit(connection, fruit));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(connection, null, null);
        }
    }

}