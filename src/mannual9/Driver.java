/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mannual9;

import javax.swing.JOptionPane;

/**
 *
 * @author muzammal computer
 */
public class Driver {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String input =JOptionPane.showInputDialog("Enter the String:");
    String option =JOptionPane.showInputDialog("Select the function to perform \n"+
                                           "1. Word Counter \n"+
                                           "2. Vowel Counter \n"+
                                           "3. Puncuation Counter \n"+
                                           "4. Find Sub String \n"+
                                           "5. Vertical displayer \n"+
                                           "6. Get rid of multiple blanks \n"+
                                           "7. Remove Integers \n"+
                                           "8. Encryptor \n"+
                                           "9. Search from STring \n"+
                                           "10.To upper case \n"+
                                           "11.To lower case \n"+
                                           "12.Length of the string \n"+
                                           "13.Hash code of string \n"+
                                           "14.Intern of String"); 
    
    
        int converted=Integer.parseInt(option);
        Task1 a =new Task1();
        Task2 b =new Task2();
        Task3 c =new Task3();
        Task4 d =new Task4();
        
        
        switch(converted)
        {
            case 1:
                int e=a.wordCounter(input);
                JOptionPane.showMessageDialog(null,"There are "+e+" number of words","Number of words",1);
                break;
            case 2:
                int f = a.vowelcounter(input);
                JOptionPane.showMessageDialog(null,"There are "+f+" number of vowels","Number of vowels",1);
                break;
            case 3:
                int g = a.puncCount(input);
                JOptionPane.showMessageDialog(null,"There are "+g+" number of punctuations","Number of punctuations",1);
                break;
            case 4:
                String sub = JOptionPane.showInputDialog("Enter the sub String:");
                boolean h = a.findSubString(input, sub);
                if(h==true)
                {
                      JOptionPane.showMessageDialog(null,"\""+sub+"\""+" is present in the String.","Finding",1);
                }
                else
                {
                      JOptionPane.showMessageDialog(null,"\""+sub+"\""+" is nt present in the String.","Finding",1);
                }
                break;
            case 5:
                b.displayVertical(input);
                break;
            case 6:
                c.ridMultipleBlank(input);
                break;
            case 7:
                c.removeInteger(input);
                break;
            case 8:
                c.Encryptor(input);
                break;
            case 9:
                d.SearcherFromString(input);
                break;
            case 10:
                d.UpperCase(input);
                break;
            case 11:
                d.LowerCase(input);
                break;
            case 12:
                d.lengthOfString(input);
                break;
            case 13:
                d.HashCodeOfString(input);
                break;
            case 14:
                d.InternOfString(input);
                break;
            case 15:
                
                break;    
        }
    }
    
}
