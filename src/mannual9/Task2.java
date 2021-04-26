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
public class Task2 {
    /**
     * displays the input string ion versicle
     * no return type as function is void
     * @param s 
     */
        void VerticleStringDisplayer(String s){
        char ch_a[]=s.toCharArray();
        int size=ch_a.length;
        for(int i=0;i<size;i++){
            System.out.print(ch_a[i]+"\n");
        }
        }
        
        
        
        public void displayVertical(String s)
  {
    int b=s.length(); 
    System.out.println("Your sentence printed vertically is:");
    for(int i=0; i<b; i++)
    {
     if(s.charAt(i)!=' ')
     {
      System.out.println(s.charAt(i)); 
     }
     
    }
    
  }
        
        
}
