package oop03.inheritance;

public class BankAccount {
	protected String accountNum;
	protected String accountPass;
	protected String ownerName;
	protected int balance;
	
	public void setAccount(String accountNum, String accountPass
			, String ownerName, int pay){
		this.accountNum = accountNum;
		this.accountPass = accountPass;
		this.ownerName = ownerName;
		this.balance = pay;
		System.out.println(this.accountNum+"�� �����Ǿ����ϴ�.");
		
	}
	public void deposit(int pay){
		this.balance = this.balance + pay;
		System.out.println(pay + "������ �Ա��߽��ϴ�.");
	}
	public void defrayment(int pay){
		if(this.balance >=pay){
			this.balance = this.balance - pay;
			System.out.println(pay+"������ ����߽��ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	public void printAccount(){
		System.out.println("���¹�ȣ : "+this.accountNum);
		System.out.println("�� �� �� : "+this.ownerName);
		System.out.println("�����ܾ� : "+this.balance);
		System.out.println();
	}
}
