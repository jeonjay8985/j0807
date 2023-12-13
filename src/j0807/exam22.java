package j0807;

import java.awt.*;
import javax.swing.*;

public class exam22 extends JFrame {
	exam22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setTitle("레이블 예제");
		   
		   Container c=getContentPane();
		   c.setLayout(new FlowLayout());
		   
		   JLabel lbl3 = new JLabel("제임스 고슬링 입니더!"); 
		   add(lbl3);
		   
		   ImageIcon img2 = new ImageIcon("images/gosling.jpg");
		   JLabel lbl2 = new JLabel(img2);
		   add(lbl2);
		   
		   ImageIcon img3 = new ImageIcon("images/icon.gif");
		   JLabel lbl4 = new JLabel(img3);
		   add(lbl4);
		   JLabel lbl1 = new JLabel("커피한잔 하실래예, 전화주이소");
		   add(lbl1);
	
		   setSize(300, 500);
		   setVisible(true);
	}

	public static void main(String[] args) {
		// 실습08
		new exam22();

	}

}
