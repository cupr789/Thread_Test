package com.thread;

import java.util.Scanner;

public class TextTest2 extends Thread {
	String msg = "";
	String id;

	public void run() {
		try {
			/*while (true) {
				Thread.sleep(3000);
				if (!msg.equals("")) {
					System.out.println("[" + id + "]메세지 : " + msg);
				}
			}*/
			Scanner sc = new Scanner(System.in);
			sc.nextLine();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
