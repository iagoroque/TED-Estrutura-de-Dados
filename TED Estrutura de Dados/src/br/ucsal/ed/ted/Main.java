package br.ucsal.ed.ted;

public class Main {

	public static void main(String[] args) {
		int quantidade = 10000;
		int[] vetor = new int[quantidade];

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}

		Ordenacao sort = new Ordenacao();

		long tempoInicial = System.currentTimeMillis();

		sort.mergeSort(vetor, 0, 10000);

		long tempoFinal = System.currentTimeMillis();

		System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
	}

}
