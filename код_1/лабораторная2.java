import java.util.Scanner;
public class лабораторная2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x = new int[n];
        long p = -1;
        long min = 2147483647;
        long max = -2147483648;
        int r = 0;
        for (int i = 0; i < x.length; i++){
            x[i] = in.nextInt();
        }
        if (n > 0){
            min = x[0];
            max = x[0];
            for (int j = 1; j <= n; j++) {
                int s = j - 1;
                if (j > 1) {
                    if (x[s] < min)
                        min = x[s];
                    if (x[s] > max)
                        max = x[s];
                }
                long d = max - min;
                if (d > p) {
                    p = d;
                    r = j;
                }
            }
        }
        System.out.println(r);
    }
}
