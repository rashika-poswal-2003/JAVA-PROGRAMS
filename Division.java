import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int a = sc.nextInt();
        if (a % 5 == 0 && a % 7 == 0) {
            System.out.println("no is divisible");
        } // else if (a % 7 == 0) {
          // System.out.println("no. is divisible 7");
        else {
            System.out.println("not divisible");
        }
    }

}
