package projeto.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Piramide {
	
	/*
	 * Aluno: Fabrício Moura Feitosa Filho
	 * Professor: Walter Travassos
	 */

	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		
		while(true) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			numeros.add(num);
			String op = JOptionPane.showInputDialog("Deseja digitar mais números? S/N");
			
			if(op.equalsIgnoreCase("n")) {
				break;
			}
		}
		
		List<Integer> numerosLinha = new ArrayList<>();
		List<Integer> menoresNumeros = new ArrayList<>();
		
		int limiteNumeros = 1;
		int qntNumeros = 0;
		
		for(Integer num : numeros) {
			if(qntNumeros < limiteNumeros) {
				System.out.print(num + " ");
				numerosLinha.add(num);
				qntNumeros++;
			}else {
				Collections.sort(numerosLinha);
				menoresNumeros.add(numerosLinha.get(0));
				System.out.println();
				System.out.print(num + " ");
				numerosLinha.clear();
				numerosLinha.add(num);
				qntNumeros = 1;
				limiteNumeros++;
			}
		}
		Collections.sort(numerosLinha);
		menoresNumeros.add(numerosLinha.get(0));
		int somaMenoresNumeros = 0;
		for(Integer num : menoresNumeros) {
			somaMenoresNumeros += num;
		}
		System.out.println();
		System.out.println("Menores números das respectivas linhas são: " + menoresNumeros);
		System.out.println("A soma dos menores números é: " + somaMenoresNumeros);
	}
}
