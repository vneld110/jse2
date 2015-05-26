package oop09.nestedClass;
/*
 내부클래스(Inner class) 첫 번째 형태.
 - 인스턴스 내부 클래스
 - 멤버메소드를 클래스 내부에 선언함.
 */
public class InnerClassInstance {
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	public class Inner{
		public void printData(){
			System.out.println("멤버변수 a : "+a);
			System.out.println("private변수 b : "+b);
			System.out.println("static변수 c : "+c);
		}
	}
}
