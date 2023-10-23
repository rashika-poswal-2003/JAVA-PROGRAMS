import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st no.");
        int a = sc.nextInt();
        System.out.println("enter the 2nd no.");
        int b = sc.nextInt();
        // int c=sc.nextInt();
        if (a > b) {
            System.out.println("no. 1st  is greater");
        } else {
            System.out.println("no. is  not smaller");
        }

    }

}
