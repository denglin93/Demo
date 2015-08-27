package com.oracle.wdp.homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {
	public static void main(String[] args){
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fw = new FileWriter("Demo.txt", true);
			fr = new FileReader("Demo.txt");
			fw.write("我叫夏文虎，\n月入一万五，\n不打目标不入土、");
			fw.flush();
			int len = 0;
			while ((len = fr.read()) != -1) {
				System.out.print((char) len);
			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
}
