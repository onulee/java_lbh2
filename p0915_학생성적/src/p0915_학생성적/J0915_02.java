package p0915_학생성적;

import java.util.Scanner;

public class J0915_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction(); //객체선언
		int stuCount = 1;
		
		
		//무한반복
		while(true) {
			//메인화면 출력부분
			int choice = stuAction.mainPrint();
			
			switch(choice) {
			case 1: 
				//1. 학생입력 메소드
				stuCount = stuAction.stuInput(stuCount);
				break;
			case 2: 
				//2. 학생성적출력 메소드
				stuAction.stuOutput();
				break;
			case 3:
				//3. 학생성적수정 메소드
				System.out.println();
				System.out.println("[ 학생성적 수정 ]");
				System.out.printf("찾고자 하는 학생 이름을 입력하세요.(0.이전페이지 이동)\n");
				String name = scan.next();
				if(name.equals("0")) { //이전페이지 이동
					System.out.println(">> 이전페이지로 이동합니다!!");
					System.out.println();
					break;
				}
				
				//홍길동
				int count = 0;
				for(int i=0;i<stuAction.list.size();i++) {
				
					StuScore s = (StuScore) stuAction.list.get(i);
					if(name.equals(s.getName())) {
						count = i; //찾은 방 번호
						System.out.printf("%s 학생을 찾았습니다.\n",name);
						System.out.println("[ 수정과목 선택 ] ");
						System.out.println("1. 국어");
						System.out.println("2. 영어");
						System.out.println("3. 수학");
						System.out.println("------------------");
						System.out.println("원하는 번호를 선택하세요.");
						choice = scan.nextInt();
						
						switch(choice) {
						case 1:
							System.out.println("[ 국어과목 수정 ]");
							System.out.println("-----------------------");
							System.out.println("현재점수 : "+ s.getKor());
							System.out.println("변경할 점수를 입력하세요.");
							s.setKor(scan.nextInt()); //입력 후 바로 국어점수에 저장
							s.setTotal(s.getKor()+s.getEng()+s.getMath()); //점수를 읽은 후 바로 합계 수정
							s.setAvg(s.getTotal()/3.0); //평균 수정
							System.out.println("국어점수가 변경되었습니다!");
							System.out.println();
							break;
						}
					}
				
				
				}//for
				
				
				break;
				
				
			}//switch
			
		}//while
		
		
		

	}//main
}//class
