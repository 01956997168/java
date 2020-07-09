/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionoflist;

import java.util.Scanner;

/**
 *
 * @author Shiplu L
 */
public class For_Each_loop {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String []a=new String[3];
        for (int i = 0; i < a.length; i++) {
            a[i]=obj.next();
        }
        for(String temp:a)
        {
            System.out.println(temp);
                    
        }
    }
    
}
