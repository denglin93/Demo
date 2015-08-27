package com.oracle.wdp.homework.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(8080);
		Socket socket = ss.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(
				socket.getInputStream()));
		System.out.println(br.readLine());
		ss.close();
		socket.close();
	}
}
