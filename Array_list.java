
package collectionoflist;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n;
        System.out.print("Enter the number of array : ");
        n = obj.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = obj.nextInt();
        }
        System.out.println("Add the value ");
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        
        System.out.println(list);
        /*  list.add(10);
         list.add(1);
         list.add(20);*/
      //  list.remove(a);

    }
}
