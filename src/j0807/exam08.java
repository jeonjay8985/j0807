package j0807;

import java.awt.*;

import javax.swing.*;

public class exam08 extends JFrame {
       exam08() {
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   setTitle("이미지 실습");
	   
	   Container c=getContentPane();
	   c.setLayout(new FlowLayout());
	   
	   ImageIcon img1 = new ImageIcon("images/java1.png");
	   JButton btn1 = new JButton("버튼1", img1);
	   add(btn1);
	   
	   JLabel lbl1 = new JLabel("라벨1입니다");      //라벨=레이블. 내가 이해하기 쉽도록 ㅎㅎ
	   ImageIcon img2 = new ImageIcon("images/java2.png");
	   JLabel lbl2 = new JLabel(img2);
	   add(lbl1);
	   add(lbl2);
	   
	   JCheckBox chk1 = new JCheckBox("C++");
	   JCheckBox chk2 = new JCheckBox("Java");
	   JCheckBox chk3 = new JCheckBox("C#", true); //true->시작하자마자 C#에 체크가 되어져 있음!	  
	   
	   add(chk1);
	   add(chk2);
	   add(chk3);
	   
	   JRadioButton rdo1 = new JRadioButton("고래");
	   JRadioButton rdo2 = new JRadioButton("상어");
	   JRadioButton rdo3 = new JRadioButton("새우");
	   
	   add(rdo1);
	   add(rdo2);
	   add(rdo3);
	   ButtonGroup grp1 = new ButtonGroup();   //라디오버튼은 그룹을 생성해야함!
	   grp1.add(rdo1);
	   grp1.add(rdo2);
	   grp1.add(rdo3);
	  
	   setSize(200, 300);
	   setVisible(true);
   }
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new exam08();
	}
}
