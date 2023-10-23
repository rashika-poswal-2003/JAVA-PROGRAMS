import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the character:");
        char ch = sc.next().charAt(0);// initialize the character
        if ((ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')) {
            System.out.println("this char. is alphabet");
        } else {
            System.out.println("not alphabet");
        }

    }

}
