package day.pkg3.java;
class animal  {      
    void print(){
    System.out.println("sound");
     }
    
} 
class cat extends animal{
    void sound(){
        System.out.println("meowww");     
    }
    public static void main(String[] args) {
     cat obj=new cat();
        obj.print();
        obj.sound();        
    }
}



