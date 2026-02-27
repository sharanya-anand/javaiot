package day.pkg1.java;
import java.util.Scanner;

public class strongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number:");
         int n=sc.nextInt();
        int temp=n;
        int sum=0;
                 while(temp>0){
                     
                     int digit = temp%10;
                     int fact=1;
                     for(int i=1;i<=digit;i++){
                         
                         fact*=i;
                         
                     }
                      sum=sum+fact;
                     temp/=10;                     
                 }
              
  
 if(sum==n){
                     System.out.println(n+" is a strong number");     
                 }
                 else
                    System.out.println(n+" is not strong Number");

    }
    
}
