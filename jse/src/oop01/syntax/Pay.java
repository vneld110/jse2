package oop01.syntax;

public class Pay {
	
	String name;
	int salary;
	static final double TAX = 0.1;
	
	public static void main(String[] args) {
		
		Pay pay = new Pay();
		
		pay.name = "��ũ";
		pay.salary = 3000000;
		System.out.println("==="+pay.name+"�� 5���� �Ǳ޿��� "+(int)(pay.salary*(1-TAX))+"�� �Դϴ�.");
		
		pay.name = "���̾�";
		pay.salary = 5000000;
		System.out.println("==="+pay.name+"�� 5���� �Ǳ޿��� "+(int)(pay.salary*(1-TAX))+"�� �Դϴ�.");
		
		pay.name = "�丣";
		pay.salary = 1000000;
		System.out.println("==="+pay.name+"�� 5���� �Ǳ޿��� "+(int)(pay.salary*(1-TAX))+"�� �Դϴ�.");
	}
}
