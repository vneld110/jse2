package oop01.syntax;

public class AverageC {
	public static void main(String[] args) {
		
		AverageCVO vo = new AverageCVO();
		
		vo.setName("ÇæÅ©");
		vo.setKor(80);
		vo.setEng(75);
		
		System.out.println("==="+vo.getName()+"ÀÇ ¼ºÀûÇ¥===");
		System.out.println("±¹¾î : "+vo.getKor()+"Á¡");
		System.out.println("¿µ¾î : "+vo.getEng()+"Á¡");
		System.out.println("ÃÑÁ¡ : "+vo.total()+"Á¡");
		System.out.println("Æò±Õ : "+vo.average()+"Á¡");
		System.out.println();
	}
}
