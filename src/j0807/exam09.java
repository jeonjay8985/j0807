package j0807;

import java.awt.*;

import javax.swing.*;

public class exam09 extends JFrame{
    exam09() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setTitle("컴포넌트 연습");
    	Container c = getContentPane();
    	c.setLayout(new FlowLayout());
    	
    	JTextField txt1 = new JTextField(10);
    	add(txt1);
    	
    	JTextArea txt2 = new JTextArea(5, 10); //5줄&길이10
        add(txt2);
        add(new JScrollPane(txt2));            //스크롤바 추가!
        
        JPasswordField txt3 = new JPasswordField(10); //패스워드 안보임! ....으로만 표시됨
        add(txt3);
        
    	setSize(200, 200);
    	setVisible(true);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new exam09();

	}

}
