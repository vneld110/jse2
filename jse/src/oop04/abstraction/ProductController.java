package oop04.abstraction;

public class ProductController {
	public static void main(String[] args) {
		ComputerInfo ci = new ComputerInfo();
		ci.setComputerInfo("�Ｚ", "����", "a-1234-4567", "DUAL-CORE", "8G", "500GB");
		ci.displayProductInfo();
		System.out.println();
		
		TVInfo ti = new TVInfo();
	 /* �޼ҵ� ȣ��
		TV����
		ȸ�� : LG
		��ǰ�� : Xĵ����
		��ǰID : x-1234
		ȭ������� : 42��ġ
		ȭ����� : 16:9
	 */
		ti.setTVInfo("LG", "Xĵ����", "x-1234", "42��ġ", "16:9");
		ti.displayProductInfo();
	}
}
