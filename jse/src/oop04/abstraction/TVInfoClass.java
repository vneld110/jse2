package oop04.abstraction;

public class TVInfoClass extends ProductInfoClass{
	private String screenSize;
	private String screenType;
	
	public void setInfo(String company, String name, String sid
			, String screenSize, String screenType){
		//�����ϼ���
		super.setInfo(company, name, sid);
		this.screenSize = screenSize;
		this.screenType = screenType;
	}
	public void displayInfo(){
		//�����ϼ���
		super.displayInfo();
		System.out.println("ȭ������� : "+this.screenSize);
		System.out.println("ȭ��Ÿ�� : "+this.screenType);
	}
	
}
