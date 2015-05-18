package oop01.syntax;

public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	// getter setter 사용하지 않고 생성자로 처리
	// 단, avg() tot()은 작성.
	
	public AverageEVO(){} // 디폴트생성자 직접 작성
	public AverageEVO(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	int tot(){
		int tot = kor+eng;
		return tot;
	}
	double avg(){ 
		double avg = tot()/2d;
		return avg;
	}
}
