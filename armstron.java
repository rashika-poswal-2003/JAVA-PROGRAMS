import java.util.Scanner;

public class armstron {
     static public int count(int  num)
    {
        int count=0;
        while(num!=0)
        {
            count++;
            num=num/10;
        }
        return count;
    }
    static public int power(int num)
    {
        int sum=0,mul=1;
        int half=num%10;
        int c=count(num);
        while(num!=0)
        {
            mul=1;
            for(int j=0;j<c;j++)
            {
                mul=mul*half;
            }
            
            sum=sum+mul;
            num=num/10;
            half=num%10;
        }
        return sum;
    }
    static public void armstrong(int num)
    {
        int sum=power(num);
        // System.out.println(sum);
        if(num==sum)
        {
            System.out.println("given number is armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        armstrong(num);
    }
}
