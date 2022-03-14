package pm;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		// 가위 바위 보 게임
		// input) 가위(1), 바위(2), 보(3) 중 하나를 입력하세요 >>>
		// 당신은 1입니다.
		// 컴은 1 입니다. 
		// 비겼습니다.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 >>> ");
//		int pers = sc.nextInt();
//		int comp = (int)(Math.random() * 3) + 1; // 1,2,3 중 하나가 comp 로 저장
//		System.out.printf("당신은 %d 입니다\n",pers);
//		System.out.printf("컴은 %d입니다\n",comp);
//		switch(pers-comp) {
//		case 0:
//			System.out.println("비겼습니다.");
//			break;
//		case 2: case -1:
//			System.out.println("당신이 졌습니다.");
//			break;
//		case 1: case -2:
//			System.out.println("당신이 이겼습니다.");
//			break;
//		}
		
//		2개의 변수 a,b를 입력 받아서 대소 관계를 표시하는 프로그램을 작성하시오.
//		a가 크다, b가 크다, 같다
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 수를 입력하세요 >> ");
//		int a = sc.nextInt();
//		System.out.print("두번째 수를 입력하세요 >> ");
//		int b = sc.nextInt();
//		
//		if (a > b) {
//			System.out.printf("%d(이)가 크다\n", a);
//		} else if (a < b) {
//			System.out.printf("%d(이)가 크다\n", b);
//		} else {
//			System.out.println("같다");
//		}
		
		// 사용자로부터 3개의 정수를 입력받아 그중 최소값을 출력하는 프로그램을 작성하자.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째정수 입력 >> ");
//		int a = sc.nextInt();
//		System.out.print("두번째정수 입력 >> ");
//		int b = sc.nextInt();
//		System.out.print("세번째정수 입력 >> ");
//		int c = sc.nextInt();
//		
//		int min = a;
//		
//		if (b < min) {
//			min = b;
//		}
//		if (c < min) {
//			min = c;
//		}
//		System.out.println("최소값은 " + min + " 입니다.");

		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째정수 입력 >> ");
//		int a = sc.nextInt();
//		System.out.print("두번째정수 입력 >> ");
//		int b = sc.nextInt();
//		System.out.print("세번째정수 입력 >> ");
//		int c = sc.nextInt();
//		
//		int temp = 0;
//		while (!(a<b && b<c)) {		
//			if (a>b) {
//				temp = a;
//				a = b;
//				b = temp;
//			}		
//			if (b>c) {
//				temp = b;
//				b = c;
//				c = temp;
//			}		
//			if (a>c) {
//				temp = a;
//				a = c;
//				c = temp;
//			}
//		}
//		System.out.printf("%d, %d, %d", a,b,c);		
			
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째정수 입력 >> ");
//		int a = sc.nextInt();
//		System.out.print("두번째정수 입력 >> ");
//		int b = sc.nextInt();
//		System.out.print("세번째정수 입력 >> ");
//		int c = sc.nextInt();
		
		// a가 b보다 크면 a와 b를 교환 12 13 11
		
		// b가 c보다 크면 b와 c를 교환 12 11 13
		
		// a가 b보다 크면 a와 b를 교환 11 12 13
//		int temp;
//		if (a > b) {
//			temp = a;
//			a = b;
//			b = temp;
//		}
//		if (b > c) {
//			temp = b;
//			b = c;
//			c = temp;
//		}
//		if (a > b) {
//			temp = a;
//			a = b;
//			b = temp;
//		}
//		
//		System.out.println(a + " " + b + " " + c);
		
		// 3자리의 양의 정수값(100~999)을 읽는 프로그램을 작성하세요
		// 입력한 값이 3의 양의 정수가 아니면 다시 입력하게 하세요 do~while
		// 세자리의 정수 >>> 
		int a;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.print("세자리의 정수 >> ");
		a = sc.nextInt();
		}
		while(!(a >99 && a < 1000));
		System.out.println("입력한 값은 " + a + " 입니다.");
	}

}
