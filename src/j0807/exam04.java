package j0807;

import java.awt.*;

import javax.swing.*;

public class exam04 {
    static class MyGUI extends JFrame {
    	MyGUI() {
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		setTitle("CardLayout 연습"); 
    		this.setLayout(new CardLayout(10, 10));
    		
    		JButton btn1 = new JButton("버튼1");
    		JButton btn2 = new JButton("버튼2");
    		JButton btn3 = new JButton("버튼3");
    		
    		add(btn1);
    		add(btn2);
    		add(btn3);
    		
    		setSize(250,250);
    		setVisible(true);
    	}
    }
	public static void main(String[] args) {
		// CardLayout 카드 레이아웃
          new MyGUI();
	}

}
