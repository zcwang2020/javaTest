package com.javaWeb.dao;

import com.javaWeb.pojo.Fruit;

import java.sql.Connection;
import java.util.List;

/**
 * @Author wzc
 * @Date 2022/5/29
 */
public class FruitDaoImpl extends BaseDao<Fruit> implements FruitDao {

    @Override
    public int createFruit(Connection connection, Fruit fruit) {
        String sql = "insert into `fruit` (fname,price,fcount,remark) values (?,?,?,?)";
        return update(connection, sql, fruit.getFname(), fruit.getPrice(), fruit.getFcount(), fruit.getRemark());
    }

    @Override
    public int deleteFruit(Connection connection, Fruit user) {
        String sql = "delete from `fruit` where id = ?";
        return update(connection, sql, user.getId());
    }

    @Override
    public int updateFruit(Connection connection, Fruit fruit) {
        String sql = "update `fruit` set fname = ? , price = ? , fcount = ?,remark = ? where id = ?";
        return update(connection, sql, fruit.getFname(), fruit.getPrice(), fruit.getFcount(), fruit.getRemark(), fruit.getId());
    }

    @Override
    public Fruit getOneFruit(Connection connection, Fruit fruit) {
        String sql = "select * from `fruit` where id = ?";
        return getOne(connection, sql, fruit.getId());
    }

    @Override
    public List<Fruit> getAllFruit(Connection connection) {
        String sql = "select * from `fruit`";
        return getList(connection, sql);
    }

    @Override
    public List<Fruit> getFruitPage(Connection connection, Integer pageNo) {
        String sql = "select * from fruit limit ? , 5";
        return getList(connection, sql, (pageNo - 1) * 5);
    }

    @Override
    public List<Fruit> getFruitBykey(Connection connection, String keyword, Integer pageNo) {
        String sql = "select * from fruit where fname like ? or remark like ? limit ? , 5";
        return getList(connection, sql, "%" + keyword + "%", "%" + keyword + "%", (pageNo - 1) * 5);
    }

    @Override
    public Long getTotal(Connection connection) {
        String sql = "select count(*) from `fruit`";
        return GetValue(connection, sql);
    }

    @Override
    public Long getTotalByKey(Connection connection, String keyword) {
        String sql = "select count(*) from `fruit` where fname like ? or remark like ? ";
        return GetValue(connection, sql, "%" + keyword + "%", "%" + keyword + "%");
    }
}
