/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionoflist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Shiplu L
 */
public class SetIterator {
    public static void main(String[] mashud){
       Set<String> nameList=new HashSet<String>();
    nameList.add("rashed");
    nameList.add("rashed");
    nameList.add("mashud");
        Iterator<String> iterator = nameList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }  
    }
   
}
