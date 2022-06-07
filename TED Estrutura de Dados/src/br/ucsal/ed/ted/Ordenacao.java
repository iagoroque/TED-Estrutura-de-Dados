package br.ucsal.ed.ted;

public class Ordenacao {

	public void bubbleSort(int[] vetor) {
		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
				}
			}
		}
	}

	public void selectionSort(int[] array) {
		for (int fixo = 0; fixo < array.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < array.length; i++) {
				if (array[i] < array[menor]) {
					menor = i;
				}
			}
			if (menor != fixo) {
				int t = array[fixo];
				array[fixo] = array[menor];
				array[menor] = t;
			}
		}
	}

	public void insertionSort(int[] vetor) {
		int j;
		int key;
		int i;

		for (j = 1; j < vetor.length; j++) {
			key = vetor[j];
			for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
				vetor[i + 1] = vetor[i];
			}
			vetor[i + 1] = key;
		}
	}

	public void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);
		}
	}

	private int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1, f = fim;
		while (i <= f) {
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[f])
				f--;
			else {
				int troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				i++;
				f--;
			}
		}
		vetor[inicio] = vetor[f];
		vetor[f] = pivo;
		return f;
	}

	public void heapSort(Comparable[] a) {
		for (int i = a.length / 2; i >= 0; i--) /* buildHeap */
			percDown(a, i, a.length);
		for (int i = a.length - 1; i > 0; i--) {
			swapReferences(a, 0, i); /* deleteMax */
			percDown(a, 0, i);
		}
	}

	private int leftChild(int i) {
		return 2 * i + 1;
	}

	private void percDown(Comparable[] a, int i, int n) {
		int child;
		Comparable tmp;

		for (tmp = a[i]; leftChild(i) < n; i = child) {
			child = leftChild(i);
			if (child != n - 1 && a[child].compareTo(a[child + 1]) < 0)
				child++;
			if (tmp.compareTo(a[child]) < 0)
				a[i] = a[child];
			else
				break;
		}
		a[i] = tmp;
	}

	public static final void swapReferences(Object[] a, int index1, int index2) {
		Object tmp = a[index1];
		a[index1] = a[index2];
		a[index2] = tmp;
	}

	public void mergeSort(int[] x, int inicio, int fim) {
		int meio;
		if (inicio < fim) {
			meio = (inicio + fim) / 2;
			mergeSort(x, inicio, meio);
			mergeSort(x, meio + 1, fim);
			intercala(x, inicio, meio, fim);
		}
	}

	private void intercala(int[] vetor, int inicio, int meio, int fim) {
		int novoVetor[] = new int[fim - inicio];
		int i = inicio;
		int m = meio;
		int pos = 0;

		while (i < meio && m < fim) {
			if (vetor[i] <= vetor[m]) {
				novoVetor[pos] = vetor[i];
				pos = pos + 1;
				i = i + 1;
			} else {
				novoVetor[pos] = vetor[m];
				pos = pos + 1;
				m = m + 1;
			}
		}

		while (i < meio) {
			novoVetor[pos] = vetor[i];
			pos = pos + 1;
			i = i + 1;
		}

		while (m < fim) {
			novoVetor[pos] = vetor[m];
			pos = pos + 1;
			m = m + 1;
		}

		for (pos = 0, i = inicio; i < fim; i++, pos++) {
			vetor[i] = novoVetor[pos];
		}
	}
}
