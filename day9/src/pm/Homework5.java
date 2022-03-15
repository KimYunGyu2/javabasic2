package pm;

import java.util.Random;
import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		 Random random = new Random();
		 Scanner sc = new Scanner(System.in);
		 int comp = random.nextInt(100);
		 int count = 6;
		 int cnt = 0;
		 System.out.println("숫자 맞추기 게임 시작!");
		 System.out.println("0부터 99사이의 숫자를 맞추세요.");
		 for(int i = 0; i < count; i++) {
			 System.out.print("남은 횟수 "+ (count-cnt) +"회, 어떤 숫자일까? : ");
			 cnt += 1;
			 int guess = sc.nextInt();
			 if(guess == comp) {
				 System.out.println(cnt + "회만에 맞추었습니다.");
				 break;
			 } else if(guess > comp) {
				 System.out.println("더 작은 숫자입니다.");
			 } else {
				 System.out.println("더 큰 숫자입니다.");
			 }		 
			 
		 }
		 if (count-cnt == 0) {
			 System.out.println("맞추지 못했습니다. 정답은 " + comp + " 입니다.");
		 }
	}
}
