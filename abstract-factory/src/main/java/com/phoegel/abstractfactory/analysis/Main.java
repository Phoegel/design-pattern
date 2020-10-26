package com.phoegel.abstractfactory.analysis;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 客户端通过 DbUtils 工具类获取链接
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        // 获取数据库连接
        Connection connection = DbUtils.getConnection();
        // 创建 Statement 语句对象
        Statement statement = connection.createStatement();
        // 执行 sql 语句，得到结果集
        ResultSet rs = statement.executeQuery("select name,age from student");
        while (rs.next()) {
            System.out.println(rs.getString("name"));
            System.out.println(rs.getInt("age"));
        }
    }

}
