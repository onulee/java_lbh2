package p0908;

import java.util.Arrays;
import java.util.Scanner;

public class J0908_01_로또 {

	public static void main(String[] args) {
		
		// [ 순서 ]
		//1. 선언
		//2. 로또번호 순차입력
		//3. 로또번호 섞기
		//4. 6개 당첨번호 추출
		//5. 번호직접입력
		//6. 당첨번호출력
		//7. 직접입력한 번호출력
		//8. 당첨개수확인 출력
		//9. 본인 맞춘 당첨번호 출력
		
		// Arrays.sort -> 1,13,2,5,22,30
		//                1,13,2,22,30,50
		
		Scanner scan = new Scanner(System.in);
		
		//선언
		int[] lotto = new int[45];
		int[] myNo = new int[6];
		int[] winNo = new int[6];
		int[] myWinNo = new int[6];  //당첨된 번호
		int temp=0,count=0;
		
		//로또번호 순차입력
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1; //1-45
		}//for
		
		//로또번호 섞기
		for(int i=0;i<400;i++) {
			int random = (int)(Math.random()*45); //0-44
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}//for
		
		//6개 당첨번호 추출
		for(int i=0;i<6;i++) {
			winNo[i] = lotto[i];
		}
		System.out.println(Arrays.toString(winNo));
		System.out.println("---------------------------------");
		System.out.println("--------   로또번호 입력    --------");
		System.out.println("---------------------------------");
		
		//번호직접입력
		for(int i=0;i<6;i++) {
			System.out.println("로또번호를 입력하세요. ");
			myNo[i] = scan.nextInt();
		}
		
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("--------     당첨 확인     --------");
		System.out.println("---------------------------------");
		
		
		//당첨번호출력
		System.out.print("★ 당첨번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",winNo[i]);
		}
		System.out.println();
		
		//직접입력한 번호출력
		System.out.print("☆ 입력번호 : ");
		for(int i=0;i<6;i++) {
			System.out.printf("%d ",myNo[i]);
		}
		System.out.println();
		
		//당첨개수확인 출력
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(winNo[i]==myNo[j]) {
					myWinNo[count] = winNo[i];  //[i] 번호가 똑바로 안들어감.
					count++;
					break; //j
				}
			}
		}//for
		
		System.out.println("※ 당첨개수 : "+count);
		
		System.out.print("◆ 맞춘 당첨번호 : ");
		for(int i=0;i<count;i++) {
			System.out.printf("%d ",myWinNo[i]);
		}
		System.out.println();
		

	}//main

}//class
