package oop09.nestedClass;
/*
 내부크래스의 두 번째 형태
 - Local 내부 클래스에서는 외부클래스의 멤버를 접근하는데 있어서
   제한이 따른다. 우선 외부 클래스의 멤버변수는 접근할 수 있다.
   하지만 메소드 내부의 지역변수는 접근할 수 없다.
   (변수의 보안이 필요시에 사용)
 */
public class InnerClassLocal {
	int a = 100;
	public void innerTest(int k){
		int b = 2;
		final int c = k;
		class Inner{
			public void getData(){
				System.out.println("멤버변수 a : "+a);
				System.out.println("상수 c : "+c);
			//	System.out.println("지역변수 b : "+b);
				
			}
		}
		Inner inn = new Inner();
		inn.getData();
	}
}
