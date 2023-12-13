package j0807;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class exam14 extends JFrame{
	exam14(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이벤트 실습");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField txt1= new JTextField(10);
		JTextArea area = new JTextArea(10, 10);
		add(txt1);
		add(area);
		add(new JScrollPane(area));
		
		txt1.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {    //KeyReleased:키를 떼면 작동하는 이벤트
				int key = e.getKeyCode();
				if(key==KeyEvent.VK_ENTER) {         //엔터키가 눌러졌는지 체크
					String str=txt1.getText();
					area.setText(area.getText()+str+'\n');
					txt1.setText("");                //엔터키로 값을 area로 넘긴 후 text를 클리어시켜줌
				}
				
				if(!(key>=KeyEvent.VK_0 && key <=KeyEvent.VK_9)) {
					String str=txt1.getText();
					int strlen=str.length();
					
					if(strlen !=0) {                 //TextField에 뭔가가 입력이 되어있다는 말
						txt1.setText(str.substring(0, strlen-1)); //서브스트링으로 잘라서 숫자만 보여줌
					}
				}
				
			}
		});
		
		setSize(200, 200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// 키보드 이벤트
		
		new exam14();

	}

}
