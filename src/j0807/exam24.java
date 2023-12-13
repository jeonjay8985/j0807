package j0807;

import java.awt.*;
import javax.swing.*;

public class exam24 extends JFrame{
	exam24() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setTitle("컴포넌트 연습");
    	Container c = getContentPane();
    	c.setLayout(new FlowLayout());
    	
    	JTextArea txt2 = new JTextArea(7, 20); //7줄&길이20
        add(txt2);
        add(new JScrollPane(txt2));            //스크롤바 추가!
        
        setSize(200, 200);
    	setVisible(true);
		
	}


	public static void main(String[] args) {
		// 실습10
		
		new exam24();
	}

}
