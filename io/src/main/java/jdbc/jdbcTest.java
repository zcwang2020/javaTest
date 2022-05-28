package jdbc;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import jdbc.bean.User;
import org.junit.Test;

import util.JDBCUtils;

/**
 * @Author wzc
 * @Date 2022/5/27
 */
public class jdbcTest {

    @Test
    public void queryTest() throws Exception {

        String sql = "select * from user where id = ?";
        User user = getConnection(sql, 4);

        System.out.println(user);
    }

    private User getConnection(String sql, Object...args){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            // 连接
            connection = JDBCUtils.getConnection();

            preparedStatement = connection.prepareStatement(sql);
            // 预编译填充占位符
            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i +1, args[i]);
            }

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                User user = new User();
                // 获取元数据
                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();
                for (int i = 0; i < columnCount; i++) {
                    // 列别名
                    String columnLabel = metaData.getColumnLabel(i + 1);
                    // 列值
                    Object columnValue = resultSet.getObject(i + 1);
                    // 反射赋值
                    Field declaredField = User.class.getDeclaredField(columnLabel);
                    declaredField.setAccessible(true);
                    declaredField.set(user, columnValue);
                }
                return user;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeConnection(connection, preparedStatement, resultSet);
        }
        return null;
    }
}
