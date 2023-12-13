package j0807;

import java.util.Scanner;

public class exam17 {

	public static void main(String[] args) {
		// 실습03
		
        Scanner s1 = new Scanner (System.in);
		
		System.out.println ("원본 문자열 : 자바는 재밌어요~~ Java is Funny ^^");
		String target = "자바는 재밌어요~~ Java is Funny ^^";
		
		
		target = target.toUpperCase(); //대문자로 치환
        System.out.println("모두 대문자로: " +target);
        
        target = target.toLowerCase(); //소문자로 치환
        System.out.println("모두 소문자로: " +target); 
        
        String indexOfTestOne = "자바는 재밌어요~~ Java is Funny ^^"; 
	    System.out.println("Java 글자의 시작 위치 : "+ indexOfTestOne.indexOf("Java") );
		

	}

}
