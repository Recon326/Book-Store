/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_store;

/**
 *
 * @author Tyrone
 */
import java.util.*;
public class Customers implements Runnable {
    int number;
    public Customers(int cusnum){
        this.number = cusnum;
    }
    
    public void run(){
        Random ran = new Random();
        int items = ran.nextInt(6) + 1;
        int temp = items;
//Customer is searching for items
        while(temp>0){
            Uses.Search();
            temp--;
        }
        Process.EnterLine(items);
    }
}
