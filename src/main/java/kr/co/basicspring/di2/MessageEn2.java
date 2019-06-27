package kr.co.basicspring.di2;

import javax.swing.JOptionPane;

public class MessageEn2 {
	public MessageEn2() {
		System.out.println("MessageEn2() 梓端 持失");
	}// messsageKo 持失切
	public void sayHello(String name) {
		JOptionPane.showMessageDialog(null, "Hello '"+name+"' ");
	}
}// class end
