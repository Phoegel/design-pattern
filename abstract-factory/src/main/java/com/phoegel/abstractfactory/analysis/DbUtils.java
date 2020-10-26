package com.phoegel.abstractfactory.analysis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 获取数据连接的工具类
 */
public class DbUtils {

    // 数据库驱动全类名
    private static final String driverClass = "com.mysql.jdbc.Driver";

    // 数据库地址
    private static final String url = "jdbc:mysql://localhost:3306/test";

    // 用户名
    private static final String user = "user";

    // 密码
    private static final String password = "password";

    private static Connection connection;

    static {
        try {
            // 加载驱动
            Class.forName(driverClass);
            // 获取连接
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接方法
     * @return 数据库连接
     */
    public static Connection getConnection() {
        return connection;
    }

}
