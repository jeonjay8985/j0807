package j0807;

import java.util.Scanner;

class Odd{
	int n;
	void Scan() {
		System.out.print("숫자를 입력하세요 :");
		Scanner s1=new Scanner(System.in);
		n=s1.nextInt();	
	}
	void oddsum() {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==1) {
				sum += i;
			}
		}
		
		System.out.printf("홀수의 합 : %d\n",sum);
		
	}
}
class OddEven extends Odd{
	void evensum() {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		
		System.out.printf("짝수의 합 : %d\n",sum);
		
	}
	
}
class exam26{
	public static void main(String[] args) {
		OddEven num=new OddEven();
		num.Scan();
		num.evensum();
		num.oddsum();

	}
}
