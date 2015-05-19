package oop01.syntax;
/*
 static ����
 - ���� ���� (������ ���� ����, �ּҰ��� �Ҵ�)
 - Ŭ������ JVM ������ �ε��ÿ� �޸� �Ҵ��� �Ѵ�.
 - �ؽ��ڵ�(HashCode)�� ���
 - ��ü�� �ؽ��ڵ�� JVM�� �ؽþ˰��� ���� 
   ��Ű����� Ŭ�������� ���յǾ� �ؽ��ڵ尡 ����ȴ�.
 - String�� ��ü������ ���� ���� ��� ��, ���� ���ڿ���
   ������ ������, �ؽ��ڵ带 �����Ѵ�.
   String str1 = "��ũ";
   String str2 = "��ũ";
   str1.hashCode() = str2.hashCode();
 */

/*
 static ����� ����ؾ� �� ��Ȳ
 - �⺯ �� ��� �ν��Ͻ��� ���������� ����ؾ� �ϴ� �Ϳ� �ٿ� ���.
 - �ν��Ͻ� ������ ������� �ʰ�, Ŭ�������� �ٷ� �����Ϸ��� ��.
 */
public class No06_StaticSyntax {
	public static void main(String[] args) {
		String hulk = "��ũ"; // immortal . ���� ���ڿ��� ���� �ּҸ� ����.
		String hulk2 = new String("��ũ");
	}
}
