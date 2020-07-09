/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionoflist;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Shiplu L
 */
public class UserInfoCollection {
    
    static ArrayList<HashMap<String, String>> nameList = new ArrayList<>();
    
    public static void main(String[] agr) {
        for (int i = 0; i < 10; i++) {
            HashMap<String, String> idMap = new HashMap();
            idMap.put("id", "00000" + i);
            nameList.add(idMap);
        }
        System.out.println(nameList.get(2));
        HashMap<String, String> specificData = (HashMap<String, String>) nameList.get(2);
        System.out.println(specificData.get("id"));
    }
}
