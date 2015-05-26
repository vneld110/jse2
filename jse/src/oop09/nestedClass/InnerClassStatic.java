package oop09.nestedClass;

public class InnerClassStatic {
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	public static class Inner{
		// static 붙으면 static영역에 가장먼저 올라감 > 다른 내부클래스와 구별.
		static int d = 1000;
		public void printData(){ //class소속>멤버
		//	System.out.println("멤번 a : "+a);
		//	System.out.println("private변수 b : "+b);
			/*
			 a 와 b값이 에러가 나는 것은..
			 static 내부클래스는 더 이상 내부클래스가 아니다.
			 또한 외부클래스를 거치지 않고 접근할 수 있다.
			 따라서 top level class, 최상위 클래스라 한다.
			 어쩔 수 없이 내부클래스를 static으로 선언해야하는 경우는
			 내부클래스의 멤버들 중 하나라도 static 멤버가 있을 경우이다.
			 >> static멤버의 사용을 위해서만 static클래스를 사용.
			 */
			System.out.println("static변수 c : "+c);
			System.out.println("static변수 d : "+d);
		}		
	}
}
