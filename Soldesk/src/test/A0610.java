package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class A0610 {

	public static void main(String[] args) {

		BufferedWriter out = null;
		BufferedReader in = null;

		ServerSocket ser = null; // ip,port
		Socket s = null; // 데이터를 주고 받을 때 사용

		Scanner sc = new Scanner(System.in);
		try {
			ser = new ServerSocket(9999);
			s = ser.accept(); // 연결 수락
			System.out.println("연결 기다리고 있다."); // 클라이언트가 연결 요청이 올 때까지 기다린다.
			// 서버 쪽에서 클라이언트한테 메시지 보낸다.
			out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while (true) {
				String msg = in.readLine();
				if (msg.equals("stop")) {
					System.out.println("종료");
					break;
				}
				System.out.println("보내기");
				String outmsg = sc.nextLine();
				out.write(outmsg + "\n");
				out.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
				s.close();
				ser.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		sc.close();
	}

}