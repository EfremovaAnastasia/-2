import java.util.Arrays;
import java.util.Scanner;
public class лабораторная4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = -1;
        int n = in.nextInt();
        int []x = new int[n];
        for (int i = 0; i < x.length; i++) {
            x[i] = in.nextInt();
        }
        int s = f(x);
        int p = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == s) {
                p = x[i];
                k = i;
                break;
            }
        }
        if ((p == 0) && (k == -1)) {
            System.out.println("Число различных элементов в массиве: 1");
            System.out.println("Элементы массива одинаковые");
        } else {
            if ((p == 0) && (k > -1)){
                System.out.println("Число различных элементов в массиве: 1");
                System.out.println("Индекс элемента в массиве:" + " " + k);
            }
            else{
                System.out.println("Элемент последовательности, который равен числу различных элементов в массиве:" + " " + p);
                System.out.println("Индекс элемента в массиве:" + " " + k);
            }
        }
    }
    public static int f(int [] x) {
        if (x.length == 0)
            return 0;
        Arrays.sort(x);
        int c = 1;
        for (int i = 1; i < x.length; i++) {
            if (x[i] != x[i - 1])
                c++;
        }
        return c;
    }
}
