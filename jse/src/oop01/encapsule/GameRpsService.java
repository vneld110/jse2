package oop01.encapsule;
/*
 Date : 2015.05.15
 Author : ������
 Description : ����, ����, �� ���ӳ���
 
 1�� ������ 2�� ���� 3�� ��
 */

public class GameRpsService {
	GameRpsVO vo = new GameRpsVO();
	/*
	 ���� ���� ���� ����, ����, �� ���� ����
	 */
	public String showValue(int value) {
		String result = null;
		switch (value) {
		case 1: result = "����";	break;
		case 2: result = "����";	break;
		case 3: result = "";	break;
		default:
			break;
		}
		return result;
	}
}
