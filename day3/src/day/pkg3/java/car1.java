package day.pkg3.java;

class vehicle {
    
    
   static void speed(){
       System.out.println(" maintain vehicle speed");
   }
   static void speed(int maxSpeed){
       System.out.println("Max speed of vehicle"+maxSpeed);
   }
}
public class car1 extends vehicle {
        void speed(String mode){
        System.out.println("car is running in "+mode+"mode");    
    }
         public static void main(String[] args) {
             car ob= new car();
       ob.speed();
       ob.speed(100);
       ob.speed("sport");
         
         }
         }


