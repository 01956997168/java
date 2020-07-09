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
public class Number_convertion {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a, anyNum;

        System.out.println("You want to convert this item : ");
        anyNum = obj.nextInt();
        System.out.println("Decimal to Binrary,Decimal to Octal,Decimal to Hxadecimal");
        System.out.print("Choice this item : ");
        a = obj.nextInt();
        switch (a) {
            case 1: {
                String ans = Integer.toBinaryString(anyNum);
                System.out.println("ans : " + ans);
                break;
            }
            case 2: {
                String ans1 = Integer.toOctalString(anyNum);
                System.out.println("ans : " + ans1);
                break;
            }
            case 3: {
                String ans2 = Integer.toOctalString(anyNum);
                System.out.println("ans: " + ans2);
                break;
            }
            case 4: {
                String ans3 = Integer.toHexString(anyNum);
                System.out.println("ans : " + ans3);
                break;
            }
        }

    }

}
