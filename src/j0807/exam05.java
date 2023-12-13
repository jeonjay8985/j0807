package j0807;

import javax.swing.*;

public class exam05 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("레이아웃이 없는 창 연습");
			this.setLayout(null);
			
			JButton btn1 = new JButton("버튼1");
			JButton btn2 = new JButton("버튼2");
			JButton btn3 = new JButton("버튼3");
			
			btn1.setBounds(50, 50, 70, 60);
			btn2.setBounds(80, 80, 70, 60);
			btn3.setBounds(110, 110, 70, 60);
			
			add(btn1);
			add(btn2);
			add(btn3);
			
			setSize(250,250);
    		setVisible(true);
		}
	}

	public static void main(String[] args) {
		// 레이아웃이 없는 창 
    new MyGUI();
	}

}
