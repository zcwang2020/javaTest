package com.javaWeb.servlet;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;

import com.javaWeb.dao.FruitDaoImpl;
import com.javaWeb.myspringmvc.ViewBaseServlet;
import com.javaWeb.pojo.Fruit;

import util.JDBCUtils;

//@WebServlet("/edit.do")
public class EditServlet extends ViewBaseServlet {

    private FruitDaoImpl fruitDAO = new FruitDaoImpl();

    @Override
    public void doGet(HttpServletRequest request , HttpServletResponse response)throws IOException, ServletException {
        Connection connection = null;
        try {
            connection = JDBCUtils.getDruidConnection();
            String idStr = request.getParameter("id");
            if(StringUtils.isNotEmpty(idStr)){
                long fid = Long.parseLong(idStr);
                Fruit fruit = new Fruit();
                fruit.setId(fid);
                Fruit fruitFromDB = fruitDAO.getOneFruit(fruit);
                request.setAttribute("fruit",fruitFromDB);
                super.processTemplate("edit",request,response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(connection, null, null);
        }

    }
}
