package pm;

public class Exam14 {
    public static void main(String[] args) {
        /*
        this()
생성자의 내부에서만 사용된다
생성자의 첫줄에서만 사용한다.

        */
        Y y = new Y();
        System.out.println();
        Y y3 = new Y(3);
    }
}


class Y {
    Y() { // 기본생성자
        System.out.println("첫번째 생성자");
    }
    Y(int a){
        this(); // 첫줄에 위치한다.
        System.out.println("두번째 생성자");
    }
}