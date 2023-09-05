package p0904;

import java.util.Scanner;

public class J0904_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//두수를 입력받아, 두수의 곱을 맞추는 프로그램을 구현하시오.
		// 1. 두수를 입력받아, 출력하시오.
		// 2. 두수의 곱의 정답을 입력해서, 맞으면 정답, 틀리면 오답이라고 출력하시오.
//		System.out.println("1번째 숫자를 입력하세요.");
//		int num1 = scan.nextInt();
//		System.out.println("2번째 숫자를 입력하세요.");
//		int num2 = scan.nextInt();
//		
//		System.out.printf("%d*%d 는 얼마일까요? \n",num1,num2);
//		int score = scan.nextInt();
//		if(score==(num1*num2) ) {
//			System.out.println("정답입니다.");
//		}else {
//			System.out.println("오답입니다.");
//		}
		
		
		
//		System.out.println("5*4 는 얼마일까요?");
//		int score = scan.nextInt();
//		if(score==20) {
//			System.out.println("정답입니다.");
//		}else {
//			System.out.println("오답입니다.");
//		}
		
		
		System.out.println("사랑을 영어로 무엇일까요?");
		String result = scan.next();
		if(result.equalsIgnoreCase("love")) {  //8가지 기본타입이 아닌 경우, equals명령어 사용
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		
	
	}//main
}//class
