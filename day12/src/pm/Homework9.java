package pm;

import java.util.Scanner;

public class Homework9 {
	static int linearSearch(int[] a, int key) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	static int linearSearchR(int[] a, int key) {
		for(int i = a.length-1; i >= 0; i--) {
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("요소수 : ");
		int no = sc.nextInt();
		
		int[] arr = new int[no];
				
		for(int i = 0; i < no; i++) {
			System.out.print("arr["+i+"] = ");
			arr[i] = sc.nextInt();
		}
		System.out.print("찾는 값 : ");
		int search = sc.nextInt();
		
		int idT = linearSearch(arr, search);
		int idB = linearSearchR(arr, search);
		
		if(idT == -1) {
			System.out.println("해당 값은 존재하지 않습니다.");
		} else if(idT == idB) {
			System.out.println("해당 값은 arr[" + idT + "]에 있습니다.");
		} else {
			System.out.println("해당 값의 요소가 여러개 존재합니다.");
			System.out.println("가장 앞에 위치한 값은 arr[" + idT + "]에 있습니다.");
			System.out.println("가장 뒤에 위치한 값은 arr[" + idB + "]에 있습니다.");
		}
	}
}
