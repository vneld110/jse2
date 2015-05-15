package oop01.encapsule;

public class PayService {
	PayVO vo = new PayVO();
	
	public int calcIncome(String name, int salary) {
		vo.setName(name);
		vo.setSalary(salary);
		
		return (int)(vo.getSalary()*(1-vo.TAX));
	}
	public String serviceTax(){
		return (vo.TAX)*100+"%";
	}
}
