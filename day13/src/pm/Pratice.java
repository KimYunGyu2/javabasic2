package pm;

public class Pratice {

	public static void main(String[] args) {
		String[] Arr1 = { "A", "B" , "C"};
		String[] Arr2 = { "C", "D", "F", "G", "H" };

		for(int i = 0; i < Arr1.length ; i++) {
			for(int j = 0; j< Arr2.length; j++) {
				if(Arr1[i].equals(Arr2[j])) {
					System.out.print(Arr1[i] + " ");
				}
			}
		}

	}

}
