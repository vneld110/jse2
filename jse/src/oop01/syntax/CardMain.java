package oop01.syntax;

public class CardMain {
	public static void main(String[] args) {
		
		System.out.println("카드 높이 : "+CardVO.height); // static변수 호출가능
		System.out.println("카드 너비 : "+CardVO.width);
		
		// 인스턴스 생성 > 아래 결과처럼 출력
		CardVO vo1 = new CardVO("heart",3);
		CardVO vo2 = new CardVO("spade",5);
		
		System.out.println("플레이어는 "+vo1.toString()+" 이고");
		System.out.println("컴퓨터는 "+vo2.toString()+" 라서 컴퓨터가 이겼습니다.");
	}
}
