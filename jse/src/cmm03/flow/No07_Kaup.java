package cmm03.flow;

import java.util.Scanner;

public class No07_Kaup {

	double height;
	double weight;
	int idx;
	Scanner scanner = new Scanner(System.in);
	
	No07_Kaup() {
		this(0,0); //바로 호출
	}
	
	No07_Kaup(double i, double j) {
		this.height = i;
		this.weight = j;
	}
}
