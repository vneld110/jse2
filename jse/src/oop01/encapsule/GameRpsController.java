package oop01.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		System.out.println("���������� ������ �����մϴ�.");
	
		GameRpsService service = new GameRpsService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("����:1, ����:2, ��:3 �Է��ϼ���.");
		int playerValue = scanner.nextInt();
		int comValue = (int)((Math.random()*3)+1);
		
		System.out.println("����� "+service.showValue(playerValue)+"(��)�� �½��ϴ�.");
		System.out.println("��ǻ�ʹ� "+service.showValue(comValue)+"(��)�� �½��ϴ�.");
		System.out.println("��� :");
		
		if(playerValue==comValue){
			System.out.println("�����ϴ�.");
		}else if(playerValue<comValue){
			if(playerValue==1&&comValue==3){
				System.out.println("����� �̰���ϴ�.");
			}else {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}
		}else if(playerValue>comValue){
			if(comValue==1&&playerValue==3){
				System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
			}else {
				System.out.println("����� �̰���ϴ�.");
			}
		}
		
		// �� �� ���� ���밪 ==0 ��� == 1 ū���� �̱� ==2 �������� �̱�
		
		scanner.close();
	}
}
