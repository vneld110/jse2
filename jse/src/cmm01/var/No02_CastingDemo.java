package cmm01.var;
/*
 Upcasting 
 = 변환(Conversion)
 = promotion
 = 묵시적(implict) 자동변환
 : 자바가 제공하는 자동변환으로 묵시적인 동작
 데이터 타입의 표현범위가 작은쪽에서 많은쪽으로 변환 될때만 가능.
 */

public class No02_CastingDemo {
	public static void main(String[] args) {
	
		byte varByte = 1;
		int varInt =123;
		double varDou = 123.456d;
		
		int upByte = varByte; // (int)생략 
		double upInt = varInt;
	/*
	 Down-Casting
	 = 캐스팅(Casting)
	 강제형변환
	 : 프로그램에서 명시적으로 지정하는 타입변환.
	 축소변환이 되는 경우는 반드시 명시적으로 캐스팅해야 함.
	 주의!!! 데이터 손상 발생 가능.	
	 */
		float varFlo = 123.456f;
		int downFlo = (int) varFlo; //(int):eclipse가 에러 수정하도록.
		System.out.println("다운캐스팅 결과값 : "+downFlo);
	}
}
