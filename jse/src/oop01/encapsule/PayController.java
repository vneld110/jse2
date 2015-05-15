package oop01.encapsule;

import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		String name;
		int salary = 0;
		int income = 0;

		PayService service = new PayService();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		name = scanner.next();
		System.out.println("급여 입력: ");
		salary = scanner.nextInt();
		
		service.calcIncome(name,salary);
		
		System.out.println("===== 급여내역 =====");
		System.out.println("성명 : " + name);
		System.out.println("본봉 : " + salary);
		System.out.println("세율 : " + service.serviceTax());
		System.out.println("실수령액 : " + service.calcIncome(name,salary));
	}
}
