package com.oracle.wdp.homework.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class IODemoBuffer {
	public static void main(String[] args) throws IOException {
		Reader reader = new InputStreamReader(new FileInputStream("Demo.txt"));
		char[] c = new char[1];
		int len = -1;
		while((len=reader.read(c))!=-1){
			for(int i=0;i<len;i++){
				System.out.print(c[i]);
			}
		}
	}
}
