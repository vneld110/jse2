package oop01.encapsule;

import java.util.Scanner;

public class GameRpsController {
	public static void main(String[] args) {
		System.out.println("가위바위보 게임을 시작합니다.");
	
		GameRpsService service = new GameRpsService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위:1, 바위:2, 보:3 입력하세요.");
		int playerValue = scanner.nextInt();
		int comValue = (int)((Math.random()*3)+1);
		
		System.out.println("당신은 "+service.showValue(playerValue)+"(을)를 냈습니다.");
		System.out.println("컴퓨터는 "+service.showValue(comValue)+"(을)를 냈습니다.");
		System.out.println("결과 :");
		
		if(playerValue==comValue){
			System.out.println("비겼습니다.");
		}else if(playerValue<comValue){
			if(playerValue==1&&comValue==3){
				System.out.println("당신이 이겼습니다.");
			}else {
				System.out.println("컴퓨터가 이겼습니다.");
			}
		}else if(playerValue>comValue){
			if(comValue==1&&playerValue==3){
				System.out.println("컴퓨터가 이겼습니다.");
			}else {
				System.out.println("당신이 이겼습니다.");
			}
		}
		
		// 두 수 차의 절대값 ==0 비김 == 1 큰수가 이김 ==2 작은수가 이김
		
		scanner.close();
	}
}
