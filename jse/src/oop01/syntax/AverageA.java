package oop01.syntax;

public class AverageA {
	String name;
	int kor;
	int eng;
	
	public static void main(String[] args) {
		//tot, avg 지역변수 선언하고
		//아래와 같이 출력
		
		int tot = 0;
		double avg = 0;
		
		AverageA a = new AverageA();
		
		a.name = "헐크";
		a.kor = 100;
		a.eng = 95;
		tot = a.kor + a.eng;
		avg = tot/2d;
		System.out.println("==="+a.name+"의 성적표===");
		System.out.println("국어 : "+a.kor+"점");
		System.out.println("영어 : "+a.eng+"점");
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점");
		System.out.println();
		
		//아이언
		a.name = "아이언";
		a.kor = 80;
		a.eng = 75;
		tot = a.kor + a.eng;
		avg = tot/2d;
		System.out.println("==="+a.name+"의 성적표===");
		System.out.println("국어 : "+a.kor+"점");
		System.out.println("영어 : "+a.eng+"점");
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점");
		System.out.println();
		
		//토르
		a.name = "토르";
		a.kor = 60;
		a.eng = 55;
		tot = a.kor + a.eng;
		avg = tot/2d;
		System.out.println("==="+a.name+"의 성적표===");
		System.out.println("국어 : "+a.kor+"점");
		System.out.println("영어 : "+a.eng+"점");
		System.out.println("총점 : "+tot+"점");
		System.out.println("평균 : "+avg+"점");
		System.out.println();
	}
}
