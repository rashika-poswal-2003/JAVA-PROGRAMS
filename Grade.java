import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks");
        int num = sc.nextInt();
        if (num > 80) {
            System.err.println(" grade A");
        } else if (num > 60 && num <= 80) {
            System.out.println("grade B");
        } else if (num > 50 && num < 60) {
            System.out.println("grade C");
        } else if (num > 45 && num <= 50) {
            System.out.println("grade D");
        } else if (num > 25 && num < 45) {
            System.out.println(" grade E");
        } else {
            System.out.println("grade F");
        }
    }

}
