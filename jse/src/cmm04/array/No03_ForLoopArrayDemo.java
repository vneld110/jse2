package cmm04.array;

import java.util.Scanner;

public class No03_ForLoopArrayDemo {
	public static void main(String[] args) {
		// 1부터 5까지의 합을 구하세요.
		No03_ForLoopArrayVO arrayVO = new No03_ForLoopArrayVO();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("다섯개의 숫자를 입력하세요.");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		
		arrayVO.forLoopArrayVO(a,b,c,d,e);
		
	}
}
