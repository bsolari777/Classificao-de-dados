public class HeapSort {

    public static void ordenar(int[] vetor) {
        int tamanho = vetor.length;

        // Monta o heap
        for (int i = tamanho / 2 - 1; i >= 0; i--) {
            maximizaHeap(vetor, tamanho, i);
        }

        // Coloca o maior numero no final
        for (int i = tamanho - 1; i > 0; i--) {
            trocar(vetor, 0, i);
            maximizaHeap(vetor, i, 0);
        }
    }

    private static void maximizaHeap(int[] vetor, int tamanho, int i) {
        while (true) {
            int maior = i;
            int esquerda = 2 * i + 1;
            int direita = 2 * i + 2;

            if (esquerda < tamanho && vetor[esquerda] > vetor[maior]) {
                maior = esquerda;
            }

            if (direita < tamanho && vetor[direita] > vetor[maior]) {
                maior = direita;
            }

            if (maior == i) {
                break;
            }

            trocar(vetor, i, maior);
            i = maior;
        }
    }

    private static void trocar(int[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
}
