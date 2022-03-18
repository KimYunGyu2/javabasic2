package pm;

public class Exam5 {

	public static void main(String[] args) {
/* 
 예외 던지기
 예외가 발생했을 때 그 위치에서 바로 예외 처리를 할 수도 있지만
 호출한 지점으로 예외를 던질수도 있다. throws 
 
 예외가 발생하면 2가지 해결책은 try-catch을 이용하거나 예외를 던지는 것이다.
 
 예외를 던지는 기본 문법
 
 리턴타입 매서드명(변수) throws 예외 클래스명 {
 //
 }
 
 
 void abc() {
 
 	try{
 		bcd();
 		}catch (예외 클래스 타입)
 		// 예외 처리
 		}
 }
 
 void bcd() throws 예외 클래스 타입 {
 
 	//예외발생을 호출한 지점으로 던지기
 }
 
 
 
 */

		A a = new A();
		a.abc();
		
	}

}

//class A{
//	void abc() {
//		bcd();
//	}
//	
//	void bcd() {
//		try {
//			System.out.println("start");
//			Thread.sleep(1000);
//			System.out.println("stop");
//		}catch(InterruptedException e) {
//			// 예외 처리 구문
//		}

class A{
	void abc() {
		try {
		bcd();
		}catch(InterruptedException e) {
			// 예외 처리 구문
		}
	}

	
	void bcd() throws InterruptedException {
			System.out.println("start");
			Thread.sleep(1000);
			System.out.println("stop");
		}
}



/*
2개의 매서드 abc() bcd() 가 있고 bcd()매서드의 내부에는 예외 발생 가능 코드가 포함되어 있다.
Thread.sleep()은 일반 예외가 발생할 수도 있기 때문에 매서드 사용을 위해서는
반드시 예외 처리를 해야만 한다. 하지만 bcd() 매서드가 직접 예외 처리를 하는 대신
자신을 호출한 매서드로 던지게 된다. 즉 예외 처리 의무를 자신을 호출한 매서드로 전가했다.
따라서 abc()매서드가 예외를 처리해야만 한다.

반드시 예외 처리 방식을 사용해야만 하는 매서드들이 있다.

*예뢰를 강제로 발생시키기 throw
 예를들면 int age = -1; 실제는 예외가 아니다. 하지만 경우에 따라
 나이는 -1살은 절대 있을수가 없으므로 강제로 예외로 인식시킬 필요가 있다.
 몸무게의 경우에도 500kg는 절대 이;ㅆ을수가 없는 값이므로 예외로 인식시킬 필요가 있다.
 
 이럴 경우 해결방법은 예외 클래스를 직접 정의하여 사용하는 것이다.
 사용자 정의 예외 클래스를 만들어보면 다른 예외 들의 동작 매커니즘도 자연스럽게 이해를 할수 있다.

*/