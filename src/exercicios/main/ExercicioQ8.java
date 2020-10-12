package exercicios.main;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ExercicioQ8 {

	public static void main(String[] args) {
		for(int i=1;i <= 6;i++) {
			double num = (Math.random()*59)+1;
			NumberFormat nf = new DecimalFormat("##");
			System.out.println("("+i+") " + nf.format(num));
		}
	}

}
