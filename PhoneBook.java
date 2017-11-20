import java.util.*;
import java.io.*;

class PhoneBook{
    
    
   public static void main(String []argh)
   {
        Map<String, Integer> cont= new HashMap<String,Integer>();
       
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      in.nextLine();
      for(int i=0;i<n;i++)
      {
         String name=in.nextLine();
         Integer phone=in.nextInt();
         in.nextLine();
          cont.put(name,phone);
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
          
          if(cont.containsKey(s)){
              System.out.println(s+"="+cont.get(s));
          }
          else
              System.out.println("Not found");
              
      }
   }
}
