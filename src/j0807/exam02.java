package j0807;

import java.awt.*;

import javax.swing.*;

public class exam02 {
    static class MyGUI extends JFrame{
    	MyGUI() {
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		setTitle("BorderLayout 연습");		
    		this.setLayout(new BorderLayout(10,10));      //버튼들 사이 간격 주기
    		
    		JButton btn1 = new JButton("버튼1");
    		JButton btn2 = new JButton("버튼2");
    		JButton btn3 = new JButton("버튼3");
    		JButton btn4 = new JButton("버튼4");
    		JButton btn5 = new JButton("버튼5");
    		
    		add(btn1, BorderLayout.NORTH);                        
			add(btn2, BorderLayout.WEST); 
			add(btn3, BorderLayout.CENTER); 
			add(btn4, BorderLayout.EAST); 
			add(btn5, BorderLayout.SOUTH); 
			
    	    setSize(250,250);
    	    setVisible(true);
    	}
    }
	public static void main(String[] args) {
		// BorderLayout 보더 레이아웃
         new MyGUI();
	}

}
