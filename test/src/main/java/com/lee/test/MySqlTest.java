package com.lee.test;

import org.springframework.util.DigestUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lihaiqiang
 * @since 2020/11/24
 */
public class MySqlTest {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=GMT%2B8";
    private static final String USER = "root";
    private static final String PASSWORD = "8uhb*UHB";

    public static void main(String[] args) {
        //System.out.println(String.format("136%08d", 1));
        //System.out.println(DigestUtils.md5DigestAsHex("123456".getBytes()));
        //System.out.println(UUID.randomUUID().toString());

        //insert();
        //select();
        update();
    }

    private static void insert() {
        long startTime = System.currentTimeMillis();
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = getConnection();
            System.out.println("连接耗时：" + (System.currentTimeMillis() - startTime));
            String sql = "INSERT INTO t_user_info(account,password,phone_num) values(?,?,?)";
            StringBuilder sbSql = new StringBuilder(sql);
            int size = 10000;
            int page = 1000;
            for (int i = 1; i < size; i++) {
                sbSql.append(",(?,?,?)");
            }
            System.out.println("sql: " + sbSql.toString());
            ps = connection.prepareStatement(sbSql.toString());
            for (int i = 0; i < page; i++) {
                for (int j = 0; j < size; j++) {
                    int index = j * 3;
                    String account = String.format("136%08d", (i * size + j));
                    ps.setString(++index, account);
                    ps.setString(++index, DigestUtils.md5DigestAsHex("123456".getBytes()));
                    ps.setString(++index, account);
                }
                ps.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection(connection);
        }
        System.out.println("insert耗时：" + (System.currentTimeMillis() - startTime));
    }

    private static void select() {
        long startTime = System.currentTimeMillis();
        Connection connection = null;
        PreparedStatement ps = null;
        try {
            connection = getConnection();
            System.out.println("连接耗时：" + (System.currentTimeMillis() - startTime));
            String sql = "SELECT id,account,password,phone_num,is_deleted,gmt_create,gmt_modified FROM t_user_info " +
                    //"WHERE id >= ? AND id <= ?";
                    //"WHERE account = ?";
                    "WHERE phone_num = ?";
            ps = connection.prepareStatement(sql);
            //ps.setInt(1, 90000);
            //ps.setInt(2, 100000);
            ps.setString(1, "13600099999");
            ResultSet resultSet = ps.executeQuery();
            List<Map<String, Object>> userInfoList = new ArrayList<>();
            Map<String, Object> userInfo;
            while (resultSet.next()) {
                userInfo = new HashMap<>(8);
                userInfo.put("id", resultSet.getInt(1));
                userInfo.put("account", resultSet.getString(2));
                userInfo.put("password", resultSet.getString(3));
                userInfo.put("phone_num", resultSet.getString(4));
                userInfo.put("is_deleted", resultSet.getByte(5));
                userInfo.put("gmt_create", resultSet.getTimestamp(6));
                userInfo.put("gmt_modified", resultSet.getTimestamp(7));
                userInfoList.add(userInfo);
            }
            System.out.println("select数量：" + userInfoList.size());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection(connection);
        }
        System.out.println("select耗时：" + (System.currentTimeMillis() - startTime));
    }

    private static void update() {

    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
