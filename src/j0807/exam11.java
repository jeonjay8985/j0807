package j0807;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam11 extends JFrame{
	exam11() {
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setTitle("이벤트 실습");
	 Container c = getContentPane();
	 c.setLayout(new FlowLayout());
	 JButton btn1 = new JButton("버튼1");
			 
	 btn1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			btn1.setBackground(Color.red);
		}
		 
	 });
		

	 add(btn1);
	 setSize(200, 200);
	 setVisible(true);
	}

	public static void main(String[] args) {
		// 이벤트
    new exam11();
    
	}

}
