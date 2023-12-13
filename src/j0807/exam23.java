package j0807;

import java.awt.*;

import javax.swing.*;

public class exam23 extends JFrame{
	exam23() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setTitle("텍스트필드 만들기 예제");
    	Container c = getContentPane();
    	c.setLayout(new FlowLayout());
    	
    	JLabel lbl1 = new JLabel("이름");
		add(lbl1);
    	JTextField txt1 = new JTextField(20);
    	add(txt1);
    	
    	JLabel lbl2 = new JLabel("학과");
		add(lbl2);
     	JTextField txt2 = new JTextField(20);
     	txt2.setText("컴퓨터공학과");
    	add(txt2);
    	
    	JLabel lbl3 = new JLabel("주소");
		add(lbl3);
    	JTextField txt3 = new JTextField(20);
    	txt3.setText("서울시 ...");
    	add(txt3);
        
    	setSize(300, 150);
    	setVisible(true);
	}

	public static void main(String[] args) {
		// 실습09
		new exam23();

	}

}
