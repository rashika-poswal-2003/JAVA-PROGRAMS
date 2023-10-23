import java.util.Scanner;

public class IfElseQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Age you went:");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("yes you are Adult:");
        } else {
            System.out.println("not Adult");
        }
    }

}
