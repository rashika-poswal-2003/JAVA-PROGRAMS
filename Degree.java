import java.util.Scanner;

public class Degree {
    public static void main(String[] args){
        double f,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("choose type of convertion\n 1.fahrenheit to celsius\n 2.celsius to fahrenheit ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:System.out.println("enter the fahrenheit temperture ");
            f=sc.nextDouble();
            c=(f-32)*5/9;
            System.out.println("celsius temperture is" +c);
            break;
            case 2:System.out.println("enter the celsius temperture");
            c=sc.nextDouble();
            f=((9*c)/5)+32;
            System.out.println("fahrenheit temperture"+f);
            break;


        }
        sc.close();

    }
}
