package exercicios.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExercicioQ3 {

	public static void main(String[] args) {
		String nomes[] = {"Fabricio", "Ana", "Felipe", "Marcela", "João"};
		List<String> listaNomes = Arrays.asList(nomes);
		Collections.sort(listaNomes);
		String menorNome = listaNomes.get(0);
		System.out.println("Menor nome : " + menorNome);
	}

}
