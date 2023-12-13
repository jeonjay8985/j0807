package j0807;

import java.util.Scanner;

public class exam20 {

	public static void main(String[] args) {
		// 실습06
		
		Scanner s1= new Scanner(System.in);
		
		System.out.println("## 메뉴 선택 ##");
		System.out.println("[1]구매자 [2]판매자");
		System.out.print("## 메뉴를 선택하세요 ->");
		int menu=s1.nextInt();
		
		if(menu==1) {
			System.out.print("환영합니다! 구매자로 로그인하셨습니다");
		}else if(menu==2) {
			System.out.print("환영합니다! 판매자로 로그인하셨습니다");
		}

	}

}
