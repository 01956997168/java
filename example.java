/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionoflist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Shiplu L
 */
public class example {

    public static void main(String[] agr)
    {
        ArrayList<String> nameList=new ArrayList<String>();
                nameList.add("masud");
                nameList.add("Masud");
                Iterator<String> nameOfiterator =nameList.iterator();
                while(nameOfiterator.hasNext())
                {
                    System.out.println(nameOfiterator.next());
                }
                
                
                
    }
}
