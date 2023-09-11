package p0911;

import java.util.Scanner;

public class J0911_10 {

	public static void main(String[] args) {
		Cal c = new Cal();
		Scanner scan = new Scanner(System.in);
		System.out.println("1번째 숫자 : "); 
		c.num1 = scan.nextInt();
		System.out.println("2번째 숫자 : ");
		c.num2 = scan.nextInt();
		System.out.println(c);
		calculate(c);
		System.out.println("더하기 결과값 : "+c.addResult);
		System.out.println("빼기 결과값 : "+c.subResult);
		System.out.println("곱하기 결과값 : "+c.multiResult);
		System.out.println("나누기 결과값 : "+c.divResult);
	}
	
	static void calculate(Cal c2) {
		System.out.println(c2);
		c2.addResult = c2.num1 + c2.num2;
		c2.subResult = c2.num1 - c2.num2;
		c2.multiResult = c2.num1 * c2.num2;
		c2.divResult = c2.num1 / (double)c2.num2;
	}

}
