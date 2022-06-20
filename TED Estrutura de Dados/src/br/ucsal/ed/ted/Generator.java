package br.ucsal.ed.ted;

// Classe geradora de vetores aleatórios, desordenados:
public class Generator {

	public int[] array100() {
		int quantidade = 100;
		int[] array = new int[quantidade];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * quantidade);
		}
		return array;
	}

	public int[] array1000() {
		int quantidade = 1000;
		int[] array = new int[quantidade];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * quantidade);
		}
		return array;
	}

	public int[] array10000() {
		int quantidade = 10000;
		int[] array = new int[quantidade];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * quantidade);
		}
		return array;
	}

	public int[] array100000() {
		int quantidade = 100000;
		int[] array = new int[quantidade];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * quantidade);
		}
		return array;
	}

	// Métodos geradores de vetores desordenados do tipo Integer - exclusivo para Heap Sort:
	public Integer[] arrayInteger100() {
		int quantidade = 100;
		Integer[] array = new Integer[quantidade];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * quantidade);
		}
		return array;
	}

	public Integer[] arrayInteger1000() {
		int quantidade = 1000;
		Integer[] array = new Integer[quantidade];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * quantidade);
		}
		return array;
	}

	public Integer[] arrayInteger10000() {
		int quantidade = 10000;
		Integer[] array = new Integer[quantidade];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * quantidade);
		}
		return array;
	}

	public Integer[] arrayInteger100000() {
		int quantidade = 100000;
		Integer[] array = new Integer[quantidade];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * quantidade);
		}
		return array;
	}

	// Método para imprimir vetores:
	public void print(int[] vetor) {
		for (int i : vetor) {
			System.out.print(i + " - ");
		}
	}
}
