/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book_store;

//import java.util.LinkedList;

/**
 *
 * @author Tyrone
 */
import java.util.*;
public class Process {
    //Used to determine the maximum amount of people that can be in the line
    private static final int maxLinesize = 50;
    private static int cashier;
    private static int count,serving;
    public static int Total;
    static Queue<Integer> Line = new LinkedList<>();
    //Uses to amount of customers and cashiers to tell how many Customers are looking for items, in line, and being served.
    public static void Store(int customer,int register){
        Total = customer;
        cashier = register;
        System.out.println("There are a total of " + Total + " Customers in the store, " + count + " customers in line and, " + serving + " customers being served.");
    }
    public Process(){
        //initializes the count to 0 meaning there is no line of customers
        count = 0;
        
    }
    public static void Sale(){
        //checks the queue to see if it's empty, if it isn't then the cashier serves a customer
        if (Line.isEmpty() != true){
            count--;
            serving++;
            int items = Line.peek();
            Line.poll();
            while (items>0){
                Uses.checkout();
                items--;
            }
            System.out.println("Cashier has finished serving a customer.");
        serving--;
        Total--;
        System.out.println("There are a total of " + Total + " Customers in the store, " + count + " customers in line and, " + serving + " customers being served.");
        }
        //if the queue is empty, then the cashier waits for a customer to be ready
        else{
        //System.out.println("Cashier is waiting.");
            Uses.waiting();
        }
        //Checks if the number of cashiers is larger than the total number of customers in the store, if so, their register closes
        if(Total<cashier){
            Cashiers.Stoprunning();
            System.out.println("Closing cash register due to low number of customers");
        }
        //Closes the cashier thread because all customers have been served
        if(Total == 0){
            Cashiers.Stoprunning();
            System.out.println("All customers have been served, Store is closed");
        }
        
    }
    //customer enters a queue with their items, ready to be served by a cashier
    public static void EnterLine(int items){
        count++;
        Line.add(items);
        System.out.println("There are a total of " + Total + " Customers in the store, " + count + " customers in line and, " + serving + " customers being served.");
    }
}
