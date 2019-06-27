package kr.co.basicspring.di2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloSpring2 {
	
	public static void main(String[] args) {
		//객체(object를 생성하는 방법
		// 1-> POJO방식 : NEW 연산자
		// 2-> 자바빈 : <jsp:useBean id="" class=""/>
		// 3-> 스프링빈 : XML을 이용한 의존관계(DI) 설정
//		----------------------------------------------		
		// 스프링 빈을 이용해서 객체 생성
		
		Resource resource = new ClassPathResource("spring.xml"); //1) 스프링빈 설정 XML 가져오기
		BeanFactory factory = new XmlBeanFactory(resource); // 2)스프링빈을 가져와 접근 가능한 객체를 생성해 준다
		//3) 생성된 객체 가져오기
		MessageKo2 korean = (MessageKo2)factory.getBean("msgKo");
		korean.sayHello("무궁");

		MessageEn2 english = (MessageEn2)factory.getBean("msgEn"); 
		english.sayHello("Jack");
	}//main end
	


}//class end
