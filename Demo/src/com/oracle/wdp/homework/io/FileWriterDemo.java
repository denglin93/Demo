package com.oracle.wdp.homework.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {
	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("456.txt",true);
			writer.write("ÄãºÃÑ½,ÎÄ»¢");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(writer!=null){
				try{
					writer.flush();
					//writer.close();
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}
