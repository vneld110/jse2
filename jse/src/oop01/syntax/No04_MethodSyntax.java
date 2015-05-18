package oop01.syntax;
/*
 Date : 
 Author : 
 Desc : 메서드 문법
 */

/*
 메소드 개요.
 함수 = method = function = procedure
 1) 메소드는 리턴값이 있어야 하는데, 없으면 void 기술
 2) 메소드는 함수 이름 다음에 괄호가 있어야 함
 3) 메소드는 필요한 경우 메소드이름(파라미터){} 형태를 가짐
 */

/*
 메소드 Syntax
 - C언어의 함수와 동일.
 - 데이터 처리 기능을 구현.
 - 리턴값이 없는 메소드는 void 지정.
 - 메소드가 받는 인수(=파라미터)와 데이터 타입은 메소드를 호출하는 쪽과 
   일치해야 함 
 - Method Overloading(중복 정의), Overriding(재정의) 기술로 확장.
 - 메소드가 리턴하는 값과 리턴되는 값의 데이터 타입은 일치해야 함.
 */

/*
 메소드의 호출방법
  : 참조변수.메소드이름(파라미터, 파라미터,..);
 */

/*
 메소드 종류
 - static 메소드 = 정적 메소드, 클래스 메소드, static이 붙은 메소드
                   >> 오버라이딩 오버로딩 불가. > 상속, 다형성 개념에서 제외   
   인스턴스 멤버를 사용할 수 없다.  
   인스턴스를 사용하지 않아도 사용 가능
 - non-static 메소드 = 일반 메소드, 인스턴스 메소드, static이 안붙어있다.
   멤변 중 모든 인스턴스에 공동 사용하는 메소드
   메소드 작업 수행시 인변을 필요로 하는 메소드
 */

/*
 오버로딩
 - 메소드 중복, 파라미터 개수나 타입만 다름
 - 메소드 이름은 동일하다.
 */

// static main method에서 field에 접근하는 방법.
// No04_MethodSyntax method = new No04_MethodSyntax();
// method.field명으로 접근!
public class No04_MethodSyntax {
	public static void main(String[] args) {
		
	}
}
