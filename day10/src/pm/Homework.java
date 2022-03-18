package pm;

import java.util.Scanner;
import java.util.Random;

public class Homework {

	public static void main(String[] args) {
		// 6-14
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int ele3 = sc.nextInt();
		int f[] = new int[ele3];
		int g[] = new int[f.length];
		for(int i = 0; i < f.length; i++) {
			System.out.print("f[" + i + "] = ");
			int element3 = sc.nextInt();
			f[i] = element3;
		}
		
		for(int i = 0; i < f.length; i++) {
			g[i] = f[f.length-1-i];
			System.out.println("g[" + i + "] = " + g[i]);
		}


	}
}
