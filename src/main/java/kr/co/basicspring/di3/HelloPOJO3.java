package kr.co.basicspring.di3;

public class HelloPOJO3 {

	public static void main(String[] args) {
		// POJO(Plain Old Java Object) 순수 자바코드 방식
		IHello hello = null;

		hello = new MessegeKo3();
		hello.sayHello("하하하");

		hello = new MessegeEn3();
		hello.sayHello("HAHAHA");
	}// main end
}//class end
