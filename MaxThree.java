import java.util.Scanner;

public class MaxThree {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  1st no. you went");
        int a = sc.nextInt();
        System.out.println("enter the 2nd no.");
        int b = sc.nextInt();
        System.out.println("enter the 3rd no");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > c && b > c) {
            System.out.println(" b is greater");
        } else {
            System.out.println("c is greater");
        }

    }

}
