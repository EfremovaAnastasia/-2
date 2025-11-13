import java.util.Scanner;
public class лабораторная3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 0;
        int l = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int p = 0;
        int st = 0;
        int cr = 0;
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        while (in.hasNextInt()) {
            int s = in.nextInt();
            if (s == -l * l) {
                break;
            }
            st++;
            p += s;
            cr = p / l;
            int f = p % l;
            if (f < 0) {
                f += l;
                cr--;
            }
            if (f != 0) {
                if (f == a)
                    a1 = 1;
                if (f == b)
                    b1 = 1;
                if (f == c)
                    c1 = 1;
            }
            if ((a1 == 1) && (b1 == 1) && (c1 == 1)) {
                System.out.println(cr + " " + st);
                return;
            }
        }
        System.out.println("NO");
    }
}
