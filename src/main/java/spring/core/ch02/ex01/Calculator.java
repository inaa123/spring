package spring.core.ch02.ex01;

public class Calculator {
	private void calc() {
		try {
			Thread.sleep((long)(Math.random() * 1000)); //랜덤으로 지정된 시간동안 계산하기
		} catch(Exception e) {}
	}
	
	public void start() {
		long start = System.currentTimeMillis();
		calc();
		long end = System.currentTimeMillis();
		
		System.out.println("경과시간: " + (end - start));
	}
}
