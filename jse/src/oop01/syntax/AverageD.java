package oop01.syntax;

public class AverageD {
	public static void main(String[] args) {
		
		AverageService service = new AverageService();
		
		System.out.println("==="+service.name("��ũ")+"�� ����ǥ===");
		System.out.println("���� : "+service.korean(80)+"��");
		System.out.println("���� : "+service.english(75)+"��");
		System.out.println("���� : "+service.total()+"��");
		System.out.println("��� : "+service.average()+"��");
		System.out.println();
	}
}
