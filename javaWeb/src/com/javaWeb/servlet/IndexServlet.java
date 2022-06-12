package com.javaWeb.servlet;

import com.javaWeb.dao.FruitDao;
import com.javaWeb.dao.FruitDaoImpl;
import com.javaWeb.myspringmvc.ViewBaseServlet;
import com.javaWeb.pojo.Fruit;
import util.JDBCUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

//Servlet从3.0版本开始支持注解方式的注册
@WebServlet("/index")
public class IndexServlet extends ViewBaseServlet {

    @Override
    public void doGet(HttpServletRequest request , HttpServletResponse response)throws IOException, ServletException {
        FruitDao fruitDAO = new FruitDaoImpl();
        Connection connection = null;
        try {
            connection = JDBCUtils.getDruidConnection();
            List<Fruit> fruitList = fruitDAO.getAllFruit(connection);
            //保存到session作用域
            HttpSession session = request.getSession() ;
            session.setAttribute("fruitList",fruitList);
            //此处的视图名称是 index
            //那么thymeleaf会将这个 逻辑视图名称 对应到 物理视图 名称上去
            //逻辑视图名称 ：   index
            //物理视图名称 ：   view-prefix + 逻辑视图名称 + view-suffix
            //所以真实的视图名称是：      /       index       .html
            super.processTemplate("index",request,response);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(connection, null, null);
        }

    }
}
