package br.ucsal.ed.ted;

public class Main {

	static Ordenacao sort = new Ordenacao();

	public static void main(String[] args) {
		sortBubble();
		sortSelection();
		sortInsertion();
		sortQuick();
		sortHeap();
		sortMerge();
	}
 
	// Métodos geradores de vetores desordenados
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
	
	// Métodos geradores de vetores desordenados do tipo Integer, de uso exclusivo do método de ordenação Heap Sort
	private static Integer[] vetorInteger100() {
		int quantidade = 100;
		Integer[] vetor = new Integer[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}
		return vetor;
	}
	
	private static Integer[] vetorInteger1000() {
		int quantidade = 1000;
		Integer[] vetor = new Integer[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}
		return vetor;
	}
	
	private static Integer[] vetorInteger10000() {
		int quantidade = 10000;
		Integer[] vetor = new Integer[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}
		return vetor;
	}
	
	private static Integer[] vetorInteger100000() {
		int quantidade = 100000;
		Integer[] vetor = new Integer[quantidade];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * quantidade);
		}
		return vetor;
	}
	
	// Esse método recebe um vetor organizado e desorganiza os últimos 10 valores ([90] a [99])
	public static int[] foraDeOrdem10(int[] vetor) {
		int x = ((vetor.length * 90) / 100);
		for (int i = x; i < vetor.length; i++) {
			vetor[i] = (int) (Math.random() * (vetor.length));
		}
		
		/**
		 * Outra lógica para o tratamento do vetor seria essa, que recebe um vetor
		 * desorganizado, e ordena somente 90% dele, ao invés de receber um vetor
		 * organizado que só desordena 10% dele, como faz a lógica de cima.
		 * 
		 * int j; int key; int i; int x = (90 * vetor.length) / 100; for (j = 0; j != x;
		 * j++) { key = vetor[j]; for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
		 * vetor[i + 1] = vetor[i]; } vetor[i + 1] = key; }
		 * 
		 */
		
		return vetor;
	}
	
	// Esse método recebe um vetor organizado do tipo Integer e desorganiza os últimos 10 valores ([90] a [99]), de uso exclusivo do método de ordenação Heap Sort
	private static Integer[] foraDeOrdemInteger10(Integer[] vetorInteiro) {
		int x = ((vetorInteiro.length * 90) / 100);
		for (int i = x; i < vetorInteiro.length; i++) {
			vetorInteiro[i] = (int) (Math.random() * (vetorInteiro.length));
		}
		return vetorInteiro;
	}

	// Método para inverter um vetor organizado
	public static int[] inverteVetor(int[] vetor) {
		for (int i = 0; i < vetor.length / 2; i++) {
			int x = vetor[i];
			vetor[i] = vetor[vetor.length - 1 - i];
			vetor[vetor.length - 1 - i] = x;
		}
		return vetor;
	}
	
	// Método para inverter um vetor do tipo Integer organizado, de uso exclusivo do método de ordenação Heap Sort
	private static Integer[] inverteVetorInteger(Integer[] vetorInteiro) {
		for (int i = 0; i < vetorInteiro.length / 2; i++) {
			int x = vetorInteiro[i];
			vetorInteiro[i] = vetorInteiro[vetorInteiro.length - 1 - i];
			vetorInteiro[vetorInteiro.length - 1 - i] = x;
		}
		return vetorInteiro;
	}

	// Método que chama e executa o BubbleSort
	public static void sortBubble() {
		System.out.println("Execução do Método de Ordenação - Bubble Sort:");
		int[] vetor100 = vetor100(); // Obtém o vetor
		long tempoInicial100 = System.currentTimeMillis(); // Começa a contar
		sort.bubbleSort(vetor100); // Ordena
		long tempoFinal100 = System.currentTimeMillis(); // Trermina de contar
		System.out.println("Vetor de tamanho 100 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100 - tempoInicial100) + " ms;"); // Exibe o tempo gasto
		long tempoInicialO100 = System.currentTimeMillis();
		sort.bubbleSort(vetor100);
		long tempoFinalO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100 - tempoInicialO100) + " ms;");
		foraDeOrdem10(vetor100);
		long tempoInicialFO100 = System.currentTimeMillis();
		sort.bubbleSort(vetor100);
		long tempoFinalFO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100 - tempoInicialFO100) + " ms;");
		inverteVetor(vetor100);
		long tempoInicialD100 = System.currentTimeMillis();
		sort.bubbleSort(vetor100);
		long tempoFinalD100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100 - tempoInicialD100) + " ms;\n}");
		
		int[] vetor1000 = vetor1000();
		long tempoInicial1000 = System.currentTimeMillis();
		sort.bubbleSort(vetor1000);
		long tempoFinal1000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 1000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal1000 - tempoInicial1000) + " ms;");
		long tempoInicialO1000 = System.currentTimeMillis();
		sort.bubbleSort(vetor1000);
		long tempoFinalO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO1000 - tempoInicialO1000) + " ms;");
		foraDeOrdem10(vetor1000);
		long tempoInicialFO1000 = System.currentTimeMillis();
		sort.bubbleSort(vetor1000);
		long tempoFinalFO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO1000 - tempoInicialFO1000) + " ms;");
		inverteVetor(vetor1000);
		long tempoInicialD1000 = System.currentTimeMillis();
		sort.bubbleSort(vetor1000);
		long tempoFinalD1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD1000 - tempoInicialD1000) + " ms;\n}");
		
		int[] vetor10000 = vetor10000();
		long tempoInicial10000 = System.currentTimeMillis();
		sort.bubbleSort(vetor10000);
		long tempoFinal10000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 10000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal10000 - tempoInicial10000) + " ms;");
		long tempoInicialO10000 = System.currentTimeMillis();
		sort.bubbleSort(vetor10000);
		long tempoFinalO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO10000 - tempoInicialO10000) + " ms;");
		foraDeOrdem10(vetor10000);
		long tempoInicialFO10000 = System.currentTimeMillis();
		sort.bubbleSort(vetor10000);
		long tempoFinalFO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO10000 - tempoInicialFO10000) + " ms;");
		inverteVetor(vetor10000);
		long tempoInicialD10000 = System.currentTimeMillis();
		sort.bubbleSort(vetor10000);
		long tempoFinalD10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD10000 - tempoInicialD10000) + " ms;\n}");
		
		int[] vetor100000 = vetor100000();
		long tempoInicial100000 = System.currentTimeMillis();
		sort.bubbleSort(vetor100000);
		long tempoFinal100000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100000 - tempoInicial100000) + " ms;");
		long tempoInicialO100000 = System.currentTimeMillis();
		sort.bubbleSort(vetor100000);
		long tempoFinalO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100000 - tempoInicialO100000) + " ms;");
		foraDeOrdem10(vetor100000);
		long tempoInicialFO100000 = System.currentTimeMillis();
		sort.bubbleSort(vetor100000);
		long tempoFinalFO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100000 - tempoInicialFO100000) + " ms;");
		inverteVetor(vetor100000);
		long tempoInicialD100000 = System.currentTimeMillis();
		sort.bubbleSort(vetor100000);
		long tempoFinalD100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100000 - tempoInicialD100000) + " ms;\n}");
		
		System.out.println("Tempo total de execução do método de ordenação Bubble Sort = " + (tempoFinalD100000 - tempoInicial100) + " ms\n======================================================================:");
	}
	
	// Método que chama e executa o SelectionSort
	public static void sortSelection() {
		System.out.println("Execução do Método de Ordenação - Selection Sort:");
		int[] vetor100 = vetor100();
		long tempoInicial100 = System.currentTimeMillis();
		sort.selectionSort(vetor100);
		long tempoFinal100 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100 - tempoInicial100) + " ms;"); // Exibe o tempo gasto
		long tempoInicialO100 = System.currentTimeMillis();
		sort.selectionSort(vetor100);
		long tempoFinalO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100 - tempoInicialO100) + " ms;");
		foraDeOrdem10(vetor100);
		long tempoInicialFO100 = System.currentTimeMillis();
		sort.selectionSort(vetor100);
		long tempoFinalFO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100 - tempoInicialFO100) + " ms;");
		inverteVetor(vetor100);
		long tempoInicialD100 = System.currentTimeMillis();
		sort.selectionSort(vetor100);
		long tempoFinalD100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100 - tempoInicialD100) + " ms;\n}");
		
		int[] vetor1000 = vetor1000();
		long tempoInicial1000 = System.currentTimeMillis();
		sort.selectionSort(vetor1000);
		long tempoFinal1000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 1000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal1000 - tempoInicial1000) + " ms;");
		long tempoInicialO1000 = System.currentTimeMillis();
		sort.selectionSort(vetor1000);
		long tempoFinalO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO1000 - tempoInicialO1000) + " ms;");
		foraDeOrdem10(vetor1000);
		long tempoInicialFO1000 = System.currentTimeMillis();
		sort.selectionSort(vetor1000);
		long tempoFinalFO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO1000 - tempoInicialFO1000) + " ms;");
		inverteVetor(vetor1000);
		long tempoInicialD1000 = System.currentTimeMillis();
		sort.selectionSort(vetor1000);
		long tempoFinalD1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD1000 - tempoInicialD1000) + " ms;\n}");
		
		int[] vetor10000 = vetor10000();
		long tempoInicial10000 = System.currentTimeMillis();
		sort.selectionSort(vetor10000);
		long tempoFinal10000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 10000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal10000 - tempoInicial10000) + " ms;");
		long tempoInicialO10000 = System.currentTimeMillis();
		sort.selectionSort(vetor10000);
		long tempoFinalO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO10000 - tempoInicialO10000) + " ms;");
		foraDeOrdem10(vetor10000);
		long tempoInicialFO10000 = System.currentTimeMillis();
		sort.selectionSort(vetor10000);
		long tempoFinalFO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO10000 - tempoInicialFO10000) + " ms;");
		inverteVetor(vetor10000);
		long tempoInicialD10000 = System.currentTimeMillis();
		sort.selectionSort(vetor10000);
		long tempoFinalD10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD10000 - tempoInicialD10000) + " ms;\n}");
		
		int[] vetor100000 = vetor100000();
		long tempoInicial100000 = System.currentTimeMillis();
		sort.selectionSort(vetor100000);
		long tempoFinal100000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100000 - tempoInicial100000) + " ms;");
		long tempoInicialO100000 = System.currentTimeMillis();
		sort.selectionSort(vetor100000);
		long tempoFinalO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100000 - tempoInicialO100000) + " ms;");
		foraDeOrdem10(vetor100000);
		long tempoInicialFO100000 = System.currentTimeMillis();
		sort.selectionSort(vetor100000);
		long tempoFinalFO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100000 - tempoInicialFO100000) + " ms;");
		inverteVetor(vetor100000);
		long tempoInicialD100000 = System.currentTimeMillis();
		sort.selectionSort(vetor100000);
		long tempoFinalD100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100000 - tempoInicialD100000) + " ms;\n}");
		
		System.out.println("Tempo total de execução do método de ordenação Selection Sort = " + (tempoFinalD100000 - tempoInicial100) + " ms\n======================================================================:");
	}
	
	// Método que chama e executa o Insertion Sort
	public static void sortInsertion() {
		System.out.println("Execução do Método de Ordenação - Insertion Sort:");
		int[] vetor100 = vetor100();
		long tempoInicial100 = System.currentTimeMillis();
		sort.insertionSort(vetor100);
		long tempoFinal100 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100 - tempoInicial100) + " ms;"); // Exibe o tempo gasto
		long tempoInicialO100 = System.currentTimeMillis();
		sort.insertionSort(vetor100);
		long tempoFinalO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100 - tempoInicialO100) + " ms;");
		foraDeOrdem10(vetor100);
		long tempoInicialFO100 = System.currentTimeMillis();
		sort.insertionSort(vetor100);
		long tempoFinalFO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100 - tempoInicialFO100) + " ms;");
		inverteVetor(vetor100);
		long tempoInicialD100 = System.currentTimeMillis();
		sort.insertionSort(vetor100);
		long tempoFinalD100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100 - tempoInicialD100) + " ms;\n}");
		
		int[] vetor1000 = vetor1000();
		long tempoInicial1000 = System.currentTimeMillis();
		sort.insertionSort(vetor1000);
		long tempoFinal1000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 1000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal1000 - tempoInicial1000) + " ms;");
		long tempoInicialO1000 = System.currentTimeMillis();
		sort.insertionSort(vetor1000);
		long tempoFinalO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO1000 - tempoInicialO1000) + " ms;");
		foraDeOrdem10(vetor1000);
		long tempoInicialFO1000 = System.currentTimeMillis();
		sort.insertionSort(vetor1000);
		long tempoFinalFO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO1000 - tempoInicialFO1000) + " ms;");
		inverteVetor(vetor1000);
		long tempoInicialD1000 = System.currentTimeMillis();
		sort.insertionSort(vetor1000);
		long tempoFinalD1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD1000 - tempoInicialD1000) + " ms;\n}");
		
		int[] vetor10000 = vetor10000();
		long tempoInicial10000 = System.currentTimeMillis();
		sort.insertionSort(vetor10000);
		long tempoFinal10000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 10000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal10000 - tempoInicial10000) + " ms;");
		long tempoInicialO10000 = System.currentTimeMillis();
		sort.insertionSort(vetor10000);
		long tempoFinalO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO10000 - tempoInicialO10000) + " ms;");
		foraDeOrdem10(vetor10000);
		long tempoInicialFO10000 = System.currentTimeMillis();
		sort.insertionSort(vetor10000);
		long tempoFinalFO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO10000 - tempoInicialFO10000) + " ms;");
		inverteVetor(vetor10000);
		long tempoInicialD10000 = System.currentTimeMillis();
		sort.insertionSort(vetor10000);
		long tempoFinalD10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD10000 - tempoInicialD10000) + " ms;\n}");
		
		int[] vetor100000 = vetor100000();
		long tempoInicial100000 = System.currentTimeMillis();
		sort.insertionSort(vetor100000);
		long tempoFinal100000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100000 - tempoInicial100000) + " ms;");
		long tempoInicialO100000 = System.currentTimeMillis();
		sort.insertionSort(vetor100000);
		long tempoFinalO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100000 - tempoInicialO100000) + " ms;");
		foraDeOrdem10(vetor100000);
		long tempoInicialFO100000 = System.currentTimeMillis();
		sort.insertionSort(vetor100000);
		long tempoFinalFO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100000 - tempoInicialFO100000) + " ms;");
		inverteVetor(vetor100000);
		long tempoInicialD100000 = System.currentTimeMillis();
		sort.insertionSort(vetor100000);
		long tempoFinalD100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100000 - tempoInicialD100000) + " ms;\n}");
		
		System.out.println("Tempo total de execução do método de ordenação Insertion Sort = " + (tempoFinalD100000 - tempoInicial100) + " ms\n======================================================================:");
	}
	
	// Método que chama e executa o Quick Sort
	public static void sortQuick() {
		System.out.println("Execução do Método de Ordenação - Quick Sort:");
		int[] vetor100 = vetor100();
		long tempoInicial100 = System.currentTimeMillis();
		sort.quickSort(vetor100, 0, 99);
		long tempoFinal100 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100 - tempoInicial100) + " ms;"); // Exibe o tempo gasto
		long tempoInicialO100 = System.currentTimeMillis();
		sort.quickSort(vetor100, 0, 99);
		long tempoFinalO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100 - tempoInicialO100) + " ms;");
		foraDeOrdem10(vetor100);
		long tempoInicialFO100 = System.currentTimeMillis();
		sort.quickSort(vetor100, 0, 99);
		long tempoFinalFO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100 - tempoInicialFO100) + " ms;");
		inverteVetor(vetor100);
		long tempoInicialD100 = System.currentTimeMillis();
		sort.quickSort(vetor100, 0, 99);
		long tempoFinalD100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100 - tempoInicialD100) + " ms;\n}");
		
		int[] vetor1000 = vetor1000();
		long tempoInicial1000 = System.currentTimeMillis();
		sort.quickSort(vetor1000, 0, 999);
		long tempoFinal1000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 1000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal1000 - tempoInicial1000) + " ms;");
		long tempoInicialO1000 = System.currentTimeMillis();
		sort.quickSort(vetor1000, 0, 999);
		long tempoFinalO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO1000 - tempoInicialO1000) + " ms;");
		foraDeOrdem10(vetor1000);
		long tempoInicialFO1000 = System.currentTimeMillis();
		sort.quickSort(vetor1000, 0, 999);
		long tempoFinalFO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO1000 - tempoInicialFO1000) + " ms;");
		inverteVetor(vetor1000);
		long tempoInicialD1000 = System.currentTimeMillis();
		sort.quickSort(vetor1000, 0, 999);
		long tempoFinalD1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD1000 - tempoInicialD1000) + " ms;\n}");
		
		int[] vetor10000 = vetor10000();
		long tempoInicial10000 = System.currentTimeMillis();
		sort.quickSort(vetor10000, 0, 9999);
		long tempoFinal10000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 10000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal10000 - tempoInicial10000) + " ms;");
		long tempoInicialO10000 = System.currentTimeMillis();
		sort.quickSort(vetor10000, 0, 9999);
		long tempoFinalO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO10000 - tempoInicialO10000) + " ms;");
		foraDeOrdem10(vetor10000);
		long tempoInicialFO10000 = System.currentTimeMillis();
		sort.quickSort(vetor10000, 0, 9999);
		long tempoFinalFO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO10000 - tempoInicialFO10000) + " ms;");
		inverteVetor(vetor10000);
		long tempoInicialD10000 = System.currentTimeMillis();
		sort.quickSort(vetor10000, 0, 9999);
		long tempoFinalD10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD10000 - tempoInicialD10000) + " ms;\n}");
		
		int[] vetor100000 = vetor100000();
		long tempoInicial100000 = System.currentTimeMillis();
		sort.quickSort(vetor100000, 0, 99999);
		long tempoFinal100000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100000 - tempoInicial100000) + " ms;");
		long tempoInicialO100000 = System.currentTimeMillis();
		sort.quickSort(vetor100000, 0, 99999);
		long tempoFinalO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100000 - tempoInicialO100000) + " ms;");
		foraDeOrdem10(vetor100000);
		long tempoInicialFO100000 = System.currentTimeMillis();
		sort.quickSort(vetor100000, 0, 99999);
		long tempoFinalFO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100000 - tempoInicialFO100000) + " ms;");
		inverteVetor(vetor100000);
		long tempoInicialD100000 = System.currentTimeMillis();
		sort.quickSort(vetor100000, 0, 99999);
		long tempoFinalD100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100000 - tempoInicialD100000) + " ms;\n}");
		
		System.out.println("Tempo total de execução do método de ordenação Quick Sort = " + (tempoFinalD100000 - tempoInicial100) + " ms\n======================================================================:");
	}
	
	// Método que chama e executa o Heap Sort
	public static void sortHeap() {
		System.out.println("Execução do Método de Ordenação - Heap Sort:");
		Integer[] vetor100 = vetorInteger100();
		long tempoInicial100 = System.currentTimeMillis();
		sort.heapSort(vetor100);
		long tempoFinal100 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100 (Integer) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100 - tempoInicial100) + " ms;"); // Exibe o tempo gasto
		long tempoInicialO100 = System.currentTimeMillis();
		sort.heapSort(vetor100);
		long tempoFinalO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100 - tempoInicialO100) + " ms;");
		foraDeOrdemInteger10(vetor100);
		long tempoInicialFO100 = System.currentTimeMillis();
		sort.heapSort(vetor100);
		long tempoFinalFO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100 - tempoInicialFO100) + " ms;");
		inverteVetorInteger(vetor100);
		long tempoInicialD100 = System.currentTimeMillis();
		sort.heapSort(vetor100);
		long tempoFinalD100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100 - tempoInicialD100) + " ms;\n}");
		
		Integer[] vetor1000 = vetorInteger1000();
		long tempoInicial1000 = System.currentTimeMillis();
		sort.heapSort(vetor1000);
		long tempoFinal1000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 1000 (Integer) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal1000 - tempoInicial1000) + " ms;");
		long tempoInicialO1000 = System.currentTimeMillis();
		sort.heapSort(vetor1000);
		long tempoFinalO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO1000 - tempoInicialO1000) + " ms;");
		foraDeOrdemInteger10(vetor1000);
		long tempoInicialFO1000 = System.currentTimeMillis();
		sort.heapSort(vetor1000);
		long tempoFinalFO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO1000 - tempoInicialFO1000) + " ms;");
		inverteVetorInteger(vetor1000);
		long tempoInicialD1000 = System.currentTimeMillis();
		sort.heapSort(vetor1000);
		long tempoFinalD1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD1000 - tempoInicialD1000) + " ms;\n}");
		
		Integer[] vetor10000 = vetorInteger10000();
		long tempoInicial10000 = System.currentTimeMillis();
		sort.heapSort(vetor10000);
		long tempoFinal10000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 10000 (Integer) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal10000 - tempoInicial10000) + " ms;");
		long tempoInicialO10000 = System.currentTimeMillis();
		sort.heapSort(vetor10000);
		long tempoFinalO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO10000 - tempoInicialO10000) + " ms;");
		foraDeOrdemInteger10(vetor10000);
		long tempoInicialFO10000 = System.currentTimeMillis();
		sort.heapSort(vetor10000);
		long tempoFinalFO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO10000 - tempoInicialFO10000) + " ms;");
		inverteVetorInteger(vetor10000);
		long tempoInicialD10000 = System.currentTimeMillis();
		sort.heapSort(vetor10000);
		long tempoFinalD10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD10000 - tempoInicialD10000) + " ms;\n}");
		
		Integer[] vetor100000 = vetorInteger100000();
		long tempoInicial100000 = System.currentTimeMillis();
		sort.heapSort(vetor100000);
		long tempoFinal100000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100000 (Integer) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100000 - tempoInicial100000) + " ms;");
		long tempoInicialO100000 = System.currentTimeMillis();
		sort.heapSort(vetor100000);
		long tempoFinalO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100000 - tempoInicialO100000) + " ms;");
		foraDeOrdemInteger10(vetor100000);
		long tempoInicialFO100000 = System.currentTimeMillis();
		sort.heapSort(vetor100000);
		long tempoFinalFO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100000 - tempoInicialFO100000) + " ms;");
		inverteVetorInteger(vetor100000);
		long tempoInicialD100000 = System.currentTimeMillis();
		sort.heapSort(vetor100000);
		long tempoFinalD100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100000 - tempoInicialD100000) + " ms;\n}");
		
		System.out.println("Tempo total de execução do método de ordenação Heap Sort = " + (tempoFinalD100000 - tempoInicial100) + " ms\n======================================================================:");
	}
	
	// Método que chama e executa o Merge Sort
	public static void sortMerge() {
		System.out.println("Execução do Método de Ordenação - Merge Sort:");
		int[] vetor100 = vetor100();
		long tempoInicial100 = System.currentTimeMillis();
		sort.mergeSort(vetor100, 0, 99);
		long tempoFinal100 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100 - tempoInicial100) + " ms;"); // Exibe o tempo gasto
		long tempoInicialO100 = System.currentTimeMillis();
		sort.mergeSort(vetor100, 0, 99);
		long tempoFinalO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100 - tempoInicialO100) + " ms;");
		foraDeOrdem10(vetor100);
		long tempoInicialFO100 = System.currentTimeMillis();
		sort.mergeSort(vetor100, 0, 99);
		long tempoFinalFO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100 - tempoInicialFO100) + " ms;");
		inverteVetor(vetor100);
		long tempoInicialD100 = System.currentTimeMillis();
		sort.mergeSort(vetor100, 0, 99);
		long tempoFinalD100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100 - tempoInicialD100) + " ms;\n}");
		
		int[] vetor1000 = vetor1000();
		long tempoInicial1000 = System.currentTimeMillis();
		sort.mergeSort(vetor1000, 0, 999);
		long tempoFinal1000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 1000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal1000 - tempoInicial1000) + " ms;");
		long tempoInicialO1000 = System.currentTimeMillis();
		sort.mergeSort(vetor1000, 0, 999);
		long tempoFinalO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO1000 - tempoInicialO1000) + " ms;");
		foraDeOrdem10(vetor1000);
		long tempoInicialFO1000 = System.currentTimeMillis();
		sort.mergeSort(vetor1000, 0, 999);
		long tempoFinalFO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO1000 - tempoInicialFO1000) + " ms;");
		inverteVetor(vetor1000);
		long tempoInicialD1000 = System.currentTimeMillis();
		sort.mergeSort(vetor1000, 0, 999);
		long tempoFinalD1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD1000 - tempoInicialD1000) + " ms;\n}");
		
		int[] vetor10000 = vetor10000();
		long tempoInicial10000 = System.currentTimeMillis();
		sort.mergeSort(vetor10000, 0, 9999);
		long tempoFinal10000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 10000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal10000 - tempoInicial10000) + " ms;");
		long tempoInicialO10000 = System.currentTimeMillis();
		sort.mergeSort(vetor10000, 0, 9999);
		long tempoFinalO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO10000 - tempoInicialO10000) + " ms;");
		foraDeOrdem10(vetor10000);
		long tempoInicialFO10000 = System.currentTimeMillis();
		sort.mergeSort(vetor10000, 0, 9999);
		long tempoFinalFO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO10000 - tempoInicialFO10000) + " ms;");
		inverteVetor(vetor10000);
		long tempoInicialD10000 = System.currentTimeMillis();
		sort.mergeSort(vetor10000, 0, 9999);
		long tempoFinalD10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD10000 - tempoInicialD10000) + " ms;\n}");
		
		int[] vetor100000 = vetor100000();
		long tempoInicial100000 = System.currentTimeMillis();
		sort.mergeSort(vetor100000, 0, 99999);
		long tempoFinal100000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100000 - tempoInicial100000) + " ms;");
		long tempoInicialO100000 = System.currentTimeMillis();
		sort.mergeSort(vetor100000, 0, 99999);
		long tempoFinalO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100000 - tempoInicialO100000) + " ms;");
		foraDeOrdem10(vetor100000);
		long tempoInicialFO100000 = System.currentTimeMillis();
		sort.mergeSort(vetor100000, 0, 99999);
		long tempoFinalFO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100000 - tempoInicialFO100000) + " ms;");
		inverteVetor(vetor100000);
		long tempoInicialD100000 = System.currentTimeMillis();
		sort.mergeSort(vetor100000, 0, 99999);
		long tempoFinalD100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100000 - tempoInicialD100000) + " ms;\n}");
		
		System.out.println("Tempo total de execução do método de ordenação Merge Sort = " + (tempoFinalD100000 - tempoInicial100) + " ms\n======================================================================:");
	}
}
