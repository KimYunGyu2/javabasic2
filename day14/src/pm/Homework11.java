package pm;

import java.util.Scanner;

public class Homework11 {

	static int[] arraySrchIdx(int[] a, int x) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				count++;
			}
		}
		int[] c = new int[count--];
		for (int i = a.length - 1; count >= 0; i--) {
			if (a[i] == x) {
				c[count--] = i;
			}
		}
		return c;
	}

	static int[] arrayRmvOf(int[] a, int idx) {
		int[] c = new int[a.length - 1];
		if (idx >= 0 && idx < a.length) {
			for (int i = idx; i < a.length - 1; i++) {
				a[i] = a[i + 1];
			}
			for (int i = 0; i < c.length; i++) {
				c[i] = a[i];
			}
		}
		return c;
	}

static int[] arrayRmvOfN(int[] a, int idx, int n) {
	if(n < 0 || idx < 0 || idx > a.length)
		return a.clone();
	else {
		if(idx + n > a.length)
			n = a.length - idx;
		int[] c = new int[a.length-n];
		for(int i = 0; i < idx; i++)
			c[i] = a[i];
		for(int i = idx; i < a.length - n; i++)
			c[i] = a[i+n];
		return c;
	}
}

static int[] arrayInsOf(int[] a, int idx, int x) {
	int[] c = new int[a.length + 1];
	if(idx >=0 && idx < a.length) {	
		for(int i = 0; i < idx; i++) {
			c[i] = a[i];
		}
		for(int i = idx; i < a.length+1; i++) {
			c[i] = a[i-1];
		}
		c[idx] = x;
	}
	return c;
}

	public static void main(String[] args) {
		// 7-23
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		System.out.print("탐색할 값 : ");
		int search = sc.nextInt();
		int[] y = arraySrchIdx(x, search);
		
		if(y.length == 0) {
			System.out.println("일치하는 요소가 없습니다.");
		} else {
			System.out.println("일치하는 요소의 인덱스");
			for(int i = 0; i<y.length; i++) {
				System.out.println(y[i]);
			}
		}
		
		//7-24
		System.out.print("요소 수 : ");
		int num2 = sc.nextInt();
		int[] a = new int[num2];
		for(int i = 0; i < num2; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		System.out.print("삭제할 요소의 인덱스 : ");
		int rmnum = sc.nextInt();
		
		int[] b = arrayRmvOf(a, rmnum);
		
		if(rmnum >=0 && rmnum < a.length) {
			for(int i = 0; i < a.length-1; i++) {
				System.out.println("b[" + i + "] = " + b[i]);
			}
		} else {
			System.out.println("인덱스값을 잘못 입력했습니다.");
		}
		
		//7-25
		
		System.out.print("요소 수 : ");
		int num3 = sc.nextInt();
		int[] c = new int[num3];
		for(int i = 0; i < num3; i++) {
			System.out.print("c[" + i + "] : ");
			c[i] = sc.nextInt();
		}
		System.out.print("삭제를 시작할 인덱스 : ");
		int rStartIdx = sc.nextInt();
		System.out.print("삭제할 요소의 개수 : ");
		int remNum = sc.nextInt();
		
		int[] d = arrayRmvOfN(c, rStartIdx, remNum);
		
		for(int i = 0; i < d.length; i++) {
			System.out.println("d[" + i + "] = " + d[i]);
		}
		
		//7-26
		
		System.out.print("요소 수 : ");
		int num4 = sc.nextInt();
		int[] e = new int[num4];
		for(int i = 0; i < num4; i++) {
			System.out.print("e[" + i + "] : ");
			e[i] = sc.nextInt();
		}
		System.out.print("삽입할 인덱스 : ");
		int insIdx = sc.nextInt();
		System.out.print("삽입할 값 : ");
		int insVal = sc.nextInt();
		
		int[] f = arrayInsOf(e, insIdx, insVal);
		
		for(int i = 0; i < f.length; i++) {
			System.out.println("f[" + i + "] = " + f[i]);			
		}
		
		//7-27
		//???
		
		
				

	}
}

