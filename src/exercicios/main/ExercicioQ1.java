package exercicios.main;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import javax.swing.JOptionPane;

public class ExercicioQ1 {

	public static void main(String[] args) {
		double imc = imc();
		System.out.println(imc);
		if (imc < 18.5) {
			System.out.println("Magro");
		}else if(imc > 18.5 && imc < 24.9) {
			System.out.println("Normal");
		}else if(imc > 24.9 && imc < 29.9) {
			System.out.println("Sobrepeso");
		}else if(imc > 29.9 && imc < 34.9) {
			System.out.println("Obeso");
		}else if(imc > 34.9 && imc < 39.9) {
			System.out.println("Obesidade mórbida");
		}
	}

	public static Double imc() {
		NumberFormat f = NumberFormat.getInstance(new Locale("en", "us"));
		f.setMaximumFractionDigits(2);
		Double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
		Double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
		double imc = Double.parseDouble(f.format(peso / Math.pow(altura, 2)));
		return imc;
	}
}
