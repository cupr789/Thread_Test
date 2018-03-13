package com.thread;

class ForThread extends Thread{
	
	String id;
	public ForThread(String id) {
		this.id=id;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(id+i);
		}
	}
}

public class Excute3 {
	public static void main(String[] args) {
		ForThread ft1 = new ForThread("첫번째 포문 : ");
		ForThread ft2 = new ForThread("두번째 포문 : ");
		
		ft1.start();
		ft2.start();
		
	}
}
