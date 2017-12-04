package com.cn.java.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String desDirName = "E:" + File.separator + "dirName" + File.separator + "fileName3.txt";
		File file = new File(desDirName);
		// 字节流
		DataOutputStream dout = null;
		DataInputStream din = null;
		
		try {
			dout = new DataOutputStream(new FileOutputStream(file));
			// 写入java基本类型数据
			dout.writeInt(100);
			dout.writeDouble(3.1415);
			dout.writeChar('Y');
			dout.writeBoolean(true);
			
			din = new DataInputStream(new FileInputStream(file));
			// 读取文件内容
			// 读取的顺序必须和写入的顺序是一致的
			System.out.println(din.readInt());
			System.out.println(din.readDouble());
			System.out.println(din.readChar());
			System.out.println(din.readBoolean());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				dout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
