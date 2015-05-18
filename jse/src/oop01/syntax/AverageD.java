package oop01.syntax;

public class AverageD {
	public static void main(String[] args) {
		
		AverageService service = new AverageService();
		
		System.out.println("==="+service.name("ÇæÅ©")+"ÀÇ ¼ºÀûÇ¥===");
		System.out.println("±¹¾î : "+service.korean(80)+"Á¡");
		System.out.println("¿µ¾î : "+service.english(75)+"Á¡");
		System.out.println("ÃÑÁ¡ : "+service.total()+"Á¡");
		System.out.println("Æò±Õ : "+service.average()+"Á¡");
		System.out.println();
	}
}
