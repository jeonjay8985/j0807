package j0807;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class exam13 extends JFrame{
	exam13() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이벤트 실습");
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextField txtX = new JTextField(10);
		JTextField txtY = new JTextField(10);
		
		add(txtX);
		add(txtY);
		
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// 마우스클릭메소드
				txtX.setText(Integer.toString(e.getX())); //x좌표는 get엑스
				txtY.setText(Integer.toString(e.getY())); //y좌표는 get와이
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new exam13();
	}

}
