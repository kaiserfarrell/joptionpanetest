/*
 * Developer: kaiserfarrell
 * Program Title: JOptionPane class
 */
package joptionpanetest;
import javax.swing.JOptionPane;
/**
 *
 * @author kaiserfarrell
 */
public class JOptionPaneTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name, ageString, outputMessage;
        int age;
        
        name    =JOptionPane.showInputDialog("Please enter your name : ");
        ageString   = JOptionPane.showInputDialog("Please enter your age : ");
        age         = Integer.valueOf(ageString);
        outputMessage = "Your name is " + name + " and your age is " +age;
        JOptionPane.showMessageDialog( null, outputMessage );
        System.exit(0);// terminate Gui thread
        
    }// end main
}//end class
