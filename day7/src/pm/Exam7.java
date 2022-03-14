package pm;

import am.A;

public class Exam7 {
	
	// 접금 제어자(지정자) modifier 는 클래스, 필드, 매서드, 생성자 등에게
	// 어떤 특징을 부여하는 분법 요소이다. 일종의 형용사로 생각할 수 있다.
	// 사용 범위를 정의하는 역할을 한다.
	// public protected default(아무표시가없으면) private
	
	// public : 같은 패키지 내의 모든 클래스 + 다른 패키지의 모든 클래승서 접근 가능
	// protected : 같은 패키지 내의 모든 클래스 + 다른 패키지의 자식 클래스에서 접근 가능
	// default : 같은 패키지 내의 모든 클래스
	// private : 같은 클래스 에서만 사용가능

		

	public static void main(String[] args) {
		A a = new A();
		
		a.print();
		

	}

}
