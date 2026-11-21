import java.util.ArrayList;
import java.util.LinkedList;

public class BucketSort {

    public static void ordenar(int[] vetor) {
        int n = vetor.length;
        if (n == 0) {
            return;
        }

        int menor = vetor[0];
        int maior = vetor[0];

        for (int numero : vetor) {
            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        }

        ArrayList<LinkedList<Integer>> baldes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            baldes.add(new LinkedList<Integer>());
        }

        // Distribui os numeros entre os baldes
        for (int numero : vetor) {
            int indice = (int) (((long) numero - menor) * n / ((long) maior - menor + 1));
            baldes.get(indice).add(numero);
        }

        int posicao = 0;
        for (LinkedList<Integer> balde : baldes) {
            insercao(balde);

            for (int numero : balde) {
                vetor[posicao] = numero;
                posicao++;
            }
        }
    }

    private static void insercao(LinkedList<Integer> lista) {
        for (int i = 1; i < lista.size(); i++) {
            int valor = lista.get(i);
            int j = i - 1;

            while (j >= 0 && lista.get(j) > valor) {
                lista.set(j + 1, lista.get(j));
                j--;
            }

            lista.set(j + 1, valor);
        }
    }
}
