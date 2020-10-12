package exercicios.main;

import javax.swing.JOptionPane;

public class ExercicioQ5 {

	public static void main(String[] args) {
		int golsNacional = Integer.parseInt(JOptionPane.showInputDialog("Digite os gols do Nacional de patos: "));
		int golsTreze = Integer.parseInt(JOptionPane.showInputDialog("Digite os gols do Treze: "));
		vencedorJogo(golsNacional, golsTreze);
	}

	public static void vencedorJogo(int gols1, int gols2) {
		if (gols1 > gols2) {
			System.out.println("Nacional de patos ganhou!");
		} else if (gols1 < gols2) {
			System.out.println("Treze ganhou!");
		} else {
			System.out.println("Empate!");
		}
	}
}
