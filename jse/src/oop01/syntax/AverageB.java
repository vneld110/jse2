package oop01.syntax;

public class AverageB {
	String name;
	int kor;
	int eng;
	
	// 메소드를 여기에 정의하고
	// 메소드의 객체화를 해주세요.
	public int total(){
		return kor+eng;
	}
	public double average(){
		return (kor+eng)/2d;
	}
	
	public static void main(String[] args) {
		AverageB hulk = new AverageB();
		AverageB iron = new AverageB();
		AverageB thor = new AverageB();
		
		hulk.name = "헐크";
		hulk.kor = 80;
		hulk.eng = 75;
		
		System.out.println("==="+hulk.name+"의 성적표===");
		System.out.println("국어 : "+hulk.kor+"점");
		System.out.println("영어 : "+hulk.eng+"점");
		System.out.println("총점 : "+hulk.total()+"점");
		System.out.println("평균 : "+hulk.average()+"점");
		System.out.println();
		
	}
}
