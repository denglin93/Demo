package com.oracle.wdp.homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {
	public static void main(String[] args){
		FileWriter fw = null;

		FileReader fr = null;
	try {
		
		fr = new FileReader("Demo.txt");
		fw = new FileWriter("Demo.txt",true);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
