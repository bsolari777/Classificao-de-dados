import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] numeros = {8, 3, 10, 1, 5, 3, -2, 7};

        int[] a = numeros.clone();
        ShakeSort.ordenar(a);
        System.out.println("ShakeSort:  " + Arrays.toString(a));

        int[] b = numeros.clone();
        HeapSort.ordenar(b);
        System.out.println("HeapSort:   " + Arrays.toString(b));

        int[] c = numeros.clone();
        QuickSort.ordenar(c);
        System.out.println("QuickSort:  " + Arrays.toString(c));

        int[] d = numeros.clone();
        BucketSort.ordenar(d);
        System.out.println("BucketSort: " + Arrays.toString(d));
    }
}
