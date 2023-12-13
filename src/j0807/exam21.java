package j0807;

import java.util.Scanner;

public class exam21 {

	public static void main(String[] args) {
		// 실습07
		
		Scanner s1 = new Scanner (System.in);
		
		System.out.println("## 로그인(admin 혹은 임의 아이디) ##");
		
		String id;
		System.out.print("## 로그인 아이디:");
		id= s1.nextLine();
		
		if(id.equals("admin")) {
			System.out.println("관리자 로그인!!");
		}else {
			System.out.println(id+"로그인!!");
		}
		
		System.out.println("## 메뉴를 선택하세요(1~4) ##");
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.삭제");
		System.out.println("4.조회");
		
		int menu;
		System.out.print("#메뉴 선택:");
		menu=s1.nextInt();

		if(id.equals("admin")) {
			if(menu==1) {
				System.out.print("관리자 1번 선택함!");
			}else if(menu==2) {
				System.out.print("관리자 2번 선택함!");
			}else if(menu==3) {
				System.out.print("관리자 3번 선택함!");
			}else if(menu==4) {
				System.out.print("관리자 4번 선택함!");
			}
		}else {
			System.out.printf("%s %d번 선택함!", id, menu);
		
	  }
	 }
	}


