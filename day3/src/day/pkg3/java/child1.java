/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day.pkg3.java;

class parent{
    parent(){
        System.out.println("parent");
    }
   
}
public class child1 extends parent{
child1(){
    super();
    System.out.println("child");
}
    public static void main(String[] args) {
        // TODO code application logic here
        child1 obj= new child1();
        //System.out.println(obj);
    }
    
}
