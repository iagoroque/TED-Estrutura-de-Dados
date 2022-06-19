package br.ucsal.ed.ted;

public class Ordenacao {

	// Atributos que armazenam o número de comparações e movimentações efetuados por cada método
	private long compBubble = 0, moviBubble = 0;
	private long compSelection = 0, moviSelection = 0;
	private long compInsertion = 0, moviInsertion = 0;
	private long compQuick = 0, moviQuick = 0;
	private long compHeap = 0, moviHeap = 0;
	private long compMerge = 0, moviMerge = 0;

	// Métodos de Ordenação
	public void bubbleSort(int[] vetor) {
		boolean troca = true;
		int aux;
		while (troca) {
			troca = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				compBubble++;
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					troca = true;
					moviBubble++;
				}
			}
		}
	}

	public void selectionSort(int[] vetor) {
		for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
			int menor = fixo;
			moviSelection++;
			for (int i = menor + 1; i < vetor.length; i++) {
				compSelection++;
				if (vetor[i] < vetor[menor]) {
					menor = i;
					moviSelection++;
				}
			}
			compSelection++;
			if (menor != fixo) {
				int t = vetor[fixo];
				vetor[fixo] = vetor[menor];
				vetor[menor] = t;
				moviSelection++;
			}
		}
	}

	public void insertionSort(int[] vetor) {
		int j;
		int key;
		int i;
		for (j = 1; j < vetor.length; j++) {
			compInsertion++;
			key = vetor[j];
			for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
				compInsertion++;
				vetor[i + 1] = vetor[i];
				moviInsertion++;
			}
			vetor[i + 1] = key;
			moviInsertion++;
		}
	}

	public void quickSort(int[] vetor, int inicio, int fim) {
		compQuick++;
		if (inicio < fim) {
			int posicaoPivo = separar(vetor, inicio, fim);
			quickSort(vetor, inicio, posicaoPivo - 1);
			quickSort(vetor, posicaoPivo + 1, fim);
		}
	}

	// Método auxiliar do quickSort()
	private int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		moviQuick++;
		int i = inicio + 1, f = fim;
		moviQuick++;
		compQuick++;
		while (i <= f) {
			compQuick++;
			if (vetor[i] <= pivo) {
				i++;
				compQuick++;
			} else if (pivo < vetor[f]) {
				f--;
			} else {
				int troca = vetor[i];
				moviQuick++;
				vetor[i] = vetor[f];
				moviQuick++;
				vetor[f] = troca;
				moviQuick++;
				i++;
				f--;
			}
		}
		vetor[inicio] = vetor[f];
		moviQuick++;
		vetor[f] = pivo;
		moviQuick++;
		return f;
	}

	public void heapSort(Comparable[] a) {
		compHeap++;
		for (int i = a.length / 2; i >= 0; i--) {
			percDown(a, i, a.length);
		}
		compHeap++;
		for (int i = a.length - 1; i > 0; i--) {
			swapReferences(a, 0, i);
			percDown(a, 0, i);
		}
	}

	// Método auxiliar do heapSort()
	private int leftChild(int i) {
		moviHeap++;
		return 2 * i + 1;
	}

	// Método auxiliar do heapSort()
	private void percDown(Comparable[] a, int i, int n) {
		int child;
		Comparable tmp;
		compHeap++;
		for (tmp = a[i]; leftChild(i) < n; i = child) {
			child = leftChild(i);
			compHeap++;
			if (child != n - 1 && a[child].compareTo(a[child + 1]) < 0) {
				child++;
			}
			compHeap++;
			if (tmp.compareTo(a[child]) < 0) {
				a[i] = a[child];
			} else {
				break;
			}
		}
		moviHeap++;
		a[i] = tmp;
	}

	// Método auxiliar do heapSort()
	private void swapReferences(Object[] a, int index1, int index2) {
		moviHeap++;
		Object tmp = a[index1];
		moviHeap++;
		a[index1] = a[index2];
		moviHeap++;
		a[index2] = tmp;
	}

	public void mergeSort(int[] x, int inicio, int fim) {
		int meio;
		compMerge++;
		if (inicio < fim) {
			moviMerge++;
			meio = (inicio + fim) / 2;
			mergeSort(x, inicio, meio);
			mergeSort(x, meio + 1, fim);
			intercala(x, inicio, meio, fim);
		}
	}

	// Método auxiliar do mergeSort()
	private void intercala(int[] vetor, int inicio, int meio, int fim) {
		int novoVetor[] = new int[fim - inicio];
		int i = inicio;
		int m = meio;
		int pos = 0;
		compMerge++;
		while (i < meio && m < fim) {
			compMerge++;
			if (vetor[i] <= vetor[m]) {
				moviMerge++;
				novoVetor[pos] = vetor[i];
				moviMerge++;
				pos = pos + 1;
				moviMerge++;
				i = i + 1;
			} else {
				moviMerge++;
				novoVetor[pos] = vetor[m];
				moviMerge++;
				pos = pos + 1;
				moviMerge++;
				m = m + 1;
			}
		}
		compMerge++;
		while (i < meio) {
			moviMerge++;
			novoVetor[pos] = vetor[i];
			moviMerge++;
			pos = pos + 1;
			moviMerge++;
			i = i + 1;
		}
		compMerge++;
		while (m < fim) {
			moviMerge++;
			novoVetor[pos] = vetor[m];
			moviMerge++;
			pos = pos + 1;
			moviMerge++;
			m = m + 1;
		}
		compMerge++;
		for (pos = 0, i = inicio; i < fim; i++, pos++) {
			moviMerge++;
			vetor[i] = novoVetor[pos];
		}
	}

	// Métodos getters e setters para obter os valores das comparações e movimentações
	public long getCompBubble() {
		return compBubble;
	}

	public void setCompBubble(long compBubble) {
		this.compBubble = compBubble;
	}

	public long getMoviBubble() {
		return moviBubble;
	}

	public void setMoviBubble(long moviBubble) {
		this.moviBubble = moviBubble;
	}

	public long getCompSelection() {
		return compSelection;
	}

	public void setCompSelection(long compSelection) {
		this.compSelection = compSelection;
	}

	public long getMoviSelection() {
		return moviSelection;
	}

	public void setMoviSelection(long moviSelection) {
		this.moviSelection = moviSelection;
	}

	public long getCompInsertion() {
		return compInsertion;
	}

	public void setCompInsertion(long compInsertion) {
		this.compInsertion = compInsertion;
	}

	public long getMoviInsertion() {
		return moviInsertion;
	}

	public void setMoviInsertion(long moviInsertion) {
		this.moviInsertion = moviInsertion;
	}

	public long getCompQuick() {
		return compQuick;
	}

	public void setCompQuick(long compQuick) {
		this.compQuick = compQuick;
	}

	public long getMoviQuick() {
		return moviQuick;
	}

	public void setMoviQuick(long moviQuick) {
		this.moviQuick = moviQuick;
	}

	public long getCompHeap() {
		return compHeap;
	}

	public void setCompHeap(long compHeap) {
		this.compHeap = compHeap;
	}

	public long getMoviHeap() {
		return moviHeap;
	}

	public void setMoviHeap(long moviHeap) {
		this.moviHeap = moviHeap;
	}

	public long getCompMerge() {
		return compMerge;
	}

	public void setCompMerge(long compMerge) {
		this.compMerge = compMerge;
	}

	public long getMoviMerge() {
		return moviMerge;
	}

	public void setMoviMerge(long moviMerge) {
		this.moviMerge = moviMerge;
	}

}
