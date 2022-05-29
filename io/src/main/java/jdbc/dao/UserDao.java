package jdbc.dao;

import jdbc.bean.User;

import java.sql.Connection;
import java.util.List;

/**
 * @Author wzc
 * @Date 2022/5/29
 */
public interface UserDao {

    /**
     * 创建user
     * @param connection
     * @param user
     */
    int createUser(Connection connection, User user);

    /**
     * 删除用户
     * @param connection
     * @param user
     */
    int deleteUser(Connection connection, User user);

    /**
     * 更新用户
     * @param connection
     * @param user
     */
    int updateUser(Connection connection, User user);

    /**
     * 查询单个用户
     * @param connection
     * @param user
     * @return
     */
    User getOneUser(Connection connection, User user);

    /**
     * 批量查询用户
     * @param connection
     * @return
     */
    List<User> getAllUser(Connection connection);

    /**
     * 查询用户总数
     * @param connection
     * @return
     */
    Long getTotal(Connection connection);
}
