import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. you went:");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("no. is even");
        } else {
            System.out.println("no. is odd");
        }

    }

}
