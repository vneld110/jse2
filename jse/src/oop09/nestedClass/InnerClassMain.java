package oop09.nestedClass;

public class InnerClassMain {
	public static void main(String[] args) {
		InnerClassMain m = new InnerClassMain();
		//m.getInnerClassInstance();
		//m.getInnerClassLocal();
		m.getInnerClassStatic();
		InnerClassAnonyServiceImpl inn = new InnerClassAnonyServiceImpl();
		inn.print();
		
		
	}
	public void getInnerClassStatic() {
		InnerClassStatic.Inner inn = new InnerClassStatic.Inner();// static클래스.default생성자() 접근
		inn.printData();
	}
	public void getInnerClassLocal() {
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);
	}
	// Alt + Shift + m  > 메소드 독립 단축키 ( 리팩토링 ) >>static main method에서 독립.
	// static 지우고 메인메소드 이용하여 호출. 
	// >> static영역에 불필요하게 메모리 할당되지 않도록.
	public void getInnerClassInstance() {
		InnerClassInstance.Inner inn = new InnerClassInstance().new Inner();// 생성자().생성자() 접근
		inn.printData();
	}
}
