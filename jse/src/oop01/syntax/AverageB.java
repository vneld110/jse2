package oop01.syntax;

public class AverageB {
	String name;
	int kor;
	int eng;
	
	// �޼ҵ带 ���⿡ �����ϰ�
	// �޼ҵ��� ��üȭ�� ���ּ���.
	public int total(){
		return kor+eng;
	}
	public double average(){
		return (kor+eng)/2d;
	}
	
	public static void main(String[] args) {
		AverageB hulk = new AverageB();
		AverageB iron = new AverageB();
		AverageB thor = new AverageB();
		
		hulk.name = "��ũ";
		hulk.kor = 80;
		hulk.eng = 75;
		
		System.out.println("==="+hulk.name+"�� ����ǥ===");
		System.out.println("���� : "+hulk.kor+"��");
		System.out.println("���� : "+hulk.eng+"��");
		System.out.println("���� : "+hulk.total()+"��");
		System.out.println("��� : "+hulk.average()+"��");
		System.out.println();
		
	}
}
