

package com.mycompany.edu.zuj.vp.week2;
    
import javax.swing.JOptionPane;  

public class EduZujVpWeek2 {

    
    /*  Write a GUI application that reads a number from the user, then shows the following menu:
1.CM to Inch 
2. ⁠Feet to Meter
    **/
    
      
    public static void main(String[] args) {
      
// 1- CM to Inch
        String number1 = JOptionPane.showInputDialog("enter number1 (CM)");
        double cm = Double.parseDouble(number1);
        double inche = cm / 2.54;
        JOptionPane.showMessageDialog(null, inche);

        // 3- Feet to Meter
        String number2 = JOptionPane.showInputDialog("enter number2 (Feet)");
        double feet = Double.parseDouble(number2);
        double meter = feet * 0.3048;
        JOptionPane.showMessageDialog(null, meter);
    


    }
}
