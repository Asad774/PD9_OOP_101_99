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
                a.wordCounter(input);
                break;
            case 2:
                a.vowelcounter(input);
                break;
            case 3:
                a.puncCount(input);
                break;
            case 4:
                String sub = JOptionPane.showInputDialog("Enter the sub String:");
                a.findSubString(input, sub);
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
                
                break;
            case 9:
                
                break;
            case 10:
                
                break;
            case 11:
                
                break;
            case 12:
                
                break;
            case 13:
                
                break;
            case 14:
                
                break;
            case 15:
                
                break;    
        }
    }
    
}
