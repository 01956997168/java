/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionoflist;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Shiplu L
 */
public class ARRAY_SHORT {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in); //output of users
        int [] x=new int [5];
        for (int i = 0; i <x.length; i++) {
        x[i]=obj.nextInt();    
        }
        Arrays.sort(x);
        System.out.print("Assiding : ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(" "+x[i]);
        }
        System.out.println("");
        System.out.print("Disenting : ");
        for (int i = 5; i >0; i--) {
            System.out.print(" "+x[i]);
        }
        System.out.println(""); 
                
    }
}
