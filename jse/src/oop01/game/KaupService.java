package oop01.game;

import java.util.Scanner;

public class KaupService {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ��� :");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ��� : ");
		double weight = scanner.nextDouble();
		
		KaupVO vo = new KaupVO();
		vo.setHeight(height);
		vo.setWeight(weight);
		vo.setIdx(height, weight);
		vo.setMsg("");
		
		System.out.println(vo.toString());
		
		System.out.println("�Ϸ�");
	}
}
