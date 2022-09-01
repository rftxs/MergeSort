package ControllerMergeSort;

public class ControllerMergeSort {
	public ControllerMergeSort(){
		super();
	}
	
	public void mergeSort (int[] vetor, int [] auxiliar, int inicio, int fim) {
		
			
		if (inicio < fim) {
			
			int meio = (inicio+fim)/2;
			mergeSort (vetor, auxiliar, inicio, meio);
			mergeSort (vetor, auxiliar, meio+1,fim);
			intercalar (vetor, auxiliar, inicio, meio, fim);
		
		}
		
		
	}

	private void intercalar(int[] vetor, int[] auxiliar, int inicio, int meio, int fim) {
		for (int i = inicio; i <= fim; i++) {
			auxiliar [i] = vetor [i];
			
		}
		
		int esq = inicio;
		int dir = meio+1;
		
		for (int i = inicio; i <= fim; i++) {
			if (esq > meio) {
				vetor [i] = auxiliar [dir++];
			}
			
			else if (dir > fim) {
				vetor [i] = auxiliar [esq++];
			}
			
			else if (auxiliar[esq] < auxiliar [dir]) {
				vetor [i] = auxiliar [esq++];
				
			}
			
			else {
				vetor [i] = auxiliar [dir++];
				
			}
			
		}
		
		
		
	}
	
	

}
