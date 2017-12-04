package com.cn.java.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String srcDirName = "E:" + File.separator + "dirName" + File.separator + "fileName4.txt";
		String desDirName = "E:" + File.separator + "dirName" + File.separator + "fileName5.txt";
		
		File srcFile = new File(srcDirName);
		File desFile = new File(desDirName);
		
		// 字节流
		BufferedInputStream bin = null;
		BufferedOutputStream bout = null;
		try {
			bin = new BufferedInputStream(new FileInputStream(srcFile));
			bout = new BufferedOutputStream(new FileOutputStream(desFile));
			byte[] buff = new byte[100];
			while (bin.read(buff) != -1) {
				bout.write(buff);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				bin.close();
				bout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
