package com.oracle.wdp.homework;
/*
 * 将文件中的对象输出到程序中
 * */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObInput {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("object.dat"));
			Student student = (Student) ois.readObject();
			System.out.println(student.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
