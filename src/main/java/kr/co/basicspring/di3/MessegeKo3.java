package kr.co.basicspring.di3;

public class MessegeKo3 implements IHello{
	public MessegeKo3() {
		System.out.println("MessegeKo3() 按眉 积己");
	}
	@Override
	public void sayHello(String name) {
		System.out.println("救崇窍技夸~"+name);
	}//sayHello end
}//MessegeKo3 end
