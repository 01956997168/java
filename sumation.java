package collectionoflist;

import java.util.Scanner;

public class sumation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        int sum=0;
        int [] array=new int[5];
        System.out.print("Enter your number : ");
        for (int i = 0; i <array.length; i++) {
            array[i]=sc.nextInt();
        }
        for (int i = 0; i <array.length; i++) {
            sum=sum+array[i];
        }
        System.out.println("Ans : "+sum);
                System.out.println("Samation  : "+sum/array.length);

    }
    
}
