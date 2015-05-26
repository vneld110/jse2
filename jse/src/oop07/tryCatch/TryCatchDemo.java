package oop07.tryCatch;
/*
 ���ܴ� ���α׷� ���� �� �߻��ϴ� ������ �ٸ� ����.
 ���α׷� ���� �� �߻��ϴ� ������ ���� ��ó�� �ʼ�.
 ���������� ������ �� ��߿� �߻��ϴ� ������ ��κ��� �����̴�.
 ���ܴ� �ڵ�� �߻��� ������ �ٸ��� �����Ͻ� ���� �߻����� ����.
 try{
 	���ܰ� �߻��� ������ �ִ� �ڵ带 �����ڰ� �����Ͽ� ����.
 	IO, 'DBMS', Network ���� �ڵ尡 �ַ� ��ġ
 }catch(Exception ex){ex.printStackTrace()}
 */

public class TryCatchDemo {
	public static void main(String[] args) {
		int a=5, b=0;
		int mok=0, nmg=0;
		try{
			mok = a/b;
			nmg = a%b;
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("�����߻�");
		}
		System.out.println(a+"/"+b+"="+mok);
		System.out.println(a+"%"+b+"="+nmg);
		
	}
}
