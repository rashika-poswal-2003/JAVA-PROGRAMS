import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the english marks");
        int a = sc.nextInt();
        System.out.println("enter the physics marks");
        int b = sc.nextInt();
        System.out.println("enter the chemistry marks");
        int c = sc.nextInt();
        System.out.println("enter the maths marks");
        int d = sc.nextInt();
        System.out.println("eneter the hindi marks");
        int e = sc.nextInt();
        float percentage = ((a + b + c + d + e) / 5);
        System.out.println("percentage is:");
        System.out.println(percentage);

    }

}
