package br.ucsal.ed.ted;

public class Main {

	static Ordenacao sort = new Ordenacao();

	public static void main(String[] args) {
		System.out.println("\t\t\t\t§---< ALGORITMOS DE ORDENAÇÃO >---§\nDevs -===- Harrion Borges - Iago Roque"
				+ " - Kevin Vasques - Lucas Farias - Marcos Pacheco - Oseias Lopes -===- Devs\n"
				+ "======================================================================:");
		sortBubble();
		sortSelection();
		sortInsertion();
		sortQuick();
		sortHeap();
		sortMerge();
		System.out.println("\nTrabalho de Estudo Dirigido (TED) - Estrutura de Dados, BES, UCSal, Salvador, 2022.");
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
		long tempoInicial100 = System.currentTimeMillis(); // Começa a contar o tempo
		sort.bubbleSort(vetor100); // Ordena
		long tempoFinal100 = System.currentTimeMillis(); // Termina de contar o tempo
		System.out.println("Vetor de tamanho 100 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100 - tempoInicial100)
				+ " ms, Comparações = " + sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";"); // Exibe o tempo gasto, número de comarações e de movimentações
		long guardaComp = sort.getCompBubble();
		long guardaMovi = sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		long tempoInicialO100 = System.currentTimeMillis();
		sort.bubbleSort(vetor100);
		long tempoFinalO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100 - tempoInicialO100) + " ms, Comparações = "
				+ sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";");
		guardaComp += sort.getCompBubble();
		guardaMovi += sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		foraDeOrdem10(vetor100);
		long tempoInicialFO100 = System.currentTimeMillis();
		sort.bubbleSort(vetor100);
		long tempoFinalFO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100 - tempoInicialFO100) + " ms, Comparações = "
				+ sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";");
		guardaComp += sort.getCompBubble();
		guardaMovi += sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		inverteVetor(vetor100);
		long tempoInicialD100 = System.currentTimeMillis();
		sort.bubbleSort(vetor100);
		long tempoFinalD100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100 - tempoInicialD100) + " ms, Comparações = "
				+ sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";\n}");
		guardaComp += sort.getCompBubble();
		guardaMovi += sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		
		int[] vetor1000 = vetor1000();
		long tempoInicial1000 = System.currentTimeMillis();
		sort.bubbleSort(vetor1000);
		long tempoFinal1000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 1000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal1000 - tempoInicial1000)
				+ " ms, Comparações = " + sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";");
		guardaComp += sort.getCompBubble();
		guardaMovi += sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		long tempoInicialO1000 = System.currentTimeMillis();
		sort.bubbleSort(vetor1000);
		long tempoFinalO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO1000 - tempoInicialO1000) + " ms, Comparações = "
				+ sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";");
		guardaComp += sort.getCompBubble();
		guardaMovi += sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		foraDeOrdem10(vetor1000);
		long tempoInicialFO1000 = System.currentTimeMillis();
		sort.bubbleSort(vetor1000);
		long tempoFinalFO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO1000 - tempoInicialFO1000) + " ms, Comparações = "
				+ sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";");
		guardaComp += sort.getCompBubble();
		guardaMovi += sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		inverteVetor(vetor1000);
		long tempoInicialD1000 = System.currentTimeMillis();
		sort.bubbleSort(vetor1000);
		long tempoFinalD1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD1000 - tempoInicialD1000) + " ms, Comparações = "
				+ sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";\n}");
		guardaComp += sort.getCompBubble();
		guardaMovi += sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		
		int[] vetor10000 = vetor10000();
		long tempoInicial10000 = System.currentTimeMillis();
		sort.bubbleSort(vetor10000);
		long tempoFinal10000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 10000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = "	+ (tempoFinal10000 - tempoInicial10000) 
				+ " ms, Comparações = " + sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";");
		guardaComp += sort.getCompBubble();
		guardaMovi += sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		long tempoInicialO10000 = System.currentTimeMillis();
		sort.bubbleSort(vetor10000);
		long tempoFinalO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO10000 - tempoInicialO10000) + " ms, Comparações = "
				+ sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";");
		guardaComp += sort.getCompBubble();
		guardaMovi += sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		foraDeOrdem10(vetor10000);
		long tempoInicialFO10000 = System.currentTimeMillis();
		sort.bubbleSort(vetor10000);
		long tempoFinalFO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO10000 - tempoInicialFO10000) + " ms, Comparações = "
				+ sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";");
		guardaComp += sort.getCompBubble();
		guardaMovi += sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		inverteVetor(vetor10000);
		long tempoInicialD10000 = System.currentTimeMillis();
		sort.bubbleSort(vetor10000);
		long tempoFinalD10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD10000 - tempoInicialD10000) + " ms, Comparações = "
				+ sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";\n}");
		guardaComp += sort.getCompBubble();
		guardaMovi += sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		
		int[] vetor100000 = vetor100000();
		long tempoInicial100000 = System.currentTimeMillis();
		sort.bubbleSort(vetor100000);
		long tempoFinal100000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100000 - tempoInicial100000) 
		+ " ms, Comparações = " + sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";");
		guardaComp += sort.getCompBubble();
		guardaMovi += sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		long tempoInicialO100000 = System.currentTimeMillis();
		sort.bubbleSort(vetor100000);
		long tempoFinalO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100000 - tempoInicialO100000) + " ms, Comparações = "
				+ sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";");
		guardaComp += sort.getCompBubble();
		guardaMovi += sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		foraDeOrdem10(vetor100000);
		long tempoInicialFO100000 = System.currentTimeMillis();
		sort.bubbleSort(vetor100000);
		long tempoFinalFO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100000 - tempoInicialFO100000) + " ms, Comparações = "
				+ sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";");
		guardaComp += sort.getCompBubble();
		guardaMovi += sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		inverteVetor(vetor100000);
		long tempoInicialD100000 = System.currentTimeMillis();
		sort.bubbleSort(vetor100000);
		long tempoFinalD100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100000 - tempoInicialD100000) + " ms, Comparações = "
				+ sort.getCompBubble() + ", Movimentações = " + sort.getMoviBubble() + ";\n}");
		guardaComp += sort.getCompBubble();
		guardaMovi += sort.getMoviBubble();
		sort.setCompBubble(0);
		sort.setMoviBubble(0);
		
		System.out.println("Tempo total de execução do método de ordenação Bubble Sort = " + (tempoFinalD100000 - tempoInicial100)
				+ " ms, Comparações totais = " + guardaComp + ", Movimentações totais = " + guardaMovi + ";\n====================="
				+ "=================================================:");
	}
	
	// Método que chama e executa o SelectionSort
	public static void sortSelection() {
		System.out.println("Execução do Método de Ordenação - Selection Sort:");
		int[] vetor100 = vetor100();
		long tempoInicial100 = System.currentTimeMillis();
		sort.selectionSort(vetor100);
		long tempoFinal100 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100 - tempoInicial100)
				+ " ms, Comparações = " + sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";");
		long guardaComp = sort.getCompSelection();
		long guardaMovi = sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		long tempoInicialO100 = System.currentTimeMillis();
		sort.selectionSort(vetor100);
		long tempoFinalO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100 - tempoInicialO100) + " ms, Comparações = "
				+ sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";");
		guardaComp += sort.getCompSelection();
		guardaMovi += sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		foraDeOrdem10(vetor100);
		long tempoInicialFO100 = System.currentTimeMillis();
		sort.selectionSort(vetor100);
		long tempoFinalFO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100 - tempoInicialFO100) + " ms, Comparações = "
				+ sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";");
		guardaComp += sort.getCompSelection();
		guardaMovi += sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		inverteVetor(vetor100);
		long tempoInicialD100 = System.currentTimeMillis();
		sort.selectionSort(vetor100);
		long tempoFinalD100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100 - tempoInicialD100) + " ms, Comparações = "
				+ sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";\n}");
		guardaComp += sort.getCompSelection();
		guardaMovi += sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		
		int[] vetor1000 = vetor1000();
		long tempoInicial1000 = System.currentTimeMillis();
		sort.selectionSort(vetor1000);
		long tempoFinal1000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 1000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal1000 - tempoInicial1000) + " ms, Comparações = "
				+ sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";");
		guardaComp += sort.getCompSelection();
		guardaMovi += sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		long tempoInicialO1000 = System.currentTimeMillis();
		sort.selectionSort(vetor1000);
		long tempoFinalO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO1000 - tempoInicialO1000) + " ms, Comparações = "
				+ sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";");
		guardaComp += sort.getCompSelection();
		guardaMovi += sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		foraDeOrdem10(vetor1000);
		long tempoInicialFO1000 = System.currentTimeMillis();
		sort.selectionSort(vetor1000);
		long tempoFinalFO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO1000 - tempoInicialFO1000) + " ms, Comparações = "
				+ sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";");
		guardaComp += sort.getCompSelection();
		guardaMovi += sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		inverteVetor(vetor1000);
		long tempoInicialD1000 = System.currentTimeMillis();
		sort.selectionSort(vetor1000);
		long tempoFinalD1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD1000 - tempoInicialD1000) + " ms, Comparações = "
				+ sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";\n}");
		guardaComp += sort.getCompSelection();
		guardaMovi += sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		
		int[] vetor10000 = vetor10000();
		long tempoInicial10000 = System.currentTimeMillis();
		sort.selectionSort(vetor10000);
		long tempoFinal10000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 10000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal10000 - tempoInicial10000) + " ms, Comparações = "
				+ sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";");
		guardaComp += sort.getCompSelection();
		guardaMovi += sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		long tempoInicialO10000 = System.currentTimeMillis();
		sort.selectionSort(vetor10000);
		long tempoFinalO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO10000 - tempoInicialO10000) + " ms, Comparações = "
				+ sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";");
		guardaComp += sort.getCompSelection();
		guardaMovi += sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		foraDeOrdem10(vetor10000);
		long tempoInicialFO10000 = System.currentTimeMillis();
		sort.selectionSort(vetor10000);
		long tempoFinalFO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO10000 - tempoInicialFO10000) + " ms, Comparações = "
				+ sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";");
		guardaComp += sort.getCompSelection();
		guardaMovi += sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		inverteVetor(vetor10000);
		long tempoInicialD10000 = System.currentTimeMillis();
		sort.selectionSort(vetor10000);
		long tempoFinalD10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD10000 - tempoInicialD10000) + " ms, Comparações = "
				+ sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";\n}");
		guardaComp += sort.getCompSelection();
		guardaMovi += sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		
		int[] vetor100000 = vetor100000();
		long tempoInicial100000 = System.currentTimeMillis();
		sort.selectionSort(vetor100000);
		long tempoFinal100000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100000 - tempoInicial100000) + " ms, Comparações = "
				+ sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";");
		guardaComp += sort.getCompSelection();
		guardaMovi += sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		long tempoInicialO100000 = System.currentTimeMillis();
		sort.selectionSort(vetor100000);
		long tempoFinalO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100000 - tempoInicialO100000) + " ms, Comparações = "
				+ sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";");
		guardaComp += sort.getCompSelection();
		guardaMovi += sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		foraDeOrdem10(vetor100000);
		long tempoInicialFO100000 = System.currentTimeMillis();
		sort.selectionSort(vetor100000);
		long tempoFinalFO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100000 - tempoInicialFO100000) + " ms, Comparações = "
				+ sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";");
		guardaComp += sort.getCompSelection();
		guardaMovi += sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		inverteVetor(vetor100000);
		long tempoInicialD100000 = System.currentTimeMillis();
		sort.selectionSort(vetor100000);
		long tempoFinalD100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100000 - tempoInicialD100000) + " ms, Comparações = "
				+ sort.getCompSelection() + ", Movimentações = " + sort.getMoviSelection() + ";\n}");
		guardaComp += sort.getCompSelection();
		guardaMovi += sort.getMoviSelection();
		sort.setCompSelection(0);
		sort.setMoviSelection(0);
		
		System.out.println("Tempo total de execução do método de ordenação Selection Sort = " + (tempoFinalD100000 - tempoInicial100)
				+ " ms, Comparações totais = " + guardaComp + ", Movimentações totais = " + guardaMovi + ";\n====================="
				+ "=================================================:");
	}
	
	// Método que chama e executa o Insertion Sort
	public static void sortInsertion() {
		System.out.println("Execução do Método de Ordenação - Insertion Sort:");
		int[] vetor100 = vetor100();
		long tempoInicial100 = System.currentTimeMillis();
		sort.insertionSort(vetor100);
		long tempoFinal100 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100 - tempoInicial100) + " ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";");
		long guardaComp = sort.getCompInsertion();
		long guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		long tempoInicialO100 = System.currentTimeMillis();
		sort.insertionSort(vetor100);
		long tempoFinalO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100 - tempoInicialO100) + " ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";");
		guardaComp = sort.getCompInsertion();
		guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		foraDeOrdem10(vetor100);
		long tempoInicialFO100 = System.currentTimeMillis();
		sort.insertionSort(vetor100);
		long tempoFinalFO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100 - tempoInicialFO100) + " ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";");
		guardaComp = sort.getCompInsertion();
		guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		inverteVetor(vetor100);
		long tempoInicialD100 = System.currentTimeMillis();
		sort.insertionSort(vetor100);
		long tempoFinalD100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100 - tempoInicialD100) + " ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";\n}");
		guardaComp = sort.getCompInsertion();
		guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		
		int[] vetor1000 = vetor1000();
		long tempoInicial1000 = System.currentTimeMillis();
		sort.insertionSort(vetor1000);
		long tempoFinal1000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 1000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal1000 - tempoInicial1000) + " ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";");
		guardaComp = sort.getCompInsertion();
		guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		long tempoInicialO1000 = System.currentTimeMillis();
		sort.insertionSort(vetor1000);
		long tempoFinalO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO1000 - tempoInicialO1000) + " ;ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";");
		guardaComp = sort.getCompInsertion();
		guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		foraDeOrdem10(vetor1000);
		long tempoInicialFO1000 = System.currentTimeMillis();
		sort.insertionSort(vetor1000);
		long tempoFinalFO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO1000 - tempoInicialFO1000) + " ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";");
		guardaComp = sort.getCompInsertion();
		guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		inverteVetor(vetor1000);
		long tempoInicialD1000 = System.currentTimeMillis();
		sort.insertionSort(vetor1000);
		long tempoFinalD1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD1000 - tempoInicialD1000) + " ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";\n}");
		guardaComp = sort.getCompInsertion();
		guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		
		int[] vetor10000 = vetor10000();
		long tempoInicial10000 = System.currentTimeMillis();
		sort.insertionSort(vetor10000);
		long tempoFinal10000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 10000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal10000 - tempoInicial10000) + " ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";");
		guardaComp = sort.getCompInsertion();
		guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		long tempoInicialO10000 = System.currentTimeMillis();
		sort.insertionSort(vetor10000);
		long tempoFinalO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO10000 - tempoInicialO10000) + " ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";");
		guardaComp = sort.getCompInsertion();
		guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		foraDeOrdem10(vetor10000);
		long tempoInicialFO10000 = System.currentTimeMillis();
		sort.insertionSort(vetor10000);
		long tempoFinalFO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO10000 - tempoInicialFO10000) + " ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";");
		guardaComp = sort.getCompInsertion();
		guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		inverteVetor(vetor10000);
		long tempoInicialD10000 = System.currentTimeMillis();
		sort.insertionSort(vetor10000);
		long tempoFinalD10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD10000 - tempoInicialD10000) + " ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";\n}");
		guardaComp = sort.getCompInsertion();
		guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		
		int[] vetor100000 = vetor100000();
		long tempoInicial100000 = System.currentTimeMillis();
		sort.insertionSort(vetor100000);
		long tempoFinal100000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100000 - tempoInicial100000) + " ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";");
		guardaComp = sort.getCompInsertion();
		guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		long tempoInicialO100000 = System.currentTimeMillis();
		sort.insertionSort(vetor100000);
		long tempoFinalO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100000 - tempoInicialO100000) + " ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";");
		guardaComp = sort.getCompInsertion();
		guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		foraDeOrdem10(vetor100000);
		long tempoInicialFO100000 = System.currentTimeMillis();
		sort.insertionSort(vetor100000);
		long tempoFinalFO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100000 - tempoInicialFO100000) + " ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";");
		guardaComp = sort.getCompInsertion();
		guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		inverteVetor(vetor100000);
		long tempoInicialD100000 = System.currentTimeMillis();
		sort.insertionSort(vetor100000);
		long tempoFinalD100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100000 - tempoInicialD100000) + " ms, Comparações = "
				+ sort.getCompInsertion() + ", Movimentações = " + sort.getMoviInsertion() + ";\n}");
		guardaComp = sort.getCompInsertion();
		guardaMovi = sort.getMoviInsertion();
		sort.setCompInsertion(0);
		sort.setMoviInsertion(0);
		
		System.out.println("Tempo total de execução do método de ordenação Insertion Sort = " + (tempoFinalD100000 - tempoInicial100)
				+ " ms, Comparações totais = " + guardaComp + ", Movimentações totais = " + guardaMovi + ";\n====================="
				+ "=================================================:");
	}
	
	// Método que chama e executa o Quick Sort
	public static void sortQuick() {
		System.out.println("Execução do Método de Ordenação - Quick Sort:");
		int[] vetor100 = vetor100();
		long tempoInicial100 = System.currentTimeMillis();
		sort.quickSort(vetor100, 0, 99);
		long tempoFinal100 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100 - tempoInicial100) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";");
		long guardaComp = sort.getCompQuick();
		long guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		long tempoInicialO100 = System.currentTimeMillis();
		sort.quickSort(vetor100, 0, 99);
		long tempoFinalO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100 - tempoInicialO100) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";");
		guardaComp = sort.getCompQuick();
		guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		foraDeOrdem10(vetor100);
		long tempoInicialFO100 = System.currentTimeMillis();
		sort.quickSort(vetor100, 0, 99);
		long tempoFinalFO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100 - tempoInicialFO100) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";");
		guardaComp = sort.getCompQuick();
		guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		inverteVetor(vetor100);
		long tempoInicialD100 = System.currentTimeMillis();
		sort.quickSort(vetor100, 0, 99);
		long tempoFinalD100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100 - tempoInicialD100) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";\n}");
		guardaComp = sort.getCompQuick();
		guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		
		int[] vetor1000 = vetor1000();
		long tempoInicial1000 = System.currentTimeMillis();
		sort.quickSort(vetor1000, 0, 999);
		long tempoFinal1000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 1000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal1000 - tempoInicial1000) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";");
		guardaComp = sort.getCompQuick();
		guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		long tempoInicialO1000 = System.currentTimeMillis();
		sort.quickSort(vetor1000, 0, 999);
		long tempoFinalO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO1000 - tempoInicialO1000) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";");
		guardaComp = sort.getCompQuick();
		guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		foraDeOrdem10(vetor1000);
		long tempoInicialFO1000 = System.currentTimeMillis();
		sort.quickSort(vetor1000, 0, 999);
		long tempoFinalFO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO1000 - tempoInicialFO1000) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";");
		guardaComp = sort.getCompQuick();
		guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		inverteVetor(vetor1000);
		long tempoInicialD1000 = System.currentTimeMillis();
		sort.quickSort(vetor1000, 0, 999);
		long tempoFinalD1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD1000 - tempoInicialD1000) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";\n}");
		guardaComp = sort.getCompQuick();
		guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		
		int[] vetor10000 = vetor10000();
		long tempoInicial10000 = System.currentTimeMillis();
		sort.quickSort(vetor10000, 0, 9999);
		long tempoFinal10000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 10000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal10000 - tempoInicial10000) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";");
		guardaComp = sort.getCompQuick();
		guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		long tempoInicialO10000 = System.currentTimeMillis();
		sort.quickSort(vetor10000, 0, 9999);
		long tempoFinalO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO10000 - tempoInicialO10000) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";");
		guardaComp = sort.getCompQuick();
		guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		foraDeOrdem10(vetor10000);
		long tempoInicialFO10000 = System.currentTimeMillis();
		sort.quickSort(vetor10000, 0, 9999);
		long tempoFinalFO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO10000 - tempoInicialFO10000) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";");
		guardaComp = sort.getCompQuick();
		guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		inverteVetor(vetor10000);
		long tempoInicialD10000 = System.currentTimeMillis();
		sort.quickSort(vetor10000, 0, 9999);
		long tempoFinalD10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD10000 - tempoInicialD10000) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";\n}");
		guardaComp = sort.getCompQuick();
		guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		
		int[] vetor100000 = vetor100000();
		long tempoInicial100000 = System.currentTimeMillis();
		sort.quickSort(vetor100000, 0, 99999);
		long tempoFinal100000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100000 - tempoInicial100000) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";");
		guardaComp = sort.getCompQuick();
		guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		long tempoInicialO100000 = System.currentTimeMillis();
		sort.quickSort(vetor100000, 0, 99999);
		long tempoFinalO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100000 - tempoInicialO100000) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";");
		guardaComp = sort.getCompQuick();
		guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		foraDeOrdem10(vetor100000);
		long tempoInicialFO100000 = System.currentTimeMillis();
		sort.quickSort(vetor100000, 0, 99999);
		long tempoFinalFO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100000 - tempoInicialFO100000) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";");
		guardaComp = sort.getCompQuick();
		guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		inverteVetor(vetor100000);
		long tempoInicialD100000 = System.currentTimeMillis();
		sort.quickSort(vetor100000, 0, 99999);
		long tempoFinalD100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100000 - tempoInicialD100000) + " ms, Comparações = "
				+ sort.getCompQuick() + ", Movimentações = " + sort.getMoviQuick() + ";\n}");
		guardaComp = sort.getCompQuick();
		guardaMovi = sort.getMoviQuick();
		sort.setCompQuick(0);
		sort.setMoviQuick(0);
		
		System.out.println("Tempo total de execução do método de ordenação Quick Sort = " + (tempoFinalD100000 - tempoInicial100)
				+ " ms, Comparações totais = " + guardaComp + ", Movimentações totais = " + guardaMovi + ";\n====================="
				+ "=================================================:");
	}
	
	// Método que chama e executa o Heap Sort
	public static void sortHeap() {
		System.out.println("Execução do Método de Ordenação - Heap Sort:");
		Integer[] vetor100 = vetorInteger100();
		long tempoInicial100 = System.currentTimeMillis();
		sort.heapSort(vetor100);
		long tempoFinal100 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100 (Integer) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100 - tempoInicial100) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		long guardaComp = sort.getCompHeap();
		long guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		long tempoInicialO100 = System.currentTimeMillis();
		sort.heapSort(vetor100);
		long tempoFinalO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100 - tempoInicialO100) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		foraDeOrdemInteger10(vetor100);
		long tempoInicialFO100 = System.currentTimeMillis();
		sort.heapSort(vetor100);
		long tempoFinalFO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100 - tempoInicialFO100) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		inverteVetorInteger(vetor100);
		long tempoInicialD100 = System.currentTimeMillis();
		sort.heapSort(vetor100);
		long tempoFinalD100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100 - tempoInicialD100) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";\n}");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		
		Integer[] vetor1000 = vetorInteger1000();
		long tempoInicial1000 = System.currentTimeMillis();
		sort.heapSort(vetor1000);
		long tempoFinal1000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 1000 (Integer) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal1000 - tempoInicial1000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		long tempoInicialO1000 = System.currentTimeMillis();
		sort.heapSort(vetor1000);
		long tempoFinalO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO1000 - tempoInicialO1000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		foraDeOrdemInteger10(vetor1000);
		long tempoInicialFO1000 = System.currentTimeMillis();
		sort.heapSort(vetor1000);
		long tempoFinalFO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO1000 - tempoInicialFO1000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		inverteVetorInteger(vetor1000);
		long tempoInicialD1000 = System.currentTimeMillis();
		sort.heapSort(vetor1000);
		long tempoFinalD1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD1000 - tempoInicialD1000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";\n}");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		
		Integer[] vetor10000 = vetorInteger10000();
		long tempoInicial10000 = System.currentTimeMillis();
		sort.heapSort(vetor10000);
		long tempoFinal10000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 10000 (Integer) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal10000 - tempoInicial10000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		long tempoInicialO10000 = System.currentTimeMillis();
		sort.heapSort(vetor10000);
		long tempoFinalO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO10000 - tempoInicialO10000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		foraDeOrdemInteger10(vetor10000);
		long tempoInicialFO10000 = System.currentTimeMillis();
		sort.heapSort(vetor10000);
		long tempoFinalFO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO10000 - tempoInicialFO10000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		inverteVetorInteger(vetor10000);
		long tempoInicialD10000 = System.currentTimeMillis();
		sort.heapSort(vetor10000);
		long tempoFinalD10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD10000 - tempoInicialD10000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";\n}");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		
		Integer[] vetor100000 = vetorInteger100000();
		long tempoInicial100000 = System.currentTimeMillis();
		sort.heapSort(vetor100000);
		long tempoFinal100000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100000 (Integer) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100000 - tempoInicial100000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		long tempoInicialO100000 = System.currentTimeMillis();
		sort.heapSort(vetor100000);
		long tempoFinalO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100000 - tempoInicialO100000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		foraDeOrdemInteger10(vetor100000);
		long tempoInicialFO100000 = System.currentTimeMillis();
		sort.heapSort(vetor100000);
		long tempoFinalFO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100000 - tempoInicialFO100000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		inverteVetorInteger(vetor100000);
		long tempoInicialD100000 = System.currentTimeMillis();
		sort.heapSort(vetor100000);
		long tempoFinalD100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100000 - tempoInicialD100000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";\n}");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		
		System.out.println("Tempo total de execução do método de ordenação Heap Sort = " + (tempoFinalD100000 - tempoInicial100)
				+ " ms, Comparações totais = " + guardaComp + ", Movimentações totais = " + guardaMovi + ";\n====================="
				+ "=================================================:");
	}
	
	// Método que chama e executa o Merge Sort
	public static void sortMerge() {
		System.out.println("Execução do Método de Ordenação - Merge Sort:");
		int[] vetor100 = vetor100();
		long tempoInicial100 = System.currentTimeMillis();
		sort.mergeSort(vetor100, 0, 99);
		long tempoFinal100 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100 - tempoInicial100) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";");
		long guardaComp = sort.getCompMerge();
		long guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		long tempoInicialO100 = System.currentTimeMillis();
		sort.mergeSort(vetor100, 0, 99);
		long tempoFinalO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100 - tempoInicialO100) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";");
		guardaComp = sort.getCompMerge();
		guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		foraDeOrdem10(vetor100);
		long tempoInicialFO100 = System.currentTimeMillis();
		sort.mergeSort(vetor100, 0, 99);
		long tempoFinalFO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100 - tempoInicialFO100) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";");
		guardaComp = sort.getCompMerge();
		guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		inverteVetor(vetor100);
		long tempoInicialD100 = System.currentTimeMillis();
		sort.mergeSort(vetor100, 0, 99);
		long tempoFinalD100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100 - tempoInicialD100) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";\n}");
		guardaComp = sort.getCompMerge();
		guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		
		int[] vetor1000 = vetor1000();
		long tempoInicial1000 = System.currentTimeMillis();
		sort.mergeSort(vetor1000, 0, 999);
		long tempoFinal1000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 1000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal1000 - tempoInicial1000) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";");
		guardaComp = sort.getCompMerge();
		guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		long tempoInicialO1000 = System.currentTimeMillis();
		sort.mergeSort(vetor1000, 0, 999);
		long tempoFinalO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO1000 - tempoInicialO1000) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";");
		guardaComp = sort.getCompMerge();
		guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		foraDeOrdem10(vetor1000);
		long tempoInicialFO1000 = System.currentTimeMillis();
		sort.mergeSort(vetor1000, 0, 999);
		long tempoFinalFO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO1000 - tempoInicialFO1000) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";");
		guardaComp = sort.getCompMerge();
		guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		inverteVetor(vetor1000);
		long tempoInicialD1000 = System.currentTimeMillis();
		sort.mergeSort(vetor1000, 0, 999);
		long tempoFinalD1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD1000 - tempoInicialD1000) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";\n}");
		guardaComp = sort.getCompMerge();
		guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		
		int[] vetor10000 = vetor10000();
		long tempoInicial10000 = System.currentTimeMillis();
		sort.mergeSort(vetor10000, 0, 9999);
		long tempoFinal10000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 10000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal10000 - tempoInicial10000) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";");
		guardaComp = sort.getCompMerge();
		guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		long tempoInicialO10000 = System.currentTimeMillis();
		sort.mergeSort(vetor10000, 0, 9999);
		long tempoFinalO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO10000 - tempoInicialO10000) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";");
		guardaComp = sort.getCompMerge();
		guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		foraDeOrdem10(vetor10000);
		long tempoInicialFO10000 = System.currentTimeMillis();
		sort.mergeSort(vetor10000, 0, 9999);
		long tempoFinalFO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO10000 - tempoInicialFO10000) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";");
		guardaComp = sort.getCompMerge();
		guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		inverteVetor(vetor10000);
		long tempoInicialD10000 = System.currentTimeMillis();
		sort.mergeSort(vetor10000, 0, 9999);
		long tempoFinalD10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD10000 - tempoInicialD10000) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";\n}");
		guardaComp = sort.getCompMerge();
		guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		
		int[] vetor100000 = vetor100000();
		long tempoInicial100000 = System.currentTimeMillis();
		sort.mergeSort(vetor100000, 0, 99999);
		long tempoFinal100000 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100000 (int) {\n\tTempo de ordenação com vetor desordenado (aleatório) = " + (tempoFinal100000 - tempoInicial100000) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";");
		guardaComp = sort.getCompMerge();
		guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		long tempoInicialO100000 = System.currentTimeMillis();
		sort.mergeSort(vetor100000, 0, 99999);
		long tempoFinalO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100000 - tempoInicialO100000) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";");
		guardaComp = sort.getCompMerge();
		guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		foraDeOrdem10(vetor100000);
		long tempoInicialFO100000 = System.currentTimeMillis();
		sort.mergeSort(vetor100000, 0, 99999);
		long tempoFinalFO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = " + (tempoFinalFO100000 - tempoInicialFO100000) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";");
		guardaComp = sort.getCompMerge();
		guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		inverteVetor(vetor100000);
		long tempoInicialD100000 = System.currentTimeMillis();
		sort.mergeSort(vetor100000, 0, 99999);
		long tempoFinalD100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = " + (tempoFinalD100000 - tempoInicialD100000) + " ms, Comparações = "
				+ sort.getCompMerge() + ", Movimentações = " + sort.getMoviMerge() + ";\n}");
		guardaComp = sort.getCompMerge();
		guardaMovi = sort.getMoviMerge();
		sort.setCompMerge(0);
		sort.setMoviMerge(0);
		
		System.out.println("Tempo total de execução do método de ordenação Merge Sort = " + (tempoFinalD100000 - tempoInicial100)
				+ " ms, Comparações totais = " + guardaComp + ", Movimentações totais = " + guardaMovi + ";\n====================="
				+ "=================================================:");
	}
}
