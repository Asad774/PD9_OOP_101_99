/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mannual9;

/**
 *
 * @author muzammal computer
 */
public class Task3 {
 
    
      
  public String ridMultipleBlank(String s)
  {
    String [] tokens = s.split(" ");
    String str=null;
    for(int i=0; i<tokens.length ;i++)
    {
      if(i==0)
      {
      if(!tokens[i].equals(""))
      {
        str=tokens[i]+" ";
      }
      }
      else
      {
       if(!tokens[i].equals(""))
      {
        str=str+tokens[i]+" ";
      }
      } 
    }
    return str;
  } 
  
  public String removeInteger(String s)
  {
    int b=s.length();
    String str="";
    for(int i=0; i<b;i++)
    {
      if(s.charAt(i)>='0' && s.charAt(i)<='9')
      {

      } 
      else
      {
       str=str+s.charAt(i); 
      }
    }
    return str;
  } 
  
  
}
