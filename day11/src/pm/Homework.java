package pm;

import java.util.Random;
import java.util.Scanner;

public class Homework {
	
	public static int min(int a, int b, int c) {
		int min = a;
		if(a > b) {
			if(b>c) {
				min = c;
			}else {
				min =b;
			}
		}else if(a < b) {
			if(a < c) {
				min = a;
			}else {
				min = c;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("정수 a : ");
		int a1 = sc.nextInt();
		System.out.print("정수 b : ");
		int b1 = sc.nextInt();
		System.out.print("정수 c : ");
		int c1 = sc.nextInt();
		
		min(a1, b1, c1);
				
		System.out.println("최솟값은 " + min(a1, b1, c1) +"입니다.");
		
		
	}
}

