import java.util.*;
class BalancedParenthesis{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
          if(!input.isEmpty())
             // System.out.println(input.isEmpty());
          {
          Stack <Character> st=new Stack<Character> ();
         for(int i=0;i<input.length();i++){
             char c=input.charAt(i);
             
             if(c=='{')
             {
                 st.push(c);
             }
             if(c=='(')
                {
                 st.push(c);
             }
             if(c=='[') {
                 st.push(c);
             }
             
             
                  if(c==')')
                  {
                   if(!st.isEmpty()){   
                 if(st.peek()=='(')
                 {
                     st.pop();
                     // break;
                 }
                   }
                       else
                       {
                          st.push(c);
                     // System.out.println(st.isEmpty());
                       }
                  }
                
                  if(c==']')
                  {
                     if(!st.isEmpty()){   
                 if(st.peek()=='[')
                 {
                     st.pop();
                     // break;
                 }
                   }
                       else
                       {
                          st.push(c);
                    //  System.out.println(st.isEmpty());
                       }
                  }
                 
                  if(c=='}')
                  {
                  if(!st.isEmpty()){   
                 if(st.peek()=='{')
                 {
                     st.pop();
                     // break;
                 }
                   }
                       else
                       {
                          st.push(c);
                    //  System.out.println(st.isEmpty());
                       }
                  }
              
         }
        //  if(st.isEmpty())
          System.out.println(st.isEmpty());
              
          } 
         
    
             else     
              System.out.println(input.toString().isEmpty());
          
      }
   }
   }
 