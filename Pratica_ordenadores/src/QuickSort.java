public class QuickSort {

    public static void ordenar(int[] vetor) {
        quickSort(vetor, 0, vetor.length - 1);
    }

    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicao = particiona(vetor, inicio, fim);
            quickSort(vetor, inicio, posicao - 1);
            quickSort(vetor, posicao + 1, fim);
        }
    }

    private static int particiona(int[] vetor, int inicio, int fim) {
        int meio = (inicio + fim) / 2;

        // Deixa o valor do meio como a mediana dos tres
        if (vetor[inicio] > vetor[meio]) {
            trocar(vetor, inicio, meio);
        }
        if (vetor[inicio] > vetor[fim]) {
            trocar(vetor, inicio, fim);
        }
        if (vetor[meio] > vetor[fim]) {
            trocar(vetor, meio, fim);
        }

        trocar(vetor, meio, fim);
        int pivo = vetor[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivo) {
                i++;
                trocar(vetor, i, j);
            }
        }

        trocar(vetor, i + 1, fim);
        return i + 1;
    }

    private static void trocar(int[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
}
