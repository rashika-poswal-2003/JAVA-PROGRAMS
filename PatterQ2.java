import java.util.*;
public class PatterQ2 {
    public static void main(String[] args){
        int i,j;

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        n=sc.nextInt();
       //outer loop
        for(i=1;i<=n;i++){
            //inner loop
            for(j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}
