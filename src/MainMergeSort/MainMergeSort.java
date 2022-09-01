package MainMergeSort;

import java.util.Arrays;

import ControllerMergeSort.ControllerMergeSort;

public class MainMergeSort {

	public static void main(String[] args) {
		ControllerMergeSort controllerMergeSort = new ControllerMergeSort();
		
		int vetor [] = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		int auxiliar [] = new int [vetor.length];
		controllerMergeSort.mergeSort (vetor, auxiliar, 0, vetor.length-1);
	
		System.out.println(Arrays.toString(vetor));
	}

}
