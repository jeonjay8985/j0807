package j0807;

import java.util.Scanner;

public class exam19 {

	public static void main(String[] args) {
		// 실습05
		
		Scanner s1 = new Scanner (System.in);
		
		int sum=0;
		float avg=0f;
		int i=0;
		
		System.out.println("점수를 입력하세요");
		int score;
		
		while(true) {
			score = s1.nextInt();
			
			if(score !=0) {
				sum=sum+score;
				i++;
			}else break;
		}
		
		avg=sum/i;
		System.out.println("  kk : "+sum+"  "+i);
		System.out.printf("입력된 수의 개수는 %d개이며 평균은 %.1f입니다", i, avg);
		


	}

}
