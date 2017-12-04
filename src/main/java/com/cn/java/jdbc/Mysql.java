package com.cn.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mysql {

	public static void main(String[] args) {
		String url = "jdbc:mysql://192.168.188.118:3306/lqb30?useUnicode=true&characterEncoding=UTF-8";
		String user = "root";
		String password = "yss123456";
		// TODO Auto-generated method stub
		// 第一步，导入jdbc jar包。
		// 第二步，加载jdbc驱动
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// 第三步，连接数据库
			conn = DriverManager.getConnection(url, user, password);
			// 第四步，创建sql语句
			Statement statement = conn.createStatement();
			long timeStamp = System.currentTimeMillis()/1000;
			System.out.println(timeStamp*1000);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// 时间戳转换为日期
			String dateFormat = sdf.format(new Date(timeStamp*1000));
			String sql = "INSERT INTO `code_t` VALUES(1, '名称', 'disp_name', 'desc'," + "\'" + dateFormat +"\'," + "\'" + dateFormat +"\');";
			System.out.println(sql);
			// 第五步，执行语句
			int result = statement.executeUpdate(sql);
			if (result > 0) {
				System.out.println("插入数据成功");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void close() {
		
	}

}
