package exercicios.main;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class ExercicioQ10 {

	public static void main(String[] args) throws ParseException {
		Double nota1;
		Double nota2;
		Double nota3;
		double somaNotas = 0;
		NumberFormat df = new DecimalFormat("#.#");

		String alunosArray[] = { "Fabricio", "Maiara", "Rafaela", "João", "Pedro", "Maria", "Joana", "Ricardo",
				"Cleber", "Gabriel" };
		
		Map<String, double[]> map = new LinkedHashMap<>();
		for (int i = 0; i < alunosArray.length; i++) {
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1: "));
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2: "));
			nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3: "));
			map.put(alunosArray[i], new double[] { nota1, nota2, nota3 });
		}
		for (Map.Entry<String, double[]> c : map.entrySet()) {
			System.out.print("Nome: " + c.getKey() + " => ");
			for (int i = 0; i < c.getValue().length; i++) {
				somaNotas += c.getValue()[i];
				if (i == 2) {
					System.out.print("Nota 3: " + c.getValue()[i] + " / ");
					System.out.println("Média: " + df.parse(df.format(somaNotas / 3)));
				} else {
					System.out.print("Nota " + (i + 1) + ": " + c.getValue()[i] + " / ");
				}
			}
			somaNotas = 0;
		}
	}

}
