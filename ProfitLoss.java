import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] agrs){
        int p,l,sp,cp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice\n 1.profit\n 2.loss");
        int ch=sc.nextInt();
        switch(ch)
        {
           case 1: System.out.println("enter the value");
            int p=sc.nextInt();
            p=sp-cp;
            break;
           case 2:System.out.println("enter the value");
           int l=sc.nextInt();
           l=cp-sp;
           break;
           default:System.out.println("invalid choice");
            
        }
        sc.close();

    }

}
