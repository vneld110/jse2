package oop04.abstraction;

public class TVInfo extends ProductInfo {

	protected String inchInfo;
	protected String screenRatioInfo;
	
	@Override
	public void displayProductInfo() {
		System.out.println("제조회사 : "+this.productCompany);
		System.out.println("제 품 명 : "+this.productName);
		System.out.println("고유번호 : "+this.productSerialID);
		System.out.println("인치정보 : "+this.inchInfo);
		System.out.println("비율정보 : "+this.screenRatioInfo);
	}
	// 아래 정보를 완성하시오.
	public void setTVInfo(String productCmpany, String productName
			, String productSerialID, String inchInfo, String screenRatioInfo){
		super.setProductInfo(productCmpany, productName, productSerialID);
		this.productCompany = productCmpany;
		this.productName = productName;
		this.productSerialID = productSerialID;
		this.inchInfo = inchInfo;
		this.screenRatioInfo = screenRatioInfo;
	}
}
