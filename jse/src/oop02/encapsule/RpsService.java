package oop02.encapsule;

public class RpsService {
	
	//��ǻ�Ͱ� �������� �߻���Ų �� 1~3
	public int displayComVal() {
		return (int)((Math.random()*3)+1);
	}
	
	// ���ڸ� �����ִ� ����
	public String showWinner(int playerVal, int comVal) {
		String msg = "";
		switch(playerVal-comVal){
		case -2: msg = "�̰���ϴ�."; break;
		case -1: msg = "�����ϴ�."; break;
		case  0: msg = "�����ϴ�."; break;
		case  1: msg = "�̰���ϴ�." ; break;
		case  2: msg = "�����ϴ�."; break;
		}
		return msg;
	}
	//���ڿ� �Ҵ�� ����, ����, ���� ���ڷ� ��ȯ�ؼ� �����ִ� ����
	public String showRpsVal(int playerVal){
		if(playerVal!=1&&playerVal!=2&&playerVal!=3){
			RpsUtil util = new RpsUtil();
			System.out.println(util.showRange(1, 3));
		}
		String msg = "";
		switch(playerVal){
		case 1: msg = "����"; break;
		case 2: msg = "����"; break;
		case 3: msg = "���ڱ�"; break;
		}
		return msg;
	}
}
