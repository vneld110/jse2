package oop03.inheritance;
class Car{
	String name = "�ڵ���";
}
class Hcar extends Car{
	String brand = "����";
}
public class MemberVarrExtendsDemo {
	public static void main(String[] args) {
		Hcar h = new Hcar();
		System.out.println(h.brand+"\t");
		System.out.println(h.name);
	}
}
