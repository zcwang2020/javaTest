package jdbc.dao;

import java.sql.Connection;
import java.util.List;

import jdbc.bean.User;

/**
 * @Author wzc
 * @Date 2022/5/29
 */
public class UserDaoImpl extends BaseDao<User> implements UserDao {

    @Override
    public int createUser(Connection connection, User user) {
        String sql = "insert into `user` (name,age) values (?,?)";
        return update(connection, sql, user.getName(), user.getAge());
    }

    @Override
    public int deleteUser(Connection connection, User user) {
        String sql = "delete from `user` where id = ?";
        return update(connection, sql, user.getId());
    }

    @Override
    public int updateUser(Connection connection, User user) {
        String sql = "update `user` set name = ? , age = ? where id = ?";
        return update(connection, sql, user.getName(), user.getAge(), user.getId());
    }

    @Override
    public User getOneUser(Connection connection, User user) {
        String sql = "select * from `user` where id = ?";
        return getOne(connection, sql, user.getId());
    }

    @Override
    public List<User> getAllUser(Connection connection) {
        String sql = "select * from `user`";
        return getList(connection, sql);
    }

    @Override
    public Long getTotal(Connection connection) {
        String sql = "select count(*) from `user`";
        return GetValue(connection, sql);
    }
}
