package oop02.encapsule;

import java.util.Scanner;

public class NumberMatchController {
	
	public static void main(String[] args) {
		NumberMatchService service = new NumberMatchService();

		System.out.println("총 3회만 입력 가능합니다.");
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++){
			System.out.println("1부터 3까지 정수만 입력하세요.");
			
			try{
				int input = scanner.nextInt();
				service.game(input);
			}catch(Exception e){
				System.out.println("문자는 안됩니다.");
			}
			if(i==2){
				System.out.println("3회 완료. 게임을 종료합니다.");
			}
		}
	}
}
