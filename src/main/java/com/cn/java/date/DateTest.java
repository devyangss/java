package com.cn.java.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 获取当前时间的毫秒数
		long timeStamp = System.currentTimeMillis()/1000;
		System.out.println(timeStamp*1000);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 时间戳转换为日期
		String dateFormat = sdf.format(new Date(timeStamp*1000));
		System.out.println(dateFormat);
		
		try {
			// 日期转换称时间戳
			System.out.println(sdf.parse(dateFormat).getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
