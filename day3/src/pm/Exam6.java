package pm;

import java.util.Random;
import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		// 3자리의 양의 정수값(100~999)을 읽는 프로그램을 작성하세요
		// 입력한 값이 3의 양의 정수가 아니면 다시 입력하게 하세요 do~while
		// 세자리의 정수 >>> 
//		int a;
//		do {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("세자리의 정수 >> ");
//			a = sc.nextInt();
//			}
//		while(a < 100 || a > 999);
//		System.out.println("입력한 값은 " + a + " 입니다.");
		
//		숫자 맞추기 게임
//		10부터 99 사이의 숫자를 맞추세요
//		어떤 숫자일까요?
//		더큰 숫자입니다.
		// 10~99사이로 난수발생
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("10부터 99 사이의 숫자를 맞추세요");
		int no = 10 + rand.nextInt(90);
		int num;
		do {
			System.out.print("어떤 숫자일까요? ");
			num = sc.nextInt();		
			if(no < num) {
				System.out.println("더 작은 숫자 입니다");
			} else if(no > num) {
				System.out.println("더 큰 숫자 입니다");				
			}			
		}while(no!=num);
		System.out.println("정답입니다.");
		
		
		
		

	}

}
