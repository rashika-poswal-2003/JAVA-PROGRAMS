import java.util.Scanner;

public class NegitivePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("no. is positive");
        } else if (a < 0) {
            System.out.println("no. is negative");
        } else {
            System.out.println("no. is zero");
        }
    }
}