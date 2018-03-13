package com.test;

import java.util.Random;

public class ThreadTest implements Runnable {

	private int num;

	public ThreadTest(int num) {
		this.num = num;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			new Thread(new ThreadTest(i)).start();
		}
	}

	@Override
	public void run() {
		System.out.println(num + "번 마!! 달리기 시작");
		Random r = new Random();
		try {
			Thread.sleep(r.nextInt(3300));
			System.out.println(num + "번 마!! 달리기 종료");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
