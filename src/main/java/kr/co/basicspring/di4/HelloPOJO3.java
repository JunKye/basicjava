package kr.co.basicspring.di4;

import kr.co.basicspring.di3.IHello;

public class HelloPOJO3 {

	public static void main(String[] args) {
		// POJO(Plain Old Java Object) 순수 자바코드 방식
		IHello hello = null;

		hello = new MessegeKo4();
		hello.sayHello("하하하");

		hello = new MessegeEn4();
		hello.sayHello("HAHAHA");
	}// main end
}//class end
