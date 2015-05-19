package oop02.encapsule;

import java.util.Scanner;

public class NumberMatchController {
	
	public static void main(String[] args) {
		NumberMatchService service = new NumberMatchService();

		System.out.println("�� 3ȸ�� �Է� �����մϴ�.");
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++){
			System.out.println("1���� 3���� ������ �Է��ϼ���.");
			
			try{
				int input = scanner.nextInt();
				service.game(input);
			}catch(Exception e){
				System.out.println("���ڴ� �ȵ˴ϴ�.");
			}
			if(i==2){
				System.out.println("3ȸ �Ϸ�. ������ �����մϴ�.");
			}
		}
	}
}
