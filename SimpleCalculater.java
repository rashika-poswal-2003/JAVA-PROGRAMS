import java.util.Scanner;
public class SimpleCalculater {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st number");
        int a=sc.nextInt();
        System.out.println("enter the 2nd number");
        int b=sc.nextInt();

        System.out.println("select operations");
        System.out.println("1-ADDITION,2-SUBTRACTION,3-MULTIPLICATION,4-DIVISION");
        int choice=sc.nextInt();
        switch(choice){
            case 1:System.out.println("sum"+(a+b));
            break;
            case 2:System.out.println("differense"+(a-b));
            break;
            case 3:System.out.println("multiplication"+(a*b));
            break;
            case 4:System.out.println("division"+(a/b));
            break;
            default:System.out.println("invalid");
            break;
             

        }
    }

}
