package com.cn.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest1 {
	/**
	 * 字节流
	 * 读取一个文件的内容，并写入另外一个文件
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourceFileStr = "E:" + File.separator + "dirName" + File.separator + "fileName.txt";
		String desFileDesStr = "E:" + File.separator + "dirName" + File.separator + "fileName2.txt";
		File sourceFile = new File(sourceFileStr);
		File desFile = new File(desFileDesStr);
		// 字节流
		FileInputStream fin = null;
		FileOutputStream fout = null;
		byte[] buff = new byte[1024];
		try {
			fin = new FileInputStream(sourceFile);
			fout = new FileOutputStream(desFile);
			while (fin.read(buff) != -1) {
				fout.write(buff);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				fin.close();
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
