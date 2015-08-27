package com.oracle.wdp.homework.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FileOutput {
	public static void main(String[] args) {
		OutputStream os = null;
		BufferedReader br = null;
		String input = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
			os = new FileOutputStream("123,txt", true);
			os.write(input.getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
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
