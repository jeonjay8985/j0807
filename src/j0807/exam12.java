package j0807;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class exam12 extends JFrame{
	exam12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이벤트 실습");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("Action");
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton)e.getSource();   
				if(b.getText().equals("Action")) {
					b.setText("액션");
					b.setBackground(Color.YELLOW);
					
				}else {
					b.setText("Action");
					b.setBackground(Color.GREEN);
				}
				
			}
			
		});
		
		add(btn1);
		setSize(200, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     new exam12();
	}

}
