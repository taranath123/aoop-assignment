package example3;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
public class SubString { 
public static void main(String args[]) throws IOException { 
//File f=new File("sdmcet.txt"); 
FileReader f=new FileReader("Sdmcet.txt"); 
BufferedReader br= new BufferedReader(f); 
String s1="SDMCET"; 
String s2=""; 
while((s2=br.readLine())!=null) { 
try { 
if(s2.contains(s1)) { 
                  System.out.println("SDMCET string found succesfully at position:"+s2.indexOf(s1) );
                                                       } 
else {
throw new StringNotFoundException("String not found"); 
}
}catch(StringNotFoundException se) { 
se.printStackTrace(); 
} 
} 
               }
} 
class StringNotFoundException extends Exception{ 
private String se; 
StringNotFoundException(String s){ 
this.se=s; 
}
}

