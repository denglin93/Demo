package com.oracle.wdp.homework;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutStreamDemo {
	public static void main(String[] args) throws InterruptedException {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("789.dat"));
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (dis != null) {
				try {
					dis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
