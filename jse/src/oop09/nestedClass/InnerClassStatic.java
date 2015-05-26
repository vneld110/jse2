package oop09.nestedClass;

public class InnerClassStatic {
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	public static class Inner{
		// static ������ static������ ������� �ö� > �ٸ� ����Ŭ������ ����.
		static int d = 1000;
		public void printData(){ //class�Ҽ�>���
		//	System.out.println("��� a : "+a);
		//	System.out.println("private���� b : "+b);
			/*
			 a �� b���� ������ ���� ����..
			 static ����Ŭ������ �� �̻� ����Ŭ������ �ƴϴ�.
			 ���� �ܺ�Ŭ������ ��ġ�� �ʰ� ������ �� �ִ�.
			 ���� top level class, �ֻ��� Ŭ������ �Ѵ�.
			 ��¿ �� ���� ����Ŭ������ static���� �����ؾ��ϴ� ����
			 ����Ŭ������ ����� �� �ϳ��� static ����� ���� ����̴�.
			 >> static����� ����� ���ؼ��� staticŬ������ ���.
			 */
			System.out.println("static���� c : "+c);
			System.out.println("static���� d : "+d);
		}		
	}
}
