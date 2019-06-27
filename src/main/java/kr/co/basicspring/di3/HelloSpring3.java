package kr.co.basicspring.di3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import kr.co.basicspring.di2.MessageEn2;
import kr.co.basicspring.di2.MessageKo2;

public class HelloSpring3 {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("spring2.xml"); //1) 스프링빈 설정 XML 가져오기
		BeanFactory factory = new XmlBeanFactory(resource); // 2)스프링빈을 가져와 접근 가능한 객체를 생성해 준다
		//3) 생성된 객체 가져오기
		IHello hello = null;
		hello = (IHello)factory.getBean("msgKo");
		hello.sayHello("무궁");
		
		hello = (IHello)factory.getBean("msgEn");
		hello.sayHello("Infinity");

	}// main end
}//class end
