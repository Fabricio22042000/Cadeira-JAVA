package exercicios.main;

import javax.swing.JOptionPane;

public class ExercicioQ4 {
	public static final String SENHA = "123456";

	public static void main(String[] args) {
		String pass = JOptionPane.showInputDialog("Digite sua senha: ");
		validarSenha(pass);
	}

	public static void validarSenha(String pass) {
		if (pass.equals(ExercicioQ4.SENHA)) {
			System.out.println("Acesso Liberado");
		} else {
			System.out.println("Acesso Negado");
		}
	}
}
