package oop01.syntax;

public class AverageCVO {
	private String name;
	private int kor;
	private int eng;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int total(){
		int tot = kor+eng;
		return tot;
	}
	public double average(){
		double avg = total()/2d;
		return avg;
	}
	
	
}
