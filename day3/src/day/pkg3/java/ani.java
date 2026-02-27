/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day.pkg3.java;
class animal{
    static void sound(){
        System.out.println("Animal makes a sound");
    }
}
public class ani extends animal {
//@Override
     static void sound(){
    System.out.println("Dog barks");
}
    public static void main(String[] args) {
        // TODO code application logic here
    animal obj=new ani();
    obj.sound();
    
   // ani obj = new animal();
    }
    
}
