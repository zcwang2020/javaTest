package com.javaWeb.servlet;

import com.javaWeb.dao.FruitDaoImpl;
import com.javaWeb.pojo.Fruit;
import util.JDBCUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

/**
 * @Author wzc
 * @Date 2022/6/5
 */
public class AddServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fname = req.getParameter("fname");
        String price = req.getParameter("price");
        int intPrice = Integer.parseInt(price);
        String fcount = req.getParameter("fcount");
        int intCount = Integer.parseInt(fcount);
        String remark = req.getParameter("remark");

        Fruit fruit = new Fruit();
        fruit.setFname(fname);
        fruit.setPrice(intPrice);
        fruit.setFcount(intCount);
        fruit.setRemark(remark);

        FruitDaoImpl fruitDao = new FruitDaoImpl();

        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            int row = fruitDao.createFruit(connection, fruit);
            System.out.println(row == 1 ? "插入成功" : "插入失败");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(connection, null, null);
        }



    }
}
