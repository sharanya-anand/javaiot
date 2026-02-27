/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day.pkg3.java;

class Bank{
    static void interest(){
        System.out.println("Banks Provides interest on deposits");
    }
    static void interest(double rate){
        System.out.println("Interest rate is:"+rate);
    }
}
public class sbi extends Bank {
     static void interest(double rate,int years){
         double principle=10000;
         
        System.out.println("Total Interest for "+years+"years"+((principle*rate*years)/100));
    }
      public static void main(String[] args) {
    sbi obj = new sbi();
    obj.interest();
    obj.interest(2.5);
    obj.interest(2.5,4);

      }
}
