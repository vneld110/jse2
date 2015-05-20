package oop03.inheritance;

public class ObjectCastingDemo {
	public static void main(String[] args) {
		// �Ϲ����� ��ü����
		ParentC a = new ParentC();
		ChildC b = new ChildC();
		Object o = new ParentC();
		// �θ� Ÿ�� = new �ڽ�Ÿ��
		ParentC a2 = new ChildC();  
						// ParentC Ÿ���� a2�� ����. ChildC()���� �����ε��� �޼ҵ忡 ���ؼ���
                        //ChildC �޼ҵ带 ȣ��, �����ε� ���� ���� �޼ҵ忡 ���ؼ��� ParentC �޼ҵ� ȣ��.
		// �������̵� �� �ڽ�Ŭ���� �޼ҵ� �켱 ���
		a2.over(1);
		// �������̵� ���������� �θ�Ŭ���� �켱 ȣ��
		//a2.noOver("AAA");
		a2.noOver(1);
		// �θ�Ŭ���� Ÿ���� �ڽ�Ŭ������ ���� ����ȯ
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