package util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @Author wzc
 * @Date 2022/5/27
 */
public class JDBCUtils {

    private static ComboPooledDataSource cpds = new ComboPooledDataSource("helloC3P0");

    public static Connection getConnection() throws Exception {
        InputStream rs = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties properties = new Properties();
        properties.load(rs);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driverClass = properties.getProperty("driverClass");
        Class.forName(driverClass);
        return DriverManager.getConnection(url, user, password);
    }

    public static Connection getC3P0Connection() throws Exception {
        return cpds.getConnection();
    }



    public static void closeConnection(Connection connection, PreparedStatement preparedStatement,
        ResultSet resultSet) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        try {
            if (preparedStatement != null) {

                preparedStatement.close();
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        try {
            if (resultSet != null) {

                resultSet.close();
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }
}
