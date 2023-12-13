package j0807;

import java.awt.*;

import javax.swing.*;

public class exam03 {
	
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("GridLayout 연습");
			this.setLayout(new GridLayout(3,3,10,10));
			/*
			JButton btn1 = new JButton("버튼1");
			JButton btn2 = new JButton("버튼2");
			JButton btn3 = new JButton("버튼3");
			JButton btn4 = new JButton("버튼4");
			JButton btn5 = new JButton("버튼5");
			JButton btn6 = new JButton("버튼6");
			JButton btn7 = new JButton("버튼7");
			JButton btn8 = new JButton("버튼8");
			JButton btn9 = new JButton("버튼9");
			
			add(btn1);
			add(btn2);
			add(btn3);
			add(btn4);
			add(btn5);
			add(btn6);
			add(btn7);
			add(btn8);
			add(btn9);*/
			
			JButton[] btn = new JButton[8];
			for(int i=0; i<btn.length; i++) {        //i<9;해도 ok
				btn[i] = new JButton("버튼" +(i+1));
	
			}
			for(int i=0; i<btn.length; i++) {       
				add(btn[i]);
			}
			
			setSize(250,250);
			setVisible(true);
		}
	}

	public static void main(String[] args) {
		// GridLayout
            new MyGUI();
	}

}
