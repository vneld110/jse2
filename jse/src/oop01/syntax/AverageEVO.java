package oop01.syntax;

public class AverageEVO {
	private String name;
	private int kor;
	private int eng;
	// getter setter ������� �ʰ� �����ڷ� ó��
	// ��, avg() tot()�� �ۼ�.
	
	public AverageEVO(){} // ����Ʈ������ ���� �ۼ�
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
