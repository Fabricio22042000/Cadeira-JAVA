package exercicios.main;

import javax.swing.JOptionPane;

public class ExercicioQ2 {

	public static void main(String[] args) {
		String pass = cadastrarSenha();
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número "));
		String passUsu= login();
		if (pass.equals(passUsu)) {
			System.out.print("Resultado: ");
			System.out.println(divisao(n1, n2));
		}else {
			System.out.println("Senha incorreta");
		}
		System.exit(0);

	}

	public static String cadastrarSenha() {
		String password = JOptionPane.showInputDialog("Digite sua senha para cadastrar: ");
		return password;
	}

	public static double divisao(int n1, int n2) {
		double result = (double) n1 / n2;
		return result;
	}

	public static String login() {
		String password = JOptionPane.showInputDialog("Digite sua senha: ");
		return password;
	}
}
