package j0807;

import java.util.Scanner;

public class exam15 {

	public static void main(String[] args) {
		// 실습01
		
		Scanner s1 = new Scanner(System.in);
		
		String nation;
		String name;
		int age;
		float height;
		
		System.out.print("국적 : ");
		nation=s1.nextLine();
		
		System.out.print("이름 : ");
		name=s1.nextLine();
		
		System.out.print("나이 : ");
	    age=s1.nextInt();
	    
	    System.out.print("키 : ");
	    height=s1.nextFloat();
		
		System.out.print("나의 국적은 " + nation + "이며 ");
		
		System.out.println("이름은 " + name + "입니다");
		
		System.out.print("나이는 " + age + "이며 ");
		
		System.out.println("키는 " + height + "입니다");
	
		

	}

}
