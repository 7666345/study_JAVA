package com.twxiao.test;

import java.sql.*;

public class Testjdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. 设置配置信息
        String url="jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=UTF8";
        String username="root";
        String password="root";


        //2. 加载驱动 (通过反射的方式加载)
        Class.forName("com.mysql.jdbc.Driver");

        //3. 链接数据库
        Connection conn = DriverManager.getConnection(url, username, password);

        //4. 获取执行sql的statment对象
        Statement statement = conn.createStatement();

        //5. 编辑sql
        String sql="select * from users";

        //6. 执行sql： 查询语句用executeQuery()方法，增删改使用executeUpdate()方法。 直接使用execute()方法会影响性能
        ResultSet rs = statement.executeQuery(sql);

        while(rs.next()){
            System.out.println("ID:"+rs.getObject("id"));
            System.out.println("Name:"+rs.getObject("username"));
            System.out.println("Email:"+rs.getObject("email"));
        }

        //7. 关闭链接： 先开的后关。 必须关

        rs.close();
        statement.close();
        conn.close();


    }
}
