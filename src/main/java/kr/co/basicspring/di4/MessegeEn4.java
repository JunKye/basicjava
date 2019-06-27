package kr.co.basicspring.di4;

import javax.swing.JOptionPane;

import kr.co.basicspring.di3.IHello;

public class MessegeEn4 implements IHello{
	public MessegeEn4() {
		System.out.println("MessegeEn4() °´Ã¼ »ý¼º");
	}
	@Override
	public void sayHello(String name) {
		JOptionPane.showMessageDialog(null, "hello~"+name);
	}//sayHello end
}//MessegeKo3 end
