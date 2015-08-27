package com.oracle.wdp.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) throws InterruptedException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("Demo.txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {

					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}
}
