package j0807;

import java.awt.*;

import javax.swing.*;

public class exam06 extends JFrame { //바로 상속받아도 ok!
	exam06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("레이아웃 연습");
		
		Container c = getContentPane(); //컨테이너
		c.setLayout(new FlowLayout());
        c.setBackground(Color.gray);  
		
		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new exam06(); 
	}

}
