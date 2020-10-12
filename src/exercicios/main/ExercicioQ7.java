package exercicios.main;

import javax.swing.JOptionPane;

public class ExercicioQ7 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c: "));
		if((a+b) > c) {
			System.out.println("Maior que c");
		}else if((a+b) < c) {
			System.out.println("Menor que c");
		}else {
			System.out.println("Igual a c");
		}
	}

}
