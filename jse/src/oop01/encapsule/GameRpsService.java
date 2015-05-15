package oop01.encapsule;
/*
 Date : 2015.05.15
 Author : 김은지
 Description : 가위, 바위, 보 게임놀이
 
 1은 가위고 2는 바위 3은 보
 */

public class GameRpsService {
	GameRpsVO vo = new GameRpsVO();
	/*
	 숫자 값에 따른 가위, 바위, 보 결정 로직
	 */
	public String showValue(int value) {
		String result = null;
		switch (value) {
		case 1: result = "가위";	break;
		case 2: result = "바위";	break;
		case 3: result = "";	break;
		default:
			break;
		}
		return result;
	}
}
