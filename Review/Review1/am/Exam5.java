package am;

public class Exam5 {
    public static void main(String[] args) {
        //for문으로 0 1 2 3 4 5
        for(int i = 0; i <6; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        //while 문으로 0 1 2 3 4 5
        int a = 0;
        while(a < 6){
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        // 구구단을 출력하세요 for
        for(int i = 2; i <=9; i++){
            for(int j = 1; j<= 9; j++){
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

        System.out.println("while문");
        int b = 2;        
        while(b <= 9){
            int c = 1;
            while(c <= 9){
                System.out.println(b + " * " + c + " = " + b * c);
                c++;
            }
            b++;
        }
    }
}
