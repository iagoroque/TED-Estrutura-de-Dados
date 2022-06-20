package br.ucsal.ed.ted.tui;

import br.ucsal.ed.ted.Generator;
import br.ucsal.ed.ted.Sort;

public class HeapSort {

	Sort sort = new Sort();
	Generator generate = new Generator();

	public void start() {
		System.out.println("Execução do Método de Ordenação - Heap Sort:");
		Integer[] vetor100 = generate.arrayInteger100();
		long tempoInicial100 = System.currentTimeMillis();
		sort.heapSort(vetor100);
		long tempoFinal100 = System.currentTimeMillis();
		System.out.println("Vetor de tamanho 100 (Integer) {\n\tTempo de ordenação com vetor desordenado (aleatório) = "
				+ (tempoFinal100 - tempoInicial100) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		long guardaComp = sort.getCompHeap();
		long guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		long tempoInicialO100 = System.currentTimeMillis();
		sort.heapSort(vetor100);
		long tempoFinalO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100 - tempoInicialO100)
				+ " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		sort.aTenthInteger(vetor100);
		long tempoInicialFO100 = System.currentTimeMillis();
		sort.heapSort(vetor100);
		long tempoFinalFO100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = "
				+ (tempoFinalFO100 - tempoInicialFO100) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		sort.reverseInteger(vetor100);
		long tempoInicialD100 = System.currentTimeMillis();
		sort.heapSort(vetor100);
		long tempoFinalD100 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = "
				+ (tempoFinalD100 - tempoInicialD100) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";\n}");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);

		Integer[] vetor1000 = generate.arrayInteger1000();
		long tempoInicial1000 = System.currentTimeMillis();
		sort.heapSort(vetor1000);
		long tempoFinal1000 = System.currentTimeMillis();
		System.out
				.println("Vetor de tamanho 1000 (Integer) {\n\tTempo de ordenação com vetor desordenado (aleatório) = "
						+ (tempoFinal1000 - tempoInicial1000) + " ms, Comparações = "
						+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		long tempoInicialO1000 = System.currentTimeMillis();
		sort.heapSort(vetor1000);
		long tempoFinalO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO1000 - tempoInicialO1000)
				+ " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		sort.aTenthInteger(vetor1000);
		long tempoInicialFO1000 = System.currentTimeMillis();
		sort.heapSort(vetor1000);
		long tempoFinalFO1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = "
				+ (tempoFinalFO1000 - tempoInicialFO1000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		sort.reverseInteger(vetor1000);
		long tempoInicialD1000 = System.currentTimeMillis();
		sort.heapSort(vetor1000);
		long tempoFinalD1000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = "
				+ (tempoFinalD1000 - tempoInicialD1000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";\n}");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);

		Integer[] vetor10000 = generate.arrayInteger10000();
		long tempoInicial10000 = System.currentTimeMillis();
		sort.heapSort(vetor10000);
		long tempoFinal10000 = System.currentTimeMillis();
		System.out
				.println("Vetor de tamanho 10000 (Integer) {\n\tTempo de ordenação com vetor desordenado (aleatório) = "
						+ (tempoFinal10000 - tempoInicial10000) + " ms, Comparações = "
						+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		long tempoInicialO10000 = System.currentTimeMillis();
		sort.heapSort(vetor10000);
		long tempoFinalO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO10000 - tempoInicialO10000)
				+ " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		sort.aTenthInteger(vetor10000);
		long tempoInicialFO10000 = System.currentTimeMillis();
		sort.heapSort(vetor10000);
		long tempoFinalFO10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = "
				+ (tempoFinalFO10000 - tempoInicialFO10000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		sort.reverseInteger(vetor10000);
		long tempoInicialD10000 = System.currentTimeMillis();
		sort.heapSort(vetor10000);
		long tempoFinalD10000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = "
				+ (tempoFinalD10000 - tempoInicialD10000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";\n}");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);

		Integer[] vetor100000 = generate.arrayInteger100000();
		long tempoInicial100000 = System.currentTimeMillis();
		sort.heapSort(vetor100000);
		long tempoFinal100000 = System.currentTimeMillis();
		System.out.println(
				"Vetor de tamanho 100000 (Integer) {\n\tTempo de ordenação com vetor desordenado (aleatório) = "
						+ (tempoFinal100000 - tempoInicial100000) + " ms, Comparações = "
						+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		long tempoInicialO100000 = System.currentTimeMillis();
		sort.heapSort(vetor100000);
		long tempoFinalO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor já ordenado = " + (tempoFinalO100000 - tempoInicialO100000)
				+ " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		sort.aTenthInteger(vetor100000);
		long tempoInicialFO100000 = System.currentTimeMillis();
		sort.heapSort(vetor100000);
		long tempoFinalFO100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor quase ordenado (10% fora de ordem) = "
				+ (tempoFinalFO100000 - tempoInicialFO100000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);
		sort.reverseInteger(vetor100000);
		long tempoInicialD100000 = System.currentTimeMillis();
		sort.heapSort(vetor100000);
		long tempoFinalD100000 = System.currentTimeMillis();
		System.out.println("\tTempo de ordenação com vetor inversamente ordenado = "
				+ (tempoFinalD100000 - tempoInicialD100000) + " ms, Comparações = "
				+ sort.getCompHeap() + ", Movimentações = " + sort.getMoviHeap() + ";\n}");
		guardaComp = sort.getCompHeap();
		guardaMovi = sort.getMoviHeap();
		sort.setCompHeap(0);
		sort.setMoviHeap(0);

		System.out.println(
				"Tempo total de execução do método de ordenação Heap Sort = " + (tempoFinalD100000 - tempoInicial100)
						+ " ms, Comparações totais = " + guardaComp + ", Movimentações totais = " + guardaMovi
						+ ";\n====================="
						+ "=================================================:");
	}
}
