package p0920;

import java.util.Scanner;

public class J0920_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = "abcdefghijk";
		//f를 추출해서 출력하시오.
		// charAt()
		System.out.println(str.charAt(5));
		//fghi
		System.out.println(""+str.charAt(5)+str.charAt(6)+str.charAt(7)+str.charAt(8));
		
		//subString()
		System.out.println(str.substring(5,9)); //5부터 9앞에까지 가져오기
		System.out.println(str.substring(5)); //5부터 끝까지 가져오기
		
		String no = "com202311001"; //학번 com - 컴퓨터공학, 2023 - 입학년도, 11 - 담당교수, 001 - 번호
		// 입학년도와 번호를 출력하시오.
		System.out.println(no.substring(3,7));
		System.out.println(no.substring(9));
		//20231100
		System.out.println(no.substring(3,11));
		
		System.out.println("원하는 글자를 입력하세요.");
		//String input = scan.next();
		//입력한 길이를 알아내는 메소드
		//System.out.println("입력한 길이 : "+input.length());
		//System.out.println("1개 적게 가져온 문자 : "+input.substring(0,input.length()-1));
		//System.out.println("입력한 문자 : "+input);
		//System.out.println(input.substring(input.length()-1));
		// 안녕하세요.반갑습니다 -> 안~니
		
		String hobbys = "수영,조깅,독서,요리,영화감상,게임,골프,자전거,테니스";
		System.out.println(hobbys.contains("요리"));
		
		//요리가 포함이 되어 있으면 <strong>요리</strong>
		if(hobbys.contains("요리")) {
			System.out.println("<strong>요리</strong>");
		}else {
			System.out.println("요리");
		}
		

	}

}
