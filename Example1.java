/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionoflist;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Shiplu L
 */
public class Example1 {
public static void main(String[] arg)
{
    HashMap<String,String> masud=new HashMap();
    masud.put("name","masud");
    masud.put("Id", "1213232");
    masud.put("address", "32/A");
    for (Map.Entry<String, String> entrySet : masud.entrySet()) {
            String key = entrySet.getKey();
            String value = entrySet.getValue();
            System.out.println(entrySet.getKey() + " "+ entrySet.getValue());
            
        
}
    System.out.println(masud.get("Id"));
}
}