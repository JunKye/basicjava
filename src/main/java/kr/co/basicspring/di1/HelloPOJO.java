package kr.co.basicspring.di1;

public class HelloPOJO {

	public static void main(String[] args) {
		// POJO(Plain Old Java Object) 순수 자바코드 방식
		// 1) 객체 생성 : new연산자
		MessageKo korea = new MessageKo();
		korea.sayHello("박지성");
		
		MessageEn english = new MessageEn();
		english.sayHello("Tom");
		
	}// main end
}//class end
