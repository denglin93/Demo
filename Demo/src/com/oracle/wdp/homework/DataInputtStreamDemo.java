package com.oracle.wdp.homework;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class DataInputtStreamDemo {
	public static void main(String[] args) throws InterruptedException {
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream("789.dat"));
			dos.writeInt(123);
			dos.writeDouble(123.0);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(dos!=null){
				try{
					dos.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
