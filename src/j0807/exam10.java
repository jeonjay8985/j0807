package j0807;

import java.awt.*;

import javax.swing.*;

public class exam10 extends JFrame {
	exam10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("컴포넌트 연습");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		String pet[]= {"고양이", "강아지", "토끼", "코알라", "송아지"};
		JList list = new JList(pet);          //ctrl(or shift)+여러가지 선택가능
		add(list);
		
		JComboBox combo = new JComboBox(pet); 
		add(combo);
		
		setSize(200, 200);
		setVisible(true);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new exam10();

	}

}
