package view;

import br.edu.fateczl.sort.Ordenacao;

public class Main {
    public static void main(String[] args) {
        Ordenacao ordenacao = new Ordenacao();
        int[] vetor1 = new int[1500];
        for (int i = 0; i < vetor1.length; i++){
            vetor1[i] = 1499 - i;
        }
        int[] vetor2 = vetor1.clone();
        int[] vetor3 = vetor1.clone();

        long inicioBubble = System.nanoTime();
        ordenacao.bubbleSort(vetor1);
        long fimBubble = System.nanoTime();

        long inicioMerge = System.nanoTime();
        ordenacao.mergeSort(vetor2, 0, vetor2.length - 1);
        long fimMerge = System.nanoTime();

        long inicioQuick = System.nanoTime();
        ordenacao.quickSort(vetor3, 0, vetor3.length - 1);
        long fimQuick = System.nanoTime();

        System.out.println("Tempo de ordenação do vetor: \nBubble Sort: " + (fimBubble - inicioBubble) / 1000000.0 + " ms (" + (fimBubble - inicioBubble) / 1000000000.0 + " s).");
        System.out.println("\nMerge Sort: " + (fimMerge - inicioMerge) / 1000000.0 + " ms (" + (fimMerge - inicioMerge) / 1000000000.0 + " s).");
        System.out.println("\nQuick Sort: " + (fimQuick - inicioQuick) / 1000000.0 + " ms (" + (fimQuick - inicioQuick) / 1000000000.0 + " s).");
    }
}
