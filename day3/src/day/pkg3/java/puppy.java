/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day.pkg3.java;

/**
 *
 * @author Sharanya A
 */
public class puppy extends dog {
    void display(){
        System.out.println("puppy class");
    }
    public static void main(String[] args){
        puppy ob=new puppy();
        ob.display();
      
        ob.print();
          ob.sound();
    }
}
