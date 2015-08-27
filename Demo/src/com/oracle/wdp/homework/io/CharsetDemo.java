package com.oracle.wdp.homework.io;

import java.io.IOException;
import java.nio.charset.Charset;

public class CharsetDemo {
	public static void main(String[] args) throws IOException {

		System.out.println(Charset.defaultCharset().name());
	}
}
