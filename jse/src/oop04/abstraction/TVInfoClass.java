package oop04.abstraction;

public class TVInfoClass extends ProductInfoClass{
	private String screenSize;
	private String screenType;
	
	public void setInfo(String company, String name, String sid
			, String screenSize, String screenType){
		//구현하세요
		super.setInfo(company, name, sid);
		this.screenSize = screenSize;
		this.screenType = screenType;
	}
	public void displayInfo(){
		//구현하세요
		super.displayInfo();
		System.out.println("화면사이즈 : "+this.screenSize);
		System.out.println("화면타입 : "+this.screenType);
	}
	
}
