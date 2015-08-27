package com.oracle.wdp.homework.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IODemo {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("Demo.txt");
		byte[] b = new byte[2048];
		int len = -1;
		while ((len = is.read(b)) != -1) {
			for(int i=0;i<len;i=i+2){
				byte[] bs = {b[i],b[i+1]};
				System.out.print(new String(bs,"gbk"));
			}
			
		}
		is.close();
	}
}
