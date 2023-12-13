package j0807;

import java.util.Scanner;

class Od {
	int oddSum(int num) {
		int sum=0;
		for(int i=1; i<=num; i=i+2) {
			sum=sum+i;
		}
		return sum;
	}	
}

class OdEven extends Od{
	int oddEvensum(int num) {
		int sum=0;
		for(int i=2; i<=num; i=i+2) {
			sum=sum+i;
		}
		return sum;
	}
}

public class exam29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num=s1.nextInt();
		
	    OdEven oe = new OdEven();  //상속받았기 때문에 객체는 하나만 생성하면 됨!
	    System.out.printf("짝수의 합 : %d%n", oe.oddEvensum(num));
	    System.out.printf("홀수의 합 : %d%n", oe.oddSum(num));
	    
		

	}

}
