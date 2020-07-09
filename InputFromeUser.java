package collectionoflist;
import java.util.Scanner;

public class InputFromeUser {
    public static void main(String[] arg){
        Scanner ovj = new Scanner (System.in);
        int num1,num2,sum;
        System.out.print("Enter the value : ");
        num1=ovj.nextInt();
        num2=ovj.nextInt();
        sum=num1+num2;
        System.out.println("sum :"+sum);
        
    }
    
}
