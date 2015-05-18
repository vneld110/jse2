package oop01.syntax;

public class Pay {
	
	String name;
	int salary;
	static final double TAX = 0.1;
	
	public static void main(String[] args) {
		
		Pay pay = new Pay();
		
		pay.name = "헐크";
		pay.salary = 3000000;
		System.out.println("==="+pay.name+"의 5월달 실급여는 "+(int)(pay.salary*(1-TAX))+"원 입니다.");
		
		pay.name = "아이언";
		pay.salary = 5000000;
		System.out.println("==="+pay.name+"의 5월달 실급여는 "+(int)(pay.salary*(1-TAX))+"원 입니다.");
		
		pay.name = "토르";
		pay.salary = 1000000;
		System.out.println("==="+pay.name+"의 5월달 실급여는 "+(int)(pay.salary*(1-TAX))+"원 입니다.");
	}
}
