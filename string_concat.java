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
public class string_concat {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String middleName,fistName;
        System.out.print("Give the fist Name of your : "); 
        fistName=obj.next();
        
        System.out.print("Give the middle Name of your : ");
        middleName=obj.next();
        String fullName=fistName.concat(middleName);
        System.out.println("Name : "+fullName);
        int a=fullName.length();
        System.out.println("Name of length : "+a);
        String uppCase=fullName.toUpperCase();
        String lowerCase=fullName.toLowerCase();
        System.out.println("All letter going to be a UPPER CASE : "+uppCase);
        System.out.println("all letter going to be a lower case : "+lowerCase);
        
    }
    
}
