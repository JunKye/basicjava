package kr.co.basicspring.di3;

public class MessegeEn3 implements IHello{
	public MessegeEn3() {
		System.out.println("MessegeEn3() °´Ã¼ »ý¼º");
	}
	@Override
	public void sayHello(String name) {
		System.out.println("hello~"+name);
	}//sayHello end
}//MessegeKo3 end
