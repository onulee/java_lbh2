package p0915_test;

import java.util.Scanner;

public class J02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 4개의 숫자를 입력받아, JMethod cal2메소드를 만들어
		// 4개 숫자 더하기와 곱하기를 한 결과값을 main에서 출력하시오.

		//1.변수사용
//		System.out.println("1번째 숫자를 입력하세요.");
//		int n1 = scan.nextInt();
//		System.out.println("2번째 숫자를 입력하세요.");
//		int n2 = scan.nextInt();
//		System.out.println("3번째 숫자를 입력하세요.");
//		int n3 = scan.nextInt();
//		System.out.println("4번째 숫자를 입력하세요.");
//		int n4 = scan.nextInt();
//		
//		JMethod j = new JMethod();
//		int result = j.cal(n1,n2,n3,n4);
//		System.out.println("결과값 : "+result);
		
		//2. 배열사용
		int[] n = new int[4];
		for(int i=0;i<n.length;i++) {
			System.out.printf("%d번째 숫자를 입력하세요.\n",i+1);
			n[i] = scan.nextInt();
		}
		
		JMethod j = new JMethod();
//		int result = j.cal(n[0],n[1],n[2],n[3]);
		int result = j.cal(n);
		System.out.println("결과값 : "+result);
		
		

	}

}
