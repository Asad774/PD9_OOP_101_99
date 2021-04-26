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
public class Task1 {
    
    
 public int wordCounter(String s)
{
 int a=1;
  int b=s.length();
 for(int i=0; i<b; i++)
 {
   if(s.charAt(i)==' ')
   {
    a=a+1; 
   }
 }
 return a;
} 
 
 public int vowelcounter(String s)
{
  int a=0;
  int b=s.length();
 for(int i=0; i<b; i++)
 {
   if((s.charAt(i)=='A' || s.charAt(i)=='a') ||(s.charAt(i)=='E' || s.charAt(i)=='e')||(s.charAt(i)=='I' || s.charAt(i)=='i')||(s.charAt(i)=='O' || s.charAt(i)=='o')||(s.charAt(i)=='U' || s.charAt(i)=='u'))
   {
    a=a+1; 
   }
 }
 return a;
 
}
 
public int puncCount(String s)
{
  int a=0;
  int b=s.length();
 for(int i=0; i<b; i++)
 {
   if(s.charAt(i)==',' || s.charAt(i)=='.'||s.charAt(i)==';'||s.charAt(i)==':'||s.charAt(i)=='\''||s.charAt(i)=='\"'||s.charAt(i)=='('||s.charAt(i)==')'||s.charAt(i)=='[' || s.charAt(i)==']'|| s.charAt(i)=='?'|| s.charAt(i)=='!'|| s.charAt(i)=='-'|| s.charAt(i)=='_')
   {
    a=a+1; 
   }
 }
 return a;
 
}
 
 public boolean findSubString(String s, String sub)
{
  boolean flag=false;
  int b=s.length();
  int x=sub.length();
  
  for(int i=0; i< b ; i++)
  {
    
   if(s.charAt(i) == sub.charAt(0))
   {
     int a=0;
    for(int j=i; j<i+x ; j++)
    {
     if(s.charAt(j) == sub.charAt(a))
     {
       flag=true;
       a=a+1;
     }
     else
     {
      flag=false; 
      a=a+1;
     }
    }
    
    if(flag==true)
    {
     break; 
    }
   }
    
  }
  return flag;
}

 
}
