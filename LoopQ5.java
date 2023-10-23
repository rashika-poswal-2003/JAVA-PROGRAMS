import java.util.Scanner;
public class LoopQ5 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;
        do{
            System.out.println("enter the no.");
            number=sc.nextInt();
            if(number%2==0){
                System.out.println("even no.");
            }else{
                System.out.println("odd no");
            }
            System.out.println("do you went to continoue? press 1 for yes or 0 for no ");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("sum of even number" +evenSum);
        System.out.println("sum of odd number" +oddSum);
        }
        
        }
    
