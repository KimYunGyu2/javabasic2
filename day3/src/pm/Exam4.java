package pm;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		//
		// 숫자를 하나 입력받아서 0인지의 여부를 판단하는 프로그램을 만드세요

//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 >> ");
//		int num = sc.nextInt();
//		
//		String answer = num == 0 ? "입력하신 숫자는 0입니다": "입력하신 숫자는 0이 아닙니다";
//		System.out.println(answer);

		// 90점 이상이면 A 80점 이상이면 B ...
		// 98점 이상이면 A+, 94점 미만이면 A-, 나머지는 A

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 >> ");
		int score = sc.nextInt();
		String grade = "";
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";			
		} else {
			grade = "F";
		}
		
		
		if (score == 100) {
			grade = grade + "+";
		} else if (score <= 59) {
			grade = grade;
		} else if (score % 10 >= 7) {
			grade = grade + "+";
		} else if (score % 10 <= 3) {
			grade = grade + "-";
		}

		System.out.println("당신의 점수는 " + score + "이고 학점은 " + grade + "입니다");

	}}