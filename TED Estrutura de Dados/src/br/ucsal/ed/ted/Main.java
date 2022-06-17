package br.ucsal.ed.ted;

public class Main {

	static Ordenacao sort = new Ordenacao();

	public static void main(String[] args) {
		sortBubble();
	}

	/**
	 * Esses métodos geram somente vetores totalmente aleatórios, temos que ver
	 * também para gerarmos vetores do mesmo tamanho porém os outros vetores terão
	 * que ser quase ordenados (10% fora de ordem), inversamente ordenados (acho que
	 * com um 'for' dá para fazer isso), e também um vetor já ordenado, e nesse caso
	 * eu acho que é só passarmos de novo o mesmo vetor já ordenado alguma vez, para
	 * ordenar de novo.
	 */
	public static int[] vetor100() {
		int quantidade = 100;
		int[] vetor = new int[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}
		return vetor;
	}

	public static int[] vetor1000() {
		int quantidade = 1000;
		int[] vetor = new int[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}
		return vetor;
	}

	public static int[] vetor10000() {
		int quantidade = 10000;
		int[] vetor = new int[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}
		return vetor;
	}

	public static int[] vetor100000() {
		int quantidade = 100000;
		int[] vetor = new int[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}
		return vetor;
	}

	// Método que chama o BubbleSort
	public static void sortBubble() {
		System.out.println("Execução do Método de Ordenação - Bubble Sort -");
		int[] vetor100 = vetor100(); // Obtém o vetor
		long tempoInicial100 = System.currentTimeMillis(); // Começa a contar
		sort.bubbleSort(vetor100); // Ordena
		long tempoFinal100 = System.currentTimeMillis(); // Trermina de contar
		System.out.println("Vetor de tamanho 100, tempo de ordenação = " + (tempoFinal100 - tempoInicial100) + " ms"); // Exibe o tempo gasto

		int[] vetor1000 = vetor1000();
		long tempoInicial1000 = System.currentTimeMillis();
		sort.bubbleSort(vetor1000);
		long tempoFinal1000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 1000, tempo de ordenação = " + (tempoFinal1000 - tempoInicial1000) + " ms");

		int[] vetor10000 = vetor10000();
		long tempoInicial10000 = System.currentTimeMillis();
		sort.bubbleSort(vetor10000);
		long tempoFinal10000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 10000, tempo de ordenação = " + (tempoFinal10000 - tempoInicial10000) + " ms");

		int[] vetor100000 = vetor100000();
		long tempoInicial100000 = System.currentTimeMillis();
		sort.bubbleSort(vetor100000);
		long tempoFinal100000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100000, tempo de ordenação = " + (tempoFinal100000 - tempoInicial100000) + " ms");

		System.out.println("Tempo total de execução = " + (tempoFinal100000 - tempoInicial100) + " ms");
	}

}
