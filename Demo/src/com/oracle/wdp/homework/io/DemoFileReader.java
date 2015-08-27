package com.oracle.wdp.homework.io;

import java.io.FileReader;
import java.io.IOException;

public class DemoFileReader {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("Demo.txt");
		int len = -1;
		while((len=fr.read())!=-1){
			System.out.print((char)len);
		}
	}
}
