package com.oracle.wdp.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/*
 * ������д�뵽�ļ���
 * 
 * */
public class ObOutput {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
			Student student = new Student("˼Ԫ", 6);
			School s = new School();
			s.setName("�廪��ѧ");
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
