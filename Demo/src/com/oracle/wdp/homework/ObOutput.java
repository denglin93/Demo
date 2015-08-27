package com.oracle.wdp.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/*
 * 将对象写入到文件中
 * 
 * */
public class ObOutput {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
			Student student = new Student("思元", 6);
			School s = new School();
			s.setName("清华大学");
			student.setSchoo(s);
			oos.writeObject(student);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
