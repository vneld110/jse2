package oop01.syntax;
/*
 Date : 2015.05.19
 Author :
 Desc : static ����
 */
public class CardVO {
	private String kind; // ī���� ���� 
	private int number; // ī���� ����
	static int width = 100; // ī���� ��
	static int height = 250; // ī���� ����

	public CardVO(String string, int i) {
		this.kind = string;
		this.number = i;
	}

	@Override
	public String toString() {
		return kind+ number;
	}
	
	
}
