package oop03.inheritance;
class Car{
	String name = "자동차";
}
class Hcar extends Car{
	String brand = "현대";
}
public class MemberVarrExtendsDemo {
	public static void main(String[] args) {
		Hcar h = new Hcar();
		System.out.println(h.brand+"\t");
		System.out.println(h.name);
	}
}
