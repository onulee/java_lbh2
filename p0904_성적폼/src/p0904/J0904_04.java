package p0904;

import java.util.Scanner;

public class J0904_04 {

	public static void main(String[] args) {
		// 90점이상 A, 80점이상 B, 70점이상 C, 60점이상 D, F
		// 점수를 입력받아, 성적을 출력하시오.
		// 98점이상 A+, 93이하 A-
		Scanner scan = new Scanner(System.in);
		String grade = "";
		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		if (score >= 90) {
			// System.out.print("A");
			grade = "A";
			if (score >= 98) {
				// System.out.println("+");
				grade = grade + "+";
			} else if (score <= 93) {
				// System.out.println("-");
				grade = grade + "-";
			} else {
				// System.out.println();
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 88) {
				grade = grade + "+";
			} else if (score <= 83) {
				grade = grade + "-";
			}
		} else if (score >= 70) {
			grade = "C";
			if(score >=78) {
				grade = grade + "+";
			}else if(score<=73) {
				grade += "-";   // grade = grade + "-"
			}
		} else if (score >= 60) {
			grade = "D";
			if(score>=68) {
				grade = grade + "+";
			}else if(score<=63) {
				grade = grade + "-";
			}
		} else {
			grade = "F";
		}

		System.out.println("학점 : " + grade);
		System.out.println("점수 : " + score);

	}

}
