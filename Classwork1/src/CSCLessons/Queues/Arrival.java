package CSCLessons.Queues;

import java.io.*;
import java.util.Scanner;

/**
 * Vishal Nigam
 * 4/12/18
 */
public class Arrival {
    private Customer head, tail,current;
    private int numCustomers = 0, AT,ST,time,chair, Qguy;
    private String name;
    private Customer[] queue;
    private Scanner fileReader, input;

    private class Customer {
        int arrivalTime;
        int serviceTime;
        String customerName;
        Customer customer;

        public int getArrivalTime() {
            return arrivalTime;
        }

        public void setArrivalTime(int arrivalTime) {
            this.arrivalTime = arrivalTime;
        }

        public int getServiceTime() {
            return serviceTime;
        }

        public void setServiceTime(int serviceTime) {
            this.serviceTime = serviceTime;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public void setNext(Customer c){this.customer = c;}


        public Customer() {
            customerName = "";
            arrivalTime = 0;
            serviceTime = 0;
        }

        public Customer(int a, int s, Customer c, String name) {
            arrivalTime = a;
            serviceTime = s;
            customer = c;
            customerName = name;
        }

    }
    public void chairs(){
        System.out.println("Enter number of chairs in the barber shop.");
        input = new Scanner(System.in);
        chair = input.nextInt();
        queue = new Customer[chair];
    }
    public void process(){
        time = 0; Qguy = 0;
        while(time<50){
            System.out.println("Time: "+time);
            if(isEmpty()){
                System.out.println("All customers served :)");
                System.exit(0);
            }
            else {
                if(queue[Qguy%queue.length]!=null){
                    int serv = queue[Qguy%queue.length].getServiceTime();
                    if(serv>0){
                        queue[Qguy%queue.length].setServiceTime(serv-1);
                        System.out.println(queue[Qguy%queue.length].getCustomerName()+" is still getting a haircut.");
                    }
                    else {
                        System.out.println(queue[Qguy].getCustomerName()+" leaves with FABULOUS hair.");
                        queue[Qguy]=null;
                        Qguy++;
                    }
                }
                if(head.getArrivalTime()==time){
                    if(numCustomers<queue.length) {
                        queue[numCustomers] = head;
                        numCustomers++;
                        System.out.println(queue[numCustomers - 1].getCustomerName()+" has arrived.");
                        removeCustomer();
                    }
                    else if(numCustomers==queue.length){
                        System.out.println(head.getCustomerName()+" does not enter the full shop.");
                        removeCustomer();
                    }
                }
                time++;
            }
        }
    }
    public Boolean isEmpty(){
        return head==null;
    }
    public boolean isFull(){
        if(numCustomers == queue.length){
            return true;
        }
        else return false;
    }
    public void addCustomer(int a, int s, String name){
        if(isEmpty()) {
            tail = new Customer(a, s, null,name);
            head = tail;
            current = head;
        }
        else{
            tail = new Customer (a,s,null,name);
            current.setNext(tail);
            current = tail;
        }
    }
    public void removeCustomer(){
        if(isEmpty()){
            System.out.print("No customers left");
        }
        else {
            head = head.customer;
        }
    }
    public String getCustomer(){
        return head.customerName;
    }
    public void nextCustomer(Customer c){

    }
    public void readArrivals(String filename){
        File file = new File(filename);
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                AT = fileReader.nextInt();
                ST = fileReader.nextInt();
                name = fileReader.next();
                addCustomer(AT, ST, name);
                System.out.println(name+": "+"Arrival time: "+AT+" Service time: "+ST);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("ERROR: "+name+" not found.");
            System.exit(0);
        }
    }
    public void display(){
        System.out.print(queue);
    }
}
