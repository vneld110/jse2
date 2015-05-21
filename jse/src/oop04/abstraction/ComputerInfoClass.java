package oop04.abstraction;

public class ComputerInfoClass extends ProductInfoClass{
	private String cpu;
	private String ram;
	private String hdd;
	
	public void displayInfo(){
		/*
		 ProductInfoClass 에 있는 멤변이 private 이므로 접근이 불가능하다.
		 이전 예제는 protected이므로 접근이 가능하다.
		 멤변에 대한 접근도 부모에 있는 displayInfo()를 호출해서 처리한다.
		 */

		super.displayInfo();
		System.out.println("cpu : "+cpu);
		System.out.println("ram : "+ram);
		System.out.println("hdd : "+hdd);
		
	}
	public void setInfo(String company, String name, String sid
			, String cpu, String ram, String hdd){
		/*
		 파라미처로 넘어온 값들도 바로 super를 통해 부모 메소드의 파라미터로
		 던져 바로 set 한다
		 즉, (private멤변이라도)"멤변의 공유"가 부모자식 관계에서 성립하므로,
		 부모의 멤변에 대한 접근도 가능해짐.
		 */
		super.setInfo(company, name, sid);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
}
