package p0831;

public class JA0831_07 {

	public static void main(String[] args) {
		double d = 1.6;
		int i = (int)d; // int 형변환 - 정수부분만 입력
		System.out.println(i);
		
		int x = 10;
		double d2 = x; // 자동형변환 - 형변환 생략가능 
		System.out.println(d2);
		
		// 크기순선 : char,byte,short -> int -> long -> float -> double -> String 
		
		System.out.println(10/3.0);
		// 실수형값 %f, 정수형값 %d, 문자열값 %s
		System.out.printf("%.1f \t", 10/3.0); //  \n:줄바꿈, \t:사이띄움
		System.out.println("안녕하세요.");
		System.out.printf("%s \n", "홍길동입니다.");
		System.out.printf("%,15d \n", 100000000); //, 천단위표시 | 0 -> 남는자리 0으로 채움.
		System.out.printf("국어 : %d, 영어 : %d \n", 100,99);

	}

}
