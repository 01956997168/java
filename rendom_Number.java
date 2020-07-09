/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionoflist;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Shiplu L
 */
public class rendom_Number {
    public static void main(String[] args) {
        Random obj=new Random();
        Scanner obj1=new Scanner(System.in);
        int a,b;
        System.out.print("give any number 0-99 : ");
        a=obj1.nextInt();
        b=obj.nextInt(100);
        if(a==b)
        {
            System.out.print("welcome to the game ");
        }
        else{
            System.out.println("you loss your money and time"+"\nMy number is "+b);
        }
    }
 
}
