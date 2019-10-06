
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0;

        int n = sc.nextInt();


        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= n / 2; j++) {

                if (j <= k) {
                    print(j + k - j + 1 + " ");
                } else
                    print(j + " ");


            }
            for (int j = n / 2 + i; j < n + i; j++) {
                print(j + " ");
            }

            k++;
            br();

        }

        k = n / 2 + 1;

        int x1 = 0, y1 = 0;

        for (int i = n / 2, l = 1; i < n; i++, l++) {
            for (int j = n / 2 + l; j < n + l; j++) {
                print(j + " ");
            }
            for (int j = 0, x = n / 2; j < n / 2; j++) {


                if (y1 >= j)
                    x++;
                print(x + " ");

                x1++;

            }

            x1 = 0;
            y1++;
            k++;
            br();

        }


    }


    private static void print(String str) {
        System.out.print(str);
    }

    private static void br() {
        System.out.println("");
    }


}
