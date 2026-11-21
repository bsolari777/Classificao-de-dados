public class ShakeSort {

    public static void ordenar(int[] vetor) {
        int inicio = 0;
        int fim = vetor.length - 1;
        boolean trocou = true;

        while (trocou) {
            trocou = false;

            // Vai da esquerda para a direita
            for (int i = inicio; i < fim; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    trocou = true;
                }
            }

            if (!trocou) {
                break;
            }

            fim--;
            trocou = false;

            // Volta da direita para a esquerda
            for (int i = fim; i > inicio; i--) {
                if (vetor[i] < vetor[i - 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = aux;
                    trocou = true;
                }
            }

            inicio++;
        }
    }
}
