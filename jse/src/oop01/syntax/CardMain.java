package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {
		
		System.out.println("ī�� ���� : "+CardVO.height); // static���� ȣ�Ⱑ��
		System.out.println("ī�� �ʺ� : "+CardVO.width);
		
		// �ν��Ͻ� ���� > �Ʒ� ���ó�� ���
		CardVO vo1 = new CardVO("heart",3);
		CardVO vo2 = new CardVO("spade",5);
		
		System.out.println("�÷��̾�� "+vo1.toString()+" �̰�");
		System.out.println("��ǻ�ʹ� "+vo2.toString()+" �� ��ǻ�Ͱ� �̰���ϴ�.");
	}
}
