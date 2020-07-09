/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionoflist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Shiplu L
 */
public class CollectionOfList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        ArrayList<String> nameList=new ArrayList<>();
    nameList.add("rashed");
    nameList.add("rashed");
    nameList.add("mashud");
        Iterator<String> iterator = nameList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
  
    }
    
}
