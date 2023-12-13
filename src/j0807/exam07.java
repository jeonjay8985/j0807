package j0807;

import java.awt.*;

import javax.swing.*;

public class exam07 extends JFrame {
    exam07() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setTitle("컴포넌트연습");
    	
    	Container c=getContentPane();
    	c.setBackground(Color.YELLOW);
    	c.setLayout(new FlowLayout());
    	
    	JButton btn1 = new JButton("버튼1");
    	btn1.setBackground(Color.black);
    	btn1.setForeground(Color.MAGENTA);
    	add(btn1);
    	
    	JButton btn2 = new JButton("버튼2");
    	btn2.setFont(new Font("맑은고딕", Font.BOLD, 30)); //Bold:진하게
    	btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR)); //마우스커서가 뱅글뱅글 돎
    	btn2.setToolTipText("이 버튼은 크게 보여요");
    	add(btn2);
    	
    	JButton btn3 = new JButton("버튼3");
    	btn3.setEnabled(false);            //setEnabled:버튼 눌리지 않게 비활성화
    	add(btn3);
    	
    	setSize(250,250);
    	setVisible(true);
    	
    }
	public static void main(String[] args) {
		// 컴포넌트연습
        new exam07();
	}

}
