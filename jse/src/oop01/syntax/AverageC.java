package oop01.syntax;

public class AverageC {
	public static void main(String[] args) {
		
		AverageCVO vo = new AverageCVO();
		
		vo.setName("��ũ");
		vo.setKor(80);
		vo.setEng(75);
		
		System.out.println("==="+vo.getName()+"�� ����ǥ===");
		System.out.println("���� : "+vo.getKor()+"��");
		System.out.println("���� : "+vo.getEng()+"��");
		System.out.println("���� : "+vo.total()+"��");
		System.out.println("��� : "+vo.average()+"��");
		System.out.println();
	}
}
