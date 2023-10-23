import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n/2;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
            if(i==m-1)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
           
          sc.close();  

    }
    
}
