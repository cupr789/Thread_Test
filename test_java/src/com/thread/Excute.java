package com.thread;

import java.util.Scanner;

public class Excute {
	public static void main(String[] args) {
		TextTest tt = new TextTest("a", "연결 성공");
		TextTest2 tt2 = new TextTest2();
		tt.start();
		tt2.start();
		String quite ="";
		Scanner sc = new Scanner(System.in);
		while(quite.equals("")) {
			quite = sc.nextLine();
			tt.msg = quite;
			if(!quite.equals("quite")) {
				quite= "";
			}
		}
		System.out.println("시스템이 종료되었습니다.");
		System.exit(0);
	}
}
