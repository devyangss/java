package com.cn.java.io;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Writer implements Runnable {
	private PipedOutputStream pout;

	public Writer(PipedOutputStream pout) {
		this.pout = pout;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("等待3秒写入数据");
		try {
			Thread.sleep(3000);
			String str = "Hello Java!";
			pout.write(str.getBytes());
			pout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}

class Reader implements Runnable {
	private PipedInputStream pin;
	
	public Reader(PipedInputStream pin) {
		this.pin = pin;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		int tmp;
		try {
			while ((tmp = pin.read()) != -1) {
				System.out.print((char)tmp);
			}
			pin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}


public class PipedStreamTest {
	// 管道输入流连接到管道输出流
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PipedOutputStream pout = new PipedOutputStream();
			PipedInputStream pin = new PipedInputStream(pout);
			
			Writer writer = new Writer(pout);
			Reader reader = new Reader(pin);
			
			Thread threadWriter = new Thread(writer);
			Thread threadReader = new Thread(reader);
			
			threadWriter.start();
			threadReader.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
