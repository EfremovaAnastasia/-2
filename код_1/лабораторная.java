import java.util.Scanner;
public class лабораторная {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 0;
        int n = in.nextInt();
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 != 0)
                System.out.println((int)Math.pow(2, i));
            else
                System.out.println(f(i));
        }
    }
    public static long f(int x) {
        long a = 1;
        for (int i = 2; i <= x; i++){
            a *= i;
        }
        return a;
    }
}
