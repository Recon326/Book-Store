/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_store;

import java.util.*;

/**
 *
 * @author Tyrone
 */
public class Uses {
        //Base time for searching is 50 units
    private static final int looking = 50;
    //Used to generate a random number
    static Random rand = new Random();
    
    public static void Search() {
        Search(looking);
    }
    public static void Search(int duration){
        //Since max time for searching is assumed to be 75, the time it takes to search will be 50 + a number between 0 and 25
        //The customer takes their time searching for the item
        int Searching = duration + rand.nextInt(26);
        try{ Thread.sleep(Searching*50);}
        catch (InterruptedException e) {}
    }
    
    public static final int check = 10;
    static Random ran = new Random();
    public static void checkout(){
        checkout(check);
    }
    //The cashier takes a certain amount of time to check out a cashier
    public static void checkout(int duration){
        int sale = duration + ran.nextInt(11);
        try { Thread.sleep(sale*100); }
        catch (InterruptedException e) {}
    }
    //Used by the cashier to wait for a customer to be ready to be served
    private static final int WAITING = 5;
    public static void waiting(){
        int waittime = (int) (WAITING *Math.random());
        try {Thread.sleep(waittime*100); }
        catch (InterruptedException e) {}
    }
}
