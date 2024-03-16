/**
 * 
 */
package view;

import controller.BubbleSort;
import controller.MergeSort;
import controller.QuickSort;

/**
 * @author Lucas Batista 16 de mar. de 2024
 */
public class Main {

	public static void main(String[] args) {
		int[] vet = new int[1500];
		int tamanho = vet.length;
		
		BubbleSort bubbleSort = new BubbleSort();	
		MergeSort mergeSort = new MergeSort();	
		QuickSort quickSort = new QuickSort();
		
		for (int i = 0; i < tamanho; i++) {
			vet[i] = (int) (Math.random() * 100) + 1;
		}

		System.out.print("Vetor = ");
		for (int i : vet) {
			System.out.print(i + " ");
		}
		System.out.println();

		double tempoInicial = System.nanoTime();

		bubbleSort.ordenaBubbleSort(vet, tamanho);	//BubbleSort
			
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.println("BubbleSort = " + tempoTotal + " seg.");

		tempoInicial = System.nanoTime();

		mergeSort.ordenaMergeSort(vet, 0, tamanho - 1);	//MergeSort

		tempoFinal = System.nanoTime();
		tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.println("MergeSort = " + tempoTotal + " seg.");

		tempoInicial = System.nanoTime();

		quickSort.ordenaQuickSort(vet, 0, tamanho - 1); //QuickSort

		tempoFinal = System.nanoTime();
		tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.println("QuickSort = " + tempoTotal + " seg.");

	}

}
