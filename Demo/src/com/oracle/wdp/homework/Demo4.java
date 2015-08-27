package com.oracle.wdp.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo4 {
	public static void main(String[] args) throws InterruptedException{
		BufferedReader reader = null;
		try {
			 reader = new BufferedReader(new FileReader("Demo.txt"));

			 String line = null;
			 while((line=reader.readLine())!=null){
				 Thread.sleep(3000);
				 System.out.println(line);
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException ee){
			if(reader!=null){
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
