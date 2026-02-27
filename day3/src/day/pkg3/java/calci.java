/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day.pkg3.java;
public class calci {

     static void cal(int a,int b){
        System.out.println(a+b);
        
    }
        static void cal(double a,double b){
        System.out.println(a*b);
    }
        static int cal(int a,int b,int c){
            return (a+b)/c;
           // System.out.println((a+b)/c);
        }
       public static void main(String[] args) {
        // TODO code application logic here
        
        cal(5,8);
        cal(10.9,7.9);
        //cal(7,8,2);
           System.out.println(cal(7,9,2));
    }
    
}
