package oop04.abstraction;

public class ComputerInfoClass extends ProductInfoClass{
	private String cpu;
	private String ram;
	private String hdd;
	
	public void displayInfo(){
		/*
		 ProductInfoClass �� �ִ� �⺯�� private �̹Ƿ� ������ �Ұ����ϴ�.
		 ���� ������ protected�̹Ƿ� ������ �����ϴ�.
		 �⺯�� ���� ���ٵ� �θ� �ִ� displayInfo()�� ȣ���ؼ� ó���Ѵ�.
		 */

		super.displayInfo();
		System.out.println("cpu : "+cpu);
		System.out.println("ram : "+ram);
		System.out.println("hdd : "+hdd);
		
	}
	public void setInfo(String company, String name, String sid
			, String cpu, String ram, String hdd){
		/*
		 �Ķ��ó�� �Ѿ�� ���鵵 �ٷ� super�� ���� �θ� �޼ҵ��� �Ķ���ͷ�
		 ���� �ٷ� set �Ѵ�
		 ��, (private�⺯�̶�)"�⺯�� ����"�� �θ��ڽ� ���迡�� �����ϹǷ�,
		 �θ��� �⺯�� ���� ���ٵ� ��������.
		 */
		super.setInfo(company, name, sid);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
}
