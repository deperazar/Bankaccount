/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.account;

/**
 *
 * @author PERSONAL
 */

import java.util.*;

public static class Bankaccountt {
    
    public class Account{
        private int number;
        private int passcode;
        private String name;
        private int cash;
        
        public void consing(){
            int newcash;
            Scanner lec=new Scanner(System.in);
            newcash=lec.nextInt();
            cash=newcash+cash;
            System.out.println("Su nuevo saldo es"+cash);
        }
        public void withdraw(){
            int withdrawn;
            int pass;
            Scanner lec=new Scanner(System.in);
            withdrawn=lec.nextInt();
            System.out.println("Introduce your passcode");
            pass=lec.nextInt();
            if(pass==passcode){
      
            if(cash<withdrawn){
                System.out.println("Not enough money");
            }
            cash=cash-withdrawn;
            System.out.println("Su nuevo saldo es"+cash);
        }
            
            System.out.println("Wrong passcode");
        }
        public void changepasscode(){
            int passs;
            int newone;
            Scanner lec=new Scanner(System.in);
            System.out.println("Introduce your passcode");
             passs=lec.nextInt();
             if(passs==passcode){
                 
                 System.out.println("Introduce your new passcode");
                 newone=lec.nextInt();
                 System.out.println("Your passcode has changed");
             }
            System.out.println("Wrong password");
            
        }
        public void seecash(){
            int passcod;
            Scanner lec=new Scanner(System.in);
            System.out.println("Introduce your passcode");
            passcod=lec.nextInt();
            if(passcod==passcode){
                System.out.println("Your account has:"+cash);
            }
            System.out.println("Wrong passcode");            
        }
        
        public Account(int n,int p,String nom,int c){
            
            number=n;
            passcode=p;
            name=nom;
            cash=c;
        }
        
        
    }
    public  static void main(String[] args) {
            
        Account a1= new Account (1012,1234,"Magdalena Sánchez",0);
        a1.consing();
        
     }
}
