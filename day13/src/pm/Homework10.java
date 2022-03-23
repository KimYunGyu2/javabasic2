package pm;

import java.util.Scanner;

public class Homework10 {

	static void aryRmv(int[] a, int idx) {
		if(idx >= 0 && idx <a.length) {
			for(int i = idx; i < a.length-1; i++) {
				a[i] = a[i+1];
			}
		}
	}
	
	static void aryRmvN(int[] a, int idx, int n) {
		if(n > 0 && idx >= 0 && idx +n <a.length) {
			int idx2 = idx + n -1;
			if(idx2 > a.length -n - 1) {
				idx2 = a.length - n - 1;
				for(int i = idx; i<= idx2; i++) {
					a[i] = a[i +n];
				}
			}
		}
	}
	
	static void aryIns(int[] a, int idx, int x) {
		if(idx >= 0 && idx <a.length) {
			for(int i = a.length-1; i >= idx+1; i--) {
				a[i] = a[i-1];
			}
			a[idx] = x;
		}
	}
	
	static void aryExchng(int[] a, int[] b) {
		int n = a.length < b.length ? a.length : b.length;
		for(int i = 0; i < n; i++) {
			int t = a[i];
			a[i] = b[i];
			b[i] = t;
		}
	}
	
	static int[] arrayClone(int[] a) {
		int[] b = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		return b;
	}
	
	public static void main(String[] args) {
		// 7-18
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		int[] a = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("a[" + i + "]:");
			a[i] = sc.nextInt();
		}
		System.out.print("삭제할 요소의 인덱스 : ");
		int idx = sc.nextInt();
		
		aryRmv(a, idx);
		for(int i = 0; i < num; i++) {
			System.out.println("a[" + i + "]= " + a[i]);
		}
		
		//7-19
		System.out.print("요소 수 : ");
		int num2 = sc.nextInt();
		int[] b = new int[num2];
		for(int i = 0; i < num2; i++) {
			System.out.print("b[" + i + "]:");
			b[i] = sc.nextInt();
		}
		System.out.print("삭제를 시작할 인덱스 : ");
		int start = sc.nextInt();
		System.out.print("삭제할 요소의 수 : ");
		int no = sc.nextInt();
		
		aryRmvN(b, start, no);
		for(int i = 0; i < num2; i++) {
			System.out.println("b[" + i + "]= " + b[i]);
		}
		
		//7-20
		
		System.out.print("요소 수 : ");
		int num3 = sc.nextInt();
		int[] c = new int[num3];
		for(int i = 0; i < num3; i++) {
		System.out.print("c[" + i + "]:");
		c[i] = sc.nextInt();
		}
		System.out.print("삽입할 요소의 인덱스 : ");
		int insert = sc.nextInt();
		System.out.print("삽입할 값 : ");
		int no2 = sc.nextInt();
		
		aryIns(c, insert, no2);
		for(int i = 0; i < num3; i++) {
		System.out.println("c[" + i + "]= " + c[i]);
		}
		
		//7-21
		
		System.out.print("배열 d의 요소수 : ");
		int num4 = sc.nextInt();
		int[] d = new int[num4];
		for(int i = 0; i < num4; i++) {
			System.out.print("d[" + i + "]:");
			d[i] = sc.nextInt();
			}
		
		System.out.print("배열 e의 요소수 : ");
		int num5 = sc.nextInt();
		int[] e = new int[num5];
		for(int i = 0; i < num5; i++) {
			System.out.print("e[" + i + "]:");
			e[i] = sc.nextInt();
			}
		
		aryExchng(d, e);
		System.out.println("배열 d와 e의 전체 요소를 교환했습니다.");
		
		for(int i = 0; i < d.length; i++) {
			System.out.println("d[" + i + "]= " + d[i]);
		}
		for(int i = 0; i < e.length; i++) {
			System.out.println("e[" + i + "]= " + e[i]);
		}
		
		//7-22
		
		System.out.print("배열 f의 요소수 : ");
		int num6 = sc.nextInt();
		int[] f = new int[num6];
		for(int i = 0; i < num6; i++) {
			System.out.print("f[" + i + "]:");
			f[i] = sc.nextInt();
		}
		
		System.out.println("배열 f를 복사해서 배열 g를 생성했습니다.");
		int[] g = arrayClone(f);
		for(int i = 0; i < g.length; i++) {
			System.out.println("g[" + i + "]:" + g[i]);			
		}		
	}
}
