package oop01.syntax;

public class AverageService {
//tot() avg()처리하도록
	
	AverageDVO vo = new AverageDVO();
	
	String name(String name){
		vo.setName(name);
		return vo.getName();
	}
	int korean(int kor){
		vo.setKor(kor);
		return vo.getKor();
	}
	int english(int eng){
		vo.setEng(eng);
		return vo.getEng();
	}
	public int total(){
		int tot = vo.getKor()+vo.getEng();
		return tot;
	}
	public double average(){
		double avg = total()/2d;
		return avg;
	}
}
