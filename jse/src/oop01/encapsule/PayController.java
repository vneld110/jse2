package oop01.encapsule;

import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		String name;
		int salary = 0;
		int income = 0;

		PayService service = new PayService();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�̸� �Է� : ");
		name = scanner.next();
		System.out.println("�޿� �Է�: ");
		salary = scanner.nextInt();
		
		service.calcIncome(name,salary);
		
		System.out.println("===== �޿����� =====");
		System.out.println("���� : " + name);
		System.out.println("���� : " + salary);
		System.out.println("���� : " + service.serviceTax());
		System.out.println("�Ǽ��ɾ� : " + service.calcIncome(name,salary));
	}
}
