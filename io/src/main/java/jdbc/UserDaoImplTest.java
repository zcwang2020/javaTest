package jdbc;

import java.sql.Connection;
import java.util.List;

import org.junit.Test;

import jdbc.bean.User;
import jdbc.dao.UserDaoImpl;
import util.JDBCUtils;

/**
 * @Author wzc
 * @Date 2022/5/29
 */
public class UserDaoImplTest {

    private UserDaoImpl userDao = new UserDaoImpl();

    @Test
    public void createUser() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            User user = new User(1L, "小明", 3);
            int row = userDao.createUser(connection, user);
            System.out.println(row == 1 ? "插入成功" : "插入失败");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(connection, null, null);
        }
    }

    @Test
    public void deleteUser() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            User user = new User();
            user.setId(1L);
            int row = userDao.deleteUser(connection, user);
            System.out.println(row == 1 ? "删除成功" : "删除失败");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(connection, null, null);
        }
    }

    @Test
    public void updateUser() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            User user = new User(3L, "流", 5);
            int row = userDao.updateUser(connection, user);
            System.out.println(row == 1 ? "更新成功" : "更新失败");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(connection, null, null);
        }
    }

    @Test
    public void getOneUser() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getC3P0Connection();
            User user = new User();
            user.setId(3L);
            System.out.println(userDao.getOneUser(connection, user));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(connection, null, null);
        }
    }

    @Test
    public void getAllUser() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            List<User> allUser = userDao.getAllUser(connection);
            allUser.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(connection, null, null);
        }
    }

    @Test
    public void getTotal() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
            System.out.println(userDao.getTotal(connection));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(connection, null, null);
        }
    }
}
