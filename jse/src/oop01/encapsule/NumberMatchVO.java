package oop01.encapsule;

public class NumberMatchVO {
	private int player, com, count;
	
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		this.player = player;
		if(player < 1 || player > 5){
			System.out.println("1���� 3������ ������ �Է� ����.");
		}
	}
	public int getCom() {
		return com;
	}
	public void setCom() {
		this.com = (int)((Math.random()*3)+1);
	}

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
