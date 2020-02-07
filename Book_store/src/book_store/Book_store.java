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
public class Book_store {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("How many customers are in the store?");
        int numcustomers = scan.nextInt();
        System.out.println("How many cashiers are in the store?");
        int numcashiers = scan.nextInt();
        
        Process.Store(numcustomers,numcashiers);
        
        //Creates the amount of customer threads the user gives
        for(int i = 1; i<=numcustomers; i++){
            Thread CustomerThread = new Thread(new Customers(i));
            CustomerThread.start();
        }
        //Creates the amount of cashier threads that the user gives
        for(int k = 1; k<=numcashiers; k++)
        {
            Thread CashiersThread = new Thread(new Cashiers(k));
            CashiersThread.start();
        }
    }
}
