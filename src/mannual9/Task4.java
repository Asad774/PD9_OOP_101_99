
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muneeb912
 */
public class Task4 {
    /**
     * Seracher the word from the string and tells
     * @param s
     * @return wether the word u serched is in the string or not
     */
       public boolean SearcherFromString(String s){
           String input;
           boolean flag=true;
           input=JOptionPane.showInputDialog(null,"Enter any word to Search from the Sentence");
           if(s.contains(input)){
              flag=true; 
           }else{
               flag=false;
           }
           return flag;
       }
       /**
        * Converts the string to upper case
        * @param s
        * @return the string in upper cse
        */
       public String UpperCase(String s) {
           String newString="";
           newString=s.toUpperCase();
           return newString;
       }
       /**
        * converts the string into lower case
        * @param s
        * @return the string in lower case
        */
       public String LowerCase(String s) {
           String newString="";
           newString=s.toLowerCase();
           return newString;
       }
       /**
        * Calculates the length of the string 
        * @param s
        * @return length of the string
        */
       public int lengthOfString(String s){
           int size=s.length();
           return size;
       }
       /**
        * Gives you the Hash code of the string
        * @param s
        * @return the Hash code of the string
        */
       public int HashCodeOfString(String s){
           int hashCode=s.hashCode();
           return hashCode;
       }
       /**
        * gives the intern of the string
        * @param s
        * @return the intern of hte string
        */
       public String InternOfString(String s){
           String internofString=s.intern();
           return internofString;
       }
}
