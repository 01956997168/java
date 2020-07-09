/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionoflist;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Shiplu L
 */
public class Date_time {
    public static void main(String[] args) {
       Date obj=new Date();
        System.out.println("Date : "+obj);
        SimpleDateFormat objOFdate=new SimpleDateFormat("YY/MM/dd");
        String d=objOFdate.format(obj);
        System.out.println(d);
    }
}
