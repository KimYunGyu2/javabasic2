package am;

public class Exam2 {
/*
    변수명 짓기
    1. 영문 대소문자와 한글도 사용할수는 있다.(한글 쓰지말자)
    2. 특수문자는 밑줄과 $만 사용할수 있다.
    3. 숫자를 사용할수는 있지만 단 첫번째 글자로는 쓸수 없다.
    4. 이미 예약어로 지정된 단어는 사용할 수 없다.
    *. 영문 소문자로 시작하자, 한글은 쓰지말자
    *. 영어 단어를 2개이상 사용할 때는 새로운 단어의 첫 글자는 대문자로

    상수명 짓기
    final int MY_DATA; 상수명은 대문자 그리고 언더바 snake case

    변수의 생존 기간
    

*/
    public static void main(String[] args) {
        int value1 = 3;
        {
            int value2 = 5;
            System.out.println(value1);
            System.out.println(value2);
        } // value2가 사라진다.
        System.out.println(value1);
        // System.out.println(value2);

        //형변환. 캐스팅 casting

        float value5 = 1.2F; //실수형 float은 F를 붙여서 정의한다.
        double value6 = 1.5; //실수형 double이 기본 실수 자료형

        double value7 = 5; // 자동 형변환

        System.out.println(value7);

        int value8 = (int)5.3; // 강제 형변환
        System.out.println(value8);
        long value9 = (long)10;

        //형변환은 자바가 자동으로 수행하는 자동 형변환과 개발자가 직접 형변환을 수행해야하는 수동 형변환이 있다. 크기가 작은 자료형을 큰 자료형에 대입할때는 어떤 손실도 발생하지 않는다. 따라서 작은 자료형을 큰 자료형에 담으면 개발자가 변환 코드를 넣어주지 않아도 자바가 자동으로 타입을 변환해주는데 이것을 업캐스팅 이라고 한다.

        // 자바에서 정수형 자료형 들과 그 크기를 순서대로
        // byte < short < int < long

        // 0 main   {
        // 1 int a = 3;
        // 2    {
        // 3        int b;
        // 4        b = 5;
        // 5    }
        // 6    int c = 7;
        // 7    }
        // a 생성 1 소멸 7
        // b 생성 3 소멸 5
        // c 생성 6 소멸 7


    }
}
