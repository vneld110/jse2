package oop01.game;

public class NumberMatchService {
	
	public void game(int input){
		NumberMatchVO vo = new NumberMatchVO();
		vo.setPlayer(input);
		vo.setCom();
		
		if(vo.getPlayer()==vo.getCom()){
			System.out.println(vo.getPlayer()+"����!!");
		}else{
			System.out.println("Ʋ�Ƚ��ϴ�.");
			System.out.println("��ǻ�Ͱ� ������ ���� "+vo.getCom()+" �Դϴ�.");
		}
	}
}
