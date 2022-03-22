package pm;

import java.util.Scanner;

public class Homework8 {

public static void putChar(int n, char c){
	for(int i = 0; i < n; i++) {
		System.out.print(c);
	}
}

public static void putStart(int n) {
	putChar(n, '*');
	
}
	
	public static void main(String[] args) {
		// 7-8
		Scanner sc = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		System.out.print("단수는 : ");
		int no = sc.nextInt();
	    for(int i =1; i<= no; i++) {
	    	putStart(i);
	    	System.out.println();
	    }

	}

}
