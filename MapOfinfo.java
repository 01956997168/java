/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionoflist;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Shiplu L
 */
public class MapOfinfo {

    public static void main(String[] agr) {
        String number, id;
        Scanner obj = new Scanner(System.in);
        HashMap<String, String> mapInfo = new HashMap();
        mapInfo.put("name", "mashud");
        System.out.print("Give me your number : ");
        number = obj.next();
        System.out.print("give me your id : ");
        id = obj.next();
        mapInfo.put("phoneNumber", number);
        mapInfo.put("id", id);
        HashMap<String, String> mapInfo1 = new HashMap();
        mapInfo1.put("name", "rashed");
        mapInfo1.put("phoneNumber", "0184*031550");
        mapInfo1.put("id", "9283954");
       // System.out.println(mapInfo.keySet());
        // System.out.println(mapInfo.values());
        for (Map.Entry<String, String> entrySet : mapInfo.entrySet()) {
            String key = entrySet.getKey();
            String value = entrySet.getValue();
        //    System.out.println(key);
            //    System.out.println(value);            
        }
        System.out.println(mapInfo.get("id"));
        System.out.println(mapInfo.get("phoneNumber"));
        System.out.println(mapInfo1.get("phoneNumber"));
    }
}
