package com.company;
import java.util.Scanner;

 class Bank{

}
class Customer extends Bank{
     int ACC;
     int balance;
     Scanner s = new Scanner(System.in);
     Customer(int acc , int bal){
         try {
             if (bal >= 0) {
                 balance = bal;
             } else {
                 throw new IllegalArgumentException("Balance can't be negative");
             }
         }catch(Exception e){
             System.out.println(e);
         }

     }
     public void deposit(){
         System.out.println("Enter the money you want to deposit");
         int deposit = s.nextInt();
         try{
             if(deposit>=0){
                 System.out.println("Money deposited");
                 balance = balance+deposit;
             }
             else{
                 throw new IllegalArgumentException("Deposit can't be in negative");
             }
         }catch(Exception e){
             System.out.println(e);
         }
     }
     public void withdraw(){
         System.out.println("Enter the money you want to withdraw");
         int withdraw = s.nextInt();
         try{
             if(withdraw>=0&& balance>withdraw){
                 System.out.println("Money withdrawl succsssfully");
                 balance = balance - withdraw;
             }
             else{
                 throw new IllegalArgumentException("Withdraw can't be in negative");
             }
         }catch(Exception e){
             System.out.println(e);
         }
     }
     public void transfer_funds() {
         System.out.println("Enter the money you want to transfer");
         int transfer_price = s.nextInt();
         try {
             if (transfer_price >= 0 && balance >= transfer_price) {
                 System.out.println("Funds successfully transfered");
                 balance = balance - transfer_price;
             } else {
                 throw new IllegalArgumentException("Transfer price can't be in negative or your balance is low");
             }
         } catch (Exception e) {
             System.out.println(e);
         }
     }
     public String toString(){
         return ("You have current balance = "+balance);
     }
}
class ATM_TECH extends Bank{
     Scanner s = new Scanner(System.in);
     public void Maintenance(){
         System.out.println("Enter the valid ATM TECHNICIAN maintaining employee id");
         int id = s.nextInt();
         try{
             if(1000<=id && id<=1008){
                 System.out.println("Access granted");
             }
             else{
                 throw new IllegalArgumentException("Access Denied");
             }
         }catch(Exception e){
             System.out.println(e);
         }
     }
     public void repair(){
         System.out.println("Enter the valid ATM TECHNICIAN repairing employee id");
         int id = s.nextInt();
         try{
             if(1010<=id && id<=1020){
                 System.out.println("Access granted");
             }
             else{
                 throw new IllegalArgumentException("Access Denied");
             }
         }catch(Exception e){
             System.out.println(e);
         }
     }
}
public class bank_system {
    public static void main(String[] args) {
        Customer c = new Customer(2224,20000);
        c.deposit();
        c.withdraw();
        c.transfer_funds();
        System.out.println(c);
        ATM_TECH a = new ATM_TECH();
        a.Maintenance();
        a.repair();
    }
}
