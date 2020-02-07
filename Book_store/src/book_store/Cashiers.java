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
public class Cashiers implements Runnable {
    int position;
    static boolean running = true;
    public Cashiers(int pos){
        this.position = pos;
    }
            
    public void run(){
        while (running == true){
            Process.Sale();
            
        }
    }
    
    //used to stop the thread from running infinitly
    public static void Stoprunning(){
        running = false;
    }
}
