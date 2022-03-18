package am;

public class Exam3 {
    /*
    연산자 + - * /
    */
    public static void main(String[] args) {
        int a = 3;
        ++a; // 전위형
        System.out.println(a);

        int b = 3;
        b++; // 후위형
        System.out.println(b);

        int c = 5;
        if(c % 2 == 0){
            System.out.println("c는 짝수 입니다.");
        } else{
            System.out.println("c는 홀수 입니다.");
        }

        //quiz d 가 3의 배수인지를 출력하세요
        // "{9}는 3위 배수 입니다."

        int d = 9;

        if(d % 3 == 0){
            System.out.println(d + "는 3의 배수입니다.");
        }else{
            System.out.println(d + "는 3의 배수가 아닙니다.");
        }
    }
}
