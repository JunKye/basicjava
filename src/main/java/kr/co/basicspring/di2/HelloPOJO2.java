package kr.co.basicspring.di2;

public class HelloPOJO2 {

	public static void main(String[] args) {
		// POJO(Plain Old Java Object) 순수 자바코드 방식
		// 1) 객체 생성 : new연산자
		MessageKo2 korean = new MessageKo2();
		korean.sayHello("김연아");
		
		MessageEn2 english = new MessageEn2();
		english.sayHello("Jhone");
		
	}// main end
}//class end
