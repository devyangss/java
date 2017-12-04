package com.cn.java.io;

import java.io.File;
import java.io.IOException;

public class FileStreamTest {
	public static void main(String[] args) {
		// 创建一个目录
		// separator 属性为系统默认的目录分隔符
		// windows 为 "\", unix 为 "/"
		String dirStr = "E:" + File.separator + "dirName";
		String fileName = "fileName.txt";
		File dir = new File(dirStr); // 创建一个File实例
		if (!dir.exists()) {
			dir.mkdir(); // mkdir创建实例指定的目录，适合创建一层目录
		}
		
		String[] lists = dir.list(); // 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录,eg: fileName.txt
		if (lists.length > 0) {
			for (int i = 0; i < lists.length; i++) {
				System.out.println(lists[i]);
			}
		}
		
		File[] listFiles = dir.listFiles();	// 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件，eg：E:\dirName\fileName.txt
		if (listFiles.length > 0) {
			for (int j = 0; j < listFiles.length; j++) {
				System.out.println(listFiles[j].toString());
			}
		}
		// 构造一个表示此抽象路径名的 file: URI。
		System.out.println(dir.toURI()); // file:/E:/dirName/
		
		File file = new File(dirStr, fileName);
		if (!file.exists()) {
			try {
				file.createNewFile();	// createNewFile在指定的目录下创建指定名的文件
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			Thread.sleep(3000); // 当前正在执行的线程休眠1000ms, sleep方法为静态方法，可以直接调用，不需要创建实例
			System.out.println("10s");
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (dir.exists()) {
			dir.delete();	// 非空目录删不掉，可以删除空目录
		}
		
		if (file.isFile()) {
			System.out.println("这是一个标准文件");
		}
		
		if (!file.isHidden()) {
			System.out.println("这不是一个隐藏文件");
		}
		
		System.out.println("文件长度为：" + file.length() + "字节");
		
		if (file.exists()) {
			// file.delete(); // 删除文件
		}
		
		// 创建多层目录
		String dirStr1 = "E:" + File.separator + "dirName1" + File.separator + "dirName2";
		String fileName1 = "fileName1.txt";
		File dir1 = new File(dirStr1);
		if (!dir1.exists()) {
			dir1.mkdirs();	//mkdirs 创建目录，适合创建多层目录
		}
		
		File file1 = new File(dirStr1, fileName1);
		if (!file1.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
