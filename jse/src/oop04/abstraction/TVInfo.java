package oop04.abstraction;

public class TVInfo extends ProductInfo {

	protected String inchInfo;
	protected String screenRatioInfo;
	
	@Override
	public void displayProductInfo() {
		System.out.println("����ȸ�� : "+this.productCompany);
		System.out.println("�� ǰ �� : "+this.productName);
		System.out.println("������ȣ : "+this.productSerialID);
		System.out.println("��ġ���� : "+this.inchInfo);
		System.out.println("�������� : "+this.screenRatioInfo);
	}
	// �Ʒ� ������ �ϼ��Ͻÿ�.
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
