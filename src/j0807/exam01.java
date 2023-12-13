package j0807;

import java.awt.*;                   //awt.* 밑에 오는 전부를 사용하겠다
                                     //swing.* 밑에 오는 전부를 사용하겠다
import javax.swing.*;                //ctrl+shift+o


public class exam01 {
	
	static class MyGUI extends JFrame{
		MyGUI() {                    //생성자(=클래스이름)
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("GUI 연습");     //윈도우 창 제목
		
			this.setLayout(new FlowLayout());
			JButton btn1=new JButton("버튼1"); //버튼 생성
			JButton btn2=new JButton("Button2"); 
			JButton btn3=new JButton("버튼3"); 
			JButton btn4=new JButton("버튼4"); 
			JButton btn5=new JButton("버튼5"); 
			
			add(btn1);                        //버튼 부착
			add(btn2); 
			add(btn3); 
			add(btn4); 
			add(btn5); 
			
		setSize(250, 250);            
	    setVisible(true);            
		}
	}

	public static void main(String[] args) {
		// 플로우 레이아웃 FlowLayout
        new MyGUI();
		
		
	}

}
