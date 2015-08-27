package com.oracle.wdp.homework.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {
	public static void main(String[] args) throws UnknownHostException,
			IOException {
		Socket socket = new Socket("127.0.0.1", 8080);
		PrintWriter pw = new PrintWriter(socket.getOutputStream());
		pw.println("夏文虎，月入一万五");
		pw.flush();
		pw.close();
		socket.close();
	}
}
