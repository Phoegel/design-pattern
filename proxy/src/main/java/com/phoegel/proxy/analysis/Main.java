package com.phoegel.proxy.analysis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        // mybatis 配置文件位置：类路径下的 mybatis-config.xml 文件
        String resource = "mybatis-config.xml";
        try {
            // 读取 mybatis 配置文件
            InputStream inputStream = Resources.getResourceAsStream(resource);
            // 创建 sqlSessionFactory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            // 创建 session
            SqlSession session = sqlSessionFactory.openSession();
            // 获取 mapper 映射
            UserMapper userMapper = session.getMapper(UserMapper.class);
            // 这里返回的实际上是 MapperProxy 类实例，即代理类实例
            System.out.println("userMapper:" + userMapper);
            // 调用查询方法
            User user = userMapper.getUserById(1);
            // 输出查询结果
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
