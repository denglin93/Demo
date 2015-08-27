package com.oracle.wdp.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderChar {
	public static void main(String[] args) throws InterruptedException{
		Reader reader = null;
		try {
			 reader = new FileReader("Demo.txt");
			 char[] b= new char[1];
			 int len = -1;
			 while((len=reader.read(b))!=-1){
				 for(int i=0;i<len;i++){
					 Thread.sleep(1000);
					 System.out.print(b[i]);
				 }
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
