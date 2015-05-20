package oop03.inheritance;

public class ObjectCastingDemo {
	public static void main(String[] args) {
		// 일반적인 객체생성
		ParentC a = new ParentC();
		ChildC b = new ChildC();
		Object o = new ParentC();
		// 부모 타입 = new 자식타입
		ParentC a2 = new ChildC();  
						// ParentC 타입의 a2를 선언. ChildC()에서 오버로딩된 메소드에 대해서만
                        //ChildC 메소드를 호출, 오버로딩 되지 않은 메소드에 대해서는 ParentC 메소드 호출.
		// 오버라이딩 시 자식클래스 메소드 우선 출력
		a2.over(1);
		// 오버라이딩 하지않으면 부모클래스 우선 호출
		//a2.noOver("AAA");
		a2.noOver(1);
		// 부모클래스 타입을 자식클래스로 강제 형변환
		ChildC b2 = (ChildC) a2;
		b2.over(1);
		b2.noOver("AAA");
	}
}
class ParentC{
	void over(int i){
		System.out.println("Aclass-over() : "+(i*10));
	}
	void noOver(int i){
		System.out.println("Aclass-noOver() : "+ i);
	}
}
class ChildC extends ParentC{
	public ChildC() {
		super.noOver(2);
		this.noOver("");
	}
	void over(int i){
		System.out.println("Bclass-over() : "+(i*10000));
	}
	void noOver(String s){
		System.out.println("Bclass-noOver() : "+s);
	}
	void onlyB(){
		System.out.println("onlyB()");
	}
}