package oop04.abstraction;
/*
 Date : 2015.05.21
 Author : 
 E-mail : 
 Desc : �߻�Ŭ���� ����
 */

public class AbsDemo {
	public static void main(String[] args) {
		Sum01 sum01 = new Sum01();
		System.out.println(sum01.sum(10, 20));
		System.out.println(sum01.toString());
		
		Sum02 sum02 = new Sum02();
		System.out.println(sum02.sum(10, 20));
		System.out.println(sum02.toString());
	}
}
abstract class AbsSum{
	// �ʼ������� �������� �ִ� �޼ҵ�
	public abstract String toString();
	public String sum(int i, int k){
		int sum = i + k;
		return ""+sum;
		// int ������ String ��ȯ�� �ִ� ���
	}
}
class Sum01 extends AbsSum{
	@Override
	public String toString() {
		return "class Sum01 extends AbsSum";
	}
}
class Sum02 extends AbsSum{
	@Override
	public String toString() {
		return "class Sum02 extends AbsSum";
	}
}


