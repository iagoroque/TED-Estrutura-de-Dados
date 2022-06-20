package br.ucsal.ed.ted;

import br.ucsal.ed.ted.tui.*;

public class Main {

	// Ordenadores
	static Sort sort = new Sort();

	// TUI dos ordenadores
	static BubbleSort bubble = new BubbleSort();
	static HeapSort heap = new HeapSort();
	static InsertionSort insertion = new InsertionSort();
	static MergeSort merge = new MergeSort();
	static QuickSort quick = new QuickSort();
	static SelectionSort selection = new SelectionSort();

	public static void main(String[] args) {
		System.out.println("\t\t\t\t§---< ALGORITMOS DE ORDENAÇÃO >---§\nDevs -===- Harrion Borges - Iago Roque"
				+ " - Kevin Vasques - Lucas Farias - Marcos Pacheco - Oseias Lopes -===- Devs\n"
				+ "======================================================================:");
		long tempoInicial = System.currentTimeMillis();
		// Execuções - Médias de tempo por 10 execuções *variam por máquina*:
		bubble.start(); 	// Média: 27156ms;
		selection.start(); 	// Média: 16566ms;
		insertion.start();	// Média: 2602ms;
		quick.start(); 		// Média: 16393ms; 
		heap.start();		// Média: 168ms;
		merge.start();		// Média: 73ms;
		long tempoFinal = System.currentTimeMillis();
		System.out.println("Tempo total de execução do programa e de todos os métodos de ordenação = " + (tempoFinal - tempoInicial)
				+ " ms;\n======================================================================:" + "\nTrabalho de Estudo Dirigido "
				+ "(TED) - Estrutura de Dados, BES, UCSal, Salvador, 2022.");
	}
	
	/*
	 * Olá, professor, amiguinhos, aqui, com uns adendos, abaixo:
	 * 1 - Os métodos foram bem comentados para melhor compreensão;
	 * 2 - O programa demora em média 1 minuto para ser executado, então caso o console pare de imprimir
	 * algo por um tempo achando que acabou, continue aguardando até executar o último sysout (o da linha 29);
	 * 3 - QuickSort tende ao StackOverflow, por falta de memória, porém o código está funcionando.
	 * 4 - Para corrigir o erro do QuickSort: é só aumentar a memória (para fazer isso no Eclipse IDE é só ir
	 * em "Run Configuration" e colocar o comando "-Xss256m" em "VM Arguments");
	 * 5 - Seriam mais de 1.333.200 números para imprimir, mas pode testá-los em TUI com o "generate.print(vetor)";
	 * 6 - Em TUI (Text User Interface), não tem muita lógica, só a impressão delas;
	 */
	
}
