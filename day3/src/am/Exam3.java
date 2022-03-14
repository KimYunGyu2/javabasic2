package am;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		
		// 메뉴 선택
		// 1) 빅맥
		// 2) 타코
		// 3) 백반
//	원하는 메뉴를 선택하세요 (종료:0)

		
		
		while(true) {
			System.out.println("메뉴선택");
			System.out.println("1) 빅맥");
			System.out.println("2) 타코");
			System.out.println("3) 백반");
			System.out.print("원하는 메뉴를 선택하세요 (종료: 0) ");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			if (choice == 1) {
				System.out.println("선택하신 메뉴는 "+choice+"번입니다.");
				continue;
			}
			if (choice == 2) {
				System.out.println("선택하신 메뉴는 "+choice+"번입니다.");
				continue;
			}
			if (choice == 3) {
				System.out.println("선택하신 메뉴는 "+choice+"번입니다.");
				continue;
			}
			if (choice == 0){
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("메뉴를 잘못선택하셨습니다");
			}
		}
		
		
		
		

	}

}
