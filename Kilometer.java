import java.util.Scanner;

public class Kilometer {
    public static void main(String[] args) {
        double k,m;
        Scanner sc = new Scanner(System.in);
        System.out.println("choose type of convrtion\n 1.kilometer to meter\n 2.meter to kilometer");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:System.out.println("enter the kilometer value");
            k=sc.nextDouble();
            m=1*1000;
            System.out.println("value of meter is"+m);
            case 2:System.out.println("enter the meter value");
            m=sc.nextDouble();
            k=1/1000;
            System.out.println("value of kilometer is"+k);
    
        }       

    }

}
