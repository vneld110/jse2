package oop01.game;

public class KaupVO {
	private double height;
	private double weight;
	private int idx;
	private String msg;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(double height, double weight) {
		this.idx =(int)((weight/(height*height))*10000);
	}
	public String getMsg(){
		return msg;
	}
	public void setMsg(String msg){
		if(idx>30){ this.msg = "비만";}
		else if(idx>24){ this.msg = "과체중";}
		else if(idx>20){ this.msg = "정상";}
		else if(idx>15){ this.msg = "저체중";}
		else if(idx>13){ this.msg = "마름";}
		else if(idx>10){ this.msg = "영양실조";}
		else{ this.msg = "소모증";}
	}
	
	public String toString() {
		return "카우프지수 [키=" + getHeight() + ", 몸무게=" + getWeight() + ", 카우프지수="
				+ getIdx() +" 메시지 : "+getMsg()+"]";
	}
}
