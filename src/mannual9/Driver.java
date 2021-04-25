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
    String option;
    do{
    option =JOptionPane.showInputDialog("Select the function to perform \n"+
                                           "1.  Word Counter \n"+
                                           "2.  Vowel Counter \n"+
                                           "3.  Puncuation Counter \n"+
                                           "4.  Find Sub String \n"+
                                           "5.  Vertical displayer \n"+
                                           "6.  Get rid of multiple blanks \n"+
                                           "7.  Remove Integers \n"+
                                           "8.  Encryptor \n"+
                                           "9.  Search from STring \n"+
                                           "10. To upper case \n"+
                                           "11. To lower case \n"+
                                           "12. Length of the string \n"+
                                           "13. Hash code of string \n"+
                                           "14. Intern of String\n"+
                                           "15. Exits"); 
    
    
        //int converted=Integer.parseInt(option);
        Task1 a =new Task1();
        Task2 b =new Task2();
        Task3 c =new Task3();
        Task4 d =new Task4();
        
        
        switch(option)
        {
            case "1":
                JOptionPane.showMessageDialog(null,"Total Words in the Sentence : "+a.Words_Counter(input));
                break;
            case "2":
                JOptionPane.showMessageDialog(null,"Total Vowels in the Sentence : "+a.vowelcounter(input));
                break;
            case "3":
                 JOptionPane.showMessageDialog(null,"Total Punctuations in the Sentence : "+a.puncCount(input));
                break;
            case "4":
                String sub = JOptionPane.showInputDialog("Enter the sub String:");
                a.findSubString(input, sub);
                break;
            case "5":
                b.displayVertical(input);
                break;
            case "6":
                JOptionPane.showMessageDialog(null,"Sentence without Spaces : "+c.ridMultipleBlank(input));
                break;
            case "7":
                JOptionPane.showMessageDialog(null,"Sentence without Integers is : "+c.removeInteger(input));
                break;
            case "8":
                JOptionPane.showMessageDialog(null,"Sentence in Encrypted Form is : "+c.Encryptor(input));
                break;
            case "9":
                if(d.SearcherFromString(input)){
                    JOptionPane.showMessageDialog(null,"Found");
                }else{
                    JOptionPane.showMessageDialog(null,"Not Found");
                }
                break;
            case "10":
                JOptionPane.showMessageDialog(null,"Sentence in Uppercase will be : "+d.UpperCase(input));
                break;
            case "11":
                JOptionPane.showMessageDialog(null,"Sentence in Lowercase will be : "+d.LowerCase(input));
                break;
            case "12":
                JOptionPane.showMessageDialog(null,"Sentence in Lowercase will be : "+d.LowerCase(input));
                break;
            case "13":
                JOptionPane.showMessageDialog(null,"Hash Code of sentence is : "+d.HashCodeOfString(input));
                break;
            case "14":
                JOptionPane.showMessageDialog(null,"Intern of sentence is : "+d.InternOfString(input));
                break;
               
        }
    
    }while(!"15".equals(option));
    
}
}
