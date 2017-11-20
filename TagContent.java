import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TagContent{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String line = in.nextLine();
         int count=0; ////////<(.+?)>([^<>]+)</\\1>")
          Pattern p=Pattern.compile("<(.+)>([^<]+)<(/\\1)>");
          Matcher m=p.matcher(line);
          
          while(m.find())
          {
              if(m.group(2).length()>0)
                  System.out.println(m.group(2));
              count++;
          }
          if(count==0)
               System.out.println("None");
            
         testCases--;
      }
   }
}