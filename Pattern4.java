import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int n = sc.nextInt();
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
