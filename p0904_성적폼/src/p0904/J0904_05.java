package p0904;

import java.util.Scanner;

public class J0904_05 {

	public static void main(String[] args) {
		// 10,5 두수를 입력받아, 큰수를 출력하시오.
		// 1. 두수를 입력받아 출력하시오.
		// 2. 두수를 비교해서 큰수 출력하시오.
		
		// 두수를 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("1번째 입력>>");
		int num1 = scan.nextInt();
		System.out.println("2번째 입력>>");
		int num2 = scan.nextInt();
		
		// 두수를 비교
		if(num1>num2) {
			System.out.println("큰수 : "+num1);
			System.out.println("작은수 : "+num2);
		}else if(num1<num2) {
			System.out.println("큰수 : "+num2);
			System.out.println("작은수 : "+num1);
		}else {
			System.out.println("두수가 같습니다.");
		}
		
		
		//두수를 출력
		System.out.printf("1: %d, 2: %d \n",num1,num2);

	}

}
