package oop03.inheritance;
/*
 Date : 2015.05.20
 Author : 
 Desc : �޼ҵ� ���
 */

/*
 Car
   ��
  | ���  -has a
 Hcar <- new(instantiate)  -use
 */

class Car2{
	String name = "�ڵ���";
	public String gear(){
		return "�������";
	}
}
class Hcar2 extends Car2{
	String brand = "������";
	public String autoGear(){
		return "������";
	}
}
public class MethodExtendsDemo {
	public static void main(String[] args) {
		Hcar2 hcar2 = new Hcar2();
		System.out.println(hcar2.gear());
		System.out.println(hcar2.autoGear());
		
		Car2 car2 = new Car2();
		System.out.println(car2.gear());
	//	System.out.println(car2.autoGear());
	// ����Ͽ� ���� �� �ִ� ������ �ڽĸ� �����ϴ�.
	}
}
