public class Assignment1{
 public static void main(String[] args){
 int a=10,b=5,c=5;
 String s=null;
 int d[]=new int[5];
     try{
             System.out.println(a/(b-c)); 
           } catch(ArithmeticException ae){ 
                 System.out.println("division by zero error"+ae); 
               }
                 try{ System.out.println(s.length());
    } catch(NullPointerException ne){ 
         System.out.println("String is null"+ne);
       }
    try{ 
 	           d[10]=50; 
          } catch(ArrayIndexOutOfBoundsException aoe){ 
System.out.println("array index exceeded"+aoe); 
}
                }
}
