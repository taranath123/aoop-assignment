package example2;
import java.util.Scanner;
import java.io.*;
class notPrime extends Exception{ 
   public String toString(){ 
             return "Not a Positive number";
   } 
}
class checkPrime{ 
       public static void main(String[] args){
               Scanner sc=new Scanner(System.in); 
               System.out.println("enter a number");
               int n=sc.nextInt(); 
               try{ 
                    if(n>0){ 
                          for(int i=2;i<=n/2;i++){
                               if(n%i==0){ System.out.println(n+" is not a prime number");
               }
                     else{ System.out.println(n+" is a prime number"); 
                      }
                    }
                 }
                 else{
                    throw new notPrime();
                     }
                }catch(notPrime np){
                   System.out.println(np.toString()); 
                }
       }
 }
