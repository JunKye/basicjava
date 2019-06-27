package kr.co.basicspring.di1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloSpring {
	
	public static void main(String[] args) {
		//객체(object를 생성하는 방법
		// 1-> POJO방식 : NEW 연산자
		// 2-> 자바빈 : <jsp:useBean id="" class=""/>
		// 3-> 스프링빈 : XML을 이용한 의존관계(DI) 설정
//		----------------------------------------------
		
		// 스프링 빈을 이용해서 객체 생성
		//1) 스프링빈 설정 XML 가져오기
		Resource resource = new ClassPathResource("spring.xml");
		//2) 팩토리빈 
		// -외부에서 작성한 스프링빈을 가져와서
		// -접근 가능한 객체를 생성해 준다
		BeanFactory factory = new XmlBeanFactory(resource);
		//3) 생성된 객체 가져오기
		Object objK = factory.getBean("msgKo");
		MessageKo korean = (MessageKo)objK;
		korean.sayHello("손흥민");
		

		Object objE = factory.getBean("msgKo");
		MessageKo english = (MessageKo)objE;
		english.sayHello("Tom");
	}//main end
	


}//class end
