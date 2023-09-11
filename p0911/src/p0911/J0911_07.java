package p0911;

import java.util.Scanner;

public class J0911_07 {

	static Scanner scan = new Scanner(System.in); //객체선언 - scan 인스턴스변수
	
	public static void main(String[] args) {
		System.out.println("학번을 입력하세요.");
		int stuNum = scan.nextInt();
		String name = nameInput();
		int kor = korInput();
		
		System.out.println("학번 : "+stuNum);
		System.out.println("이름 : "+name); 
		System.out.println("국어점수 : "+kor);

	}
	
	//클래스메소드 - 객체선언 없이 클래스명.메소드명
	static String nameInput() {
		String name = ""; //지역변수
		System.out.println("이름을 입력하세요.");
		name = scan.next();
		return name;
	}//
	
	//korInput()
	static int korInput() {
		int kor = 0;
		System.out.println("국어점수를 입력하세요.");
		kor = scan.nextInt();
		return kor;
	}

}
