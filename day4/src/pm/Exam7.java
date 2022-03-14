package pm;

import java.util.Arrays;

public class Exam7 {

	public static void main(String[] args) {
		// 길이가 100인 배열을 만들어 for문을 이용하여 배열에 순서대로
		// 1에서 100까지의 값을 넣으세요
		// 옆으로 1줄로 전체를 출력하세요
		
//		int[] array1 = new int[100];
//		
//		for(int i = 0; i < array1.length; i++) {
//			array1[i] = i+1;
//			
//		}
//		System.out.println(Arrays.toString(array1));
		
		int[] arr1 = {5,4,3,2,1};
		int[] arr2 = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[(arr1.length)-1-i];
		}
		System.out.println(Arrays.toString(arr2));

	}

}
