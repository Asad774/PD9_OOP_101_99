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
   public static String Encryptor(String s){
        String NewString="";
        int size=s.length();
        for(int i=0;i<size;i++){
            char ch_a=Character.toLowerCase(s.charAt(i)); 
            switch (ch_a)  
            {  
                case 'a':  
                    NewString=NewString+"*";  
                    break;  
                case 'b':  
                    NewString=NewString+"[";  
                    break;  
                case 'c':  
                    NewString=NewString+"@";  
                    break;  
                case 'd':  
                    NewString=NewString+"_";  
                    break;  
                case 'e':  
                    NewString=NewString+"-";  
                    break;  
                case 'f':  
                    NewString=NewString+"+";  
                    break;  
                case 'g':  
                    NewString=NewString+"|";  
                    break;  
                case 'h':  
                    NewString=NewString+"$";  
                    break;  
                case 'i':  
                    NewString=NewString+"#";  
                    break;  
                case 'j':  
                    NewString=NewString+"\\";  
                    break;  
                case 'k':  
                    NewString=NewString+"%";  
                    break;  
                case 'l':  
                    NewString=NewString+".";  
                    break;  
                case 'm':  
                    NewString=NewString+">";  
                    break;  
                case 'n':  
                    NewString=NewString+"^";  
                    break;  
                case 'o':  
                    NewString=NewString+"<";  
                    break;  
                case 'p':  
                    NewString=NewString+")";  
                    break;  
                case 'q':  
                    NewString=NewString+"^";  
                    break;  
                case 'r':  
                    NewString=NewString+">";  
                    break;  
                case 's' :  
                    NewString=NewString+"+";  
                    break;  
                case 't':  
                    NewString=NewString+";";  
                    break;  
                case 'u':  
                    NewString=NewString+",";  
                    break;  
                case 'v' :  
                    NewString=NewString+"_";  
                    break;  
                case 'w':  
                    NewString=NewString+"[";  
                    break;  
                case 'x' :  
                    NewString=NewString+"]";  
                    break;  
                case 'y':  
                    NewString=NewString+":";  
                    break;  
                case 'z' :  
                    NewString=NewString+"\"";  
                    break;  
                case ' ' :  
                    NewString=NewString+" ";  
                    break;  
                case '.':  
                    NewString=NewString+'3';  
                    break;  
                case ',':  
                    NewString=NewString+"1";  
                    break;  
                case '(':  
                    NewString=NewString+'4';  
                    break;  
                case '\"':  
                    NewString=NewString+'5';  
                    break;  
                case ')' :  
                    NewString=NewString+"7";  
                    break;  
                case '?' :  
                    NewString= NewString+"2";  
                    break;  
                case '!':  
                    NewString= NewString+"8";  
                    break;  
                case '-' :  
                    NewString= NewString+"6";  
                    break;  
                case '%' :  
                    NewString = NewString+"9";  
                    break;  
                case '1':  
                    NewString=NewString+"r";  
                    break;  
                case '2':  
                    NewString=NewString+"k";  
                    break;  
                case '3':  
                    NewString=NewString+"b";  
                    break;  
                case '4':  
                    NewString = NewString+"e";  
                    break;  
                case '5':  
                    NewString = NewString+"q";  
                    break;  
                case '6':  
                    NewString = NewString+"h";  
                    break;  
                case '7':  
                    NewString = NewString+"u";  
                    break;  
                case '8' :  
                    NewString= NewString+"y";  
                    break;  
                case '9':  
                    NewString = NewString+"w";  
                    break;  
                case '0':  
                    NewString = NewString+"z";  
                    break;  
                 default:  
                    NewString=NewString+"0";  
                    break;  
        }
    }
        return NewString;
    }
  
}
