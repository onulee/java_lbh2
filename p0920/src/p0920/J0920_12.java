package p0920;

import java.util.Scanner;

public class J0920_12 {

	public static void main(String[] args) {
		// 16가1023456 -> 가 앞과 뒤를 랜덤숫자로 저장해서, 입력한 값과 비교해서 맞는 개수를 출력하시오.
		// 26나2320411
		//------------------
		// 맞는 개수 : 3개
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			//랜덤번호 생성
			int random1 = (int)(Math.random()*100);
			String rno1 = String.format("%02d", random1);
			int random2 = (int)(Math.random()*1000000);
			String rno2 = String.format("%07d", random2);
			String randomNo = rno1+"가"+rno2;
			System.out.println("랜덤번호 : "+randomNo);
			//번호 입력
			System.out.println("-------------------");
			System.out.println("--- 대박! 랜덤 복권 ---");
			System.out.println("-------------------");
			System.out.println("복권번호를 입력하세요.>>");
			String input = scan.next();
			// 길이가 잘못 입력되었다면 다시 입력하세요. length() : 10
			if(input.length()!=10) {
				System.out.println("입력이 잘못되었습니다! 다시 입력하세요!!");
				System.out.println();
				continue; //1번 reset  //break;
			}
			
			System.out.println();
			System.out.println("입력번호 : "+input);
			System.out.println("랜덤번호 : "+randomNo);
			
			//비교
			// 맞는 개수 : 3개
			// 입력번호 1개 추출, 랜덤번호 1개 추출 비교
			int count=0;
			
			for(int i=0;i<input.length();i++) {
				if(input.charAt(i)==randomNo.charAt(i)) {
					count++;
				}
			}
			
			
			System.out.println("맞는 개수 : "+count);
			
			
			
		}
		
		
		
		
		

	}

}
