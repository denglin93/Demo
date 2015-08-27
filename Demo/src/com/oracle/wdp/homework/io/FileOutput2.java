package com.oracle.wdp.homework.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutput2 {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("123.txt", true);
			os.write("我叫夏文虎，工资一万五".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
