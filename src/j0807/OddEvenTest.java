package j0807;

import java.util.Scanner;

class O_dd{	
	int num;
	int sumEven;
	int sumOdd;
	
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
		
	}

	public int getSumEven() {
		return sumEven;
	}

	public void setSumEven(int sumEven) {
		this.sumEven = sumEven;
	}

	public int getSumOdd() {
		return sumOdd;
	}

	public void setSumOdd(int sumOdd) {
		this.sumOdd = sumOdd;
	}

	void print(){
		for(int i=1; i<=num; i+=2) {
			sumOdd=sumOdd+i;
        }
		System.out.println("홀수의 합 : "+sumOdd);
	} 
	
	//for(int i=1; i<=n; i++) {
	//if(i%2==1)->홀수, if(i%2==0)->짝수{
	//sum += i; } }

}

class Odd_Even extends O_dd {
	void print(){
		for(int i=2; i<=num; i=i+2) {
			sumEven=sumEven+i;
		}
		System.out.println("짝수의 합 : "+sumEven);
    }

}
    public class OddEvenTest{
	public static void main(String[] args) {
		

		Scanner s1 = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>");
		int num=s1.nextInt();
		
		O_dd od=new O_dd();
		od.setNum(num);
		od.print();
		
		Odd_Even oe=new Odd_Even();
		oe.setNum(num);
		oe.print();
		
		
	}
		// 실습04
		//1~n까지의 홀수의 합을 구하는 프로그램 - Odd클래스
		//1~n까지의 짝수의 합을 구하는 프로그램 - Odd클래스의 하위클래스, OddEven클래스
		//사용자로부터 입력된 값에 해당하는 짝수의 합, 홀수의 합을 출력하는 프로그램 - OddEvenTest클래스
			
    }	

	

