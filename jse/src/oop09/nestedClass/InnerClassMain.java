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
		InnerClassStatic.Inner inn = new InnerClassStatic.Inner();// staticŬ����.default������() ����
		inn.printData();
	}
	public void getInnerClassLocal() {
		InnerClassLocal outer = new InnerClassLocal();
		outer.innerTest(1000);
	}
	// Alt + Shift + m  > �޼ҵ� ���� ����Ű ( �����丵 ) >>static main method���� ����.
	// static ����� ���θ޼ҵ� �̿��Ͽ� ȣ��. 
	// >> static������ ���ʿ��ϰ� �޸� �Ҵ���� �ʵ���.
	public void getInnerClassInstance() {
		InnerClassInstance.Inner inn = new InnerClassInstance().new Inner();// ������().������() ����
		inn.printData();
	}
}
