package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class IOTSocketServerExe {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("192.168.0.47",8881);
			System.out.println(s.isConnected());
			boolean maintain = true;
			System.out.println("서버 연결 완료");
			while(maintain) {
				OutputStream os = s.getOutputStream();
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(os));
				pw.println("명훈이형 조루토끼 브끄~^^7");
				pw.flush();
				
				InputStream is = s.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				String inputStr = null;
				while((inputStr=br.readLine())!=null) {
					System.out.println("수신자 왈 : "+inputStr);
				}
				pw.close();
				br.close();
				maintain =false;
			}
			s.close();
			System.out.println("서버 연결 종료");
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
