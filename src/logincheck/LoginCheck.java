/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logincheck;

import javax.swing.JOptionPane;
/**
 *
 * @author msh32
 */
public class LoginCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String M1,M2;
         
        M1=JOptionPane.showInputDialog("Name  "+"الاسم:");
        M2=JOptionPane.showInputDialog("Password  "+"الرقم السري :");
        M1=M1.toUpperCase();                                   // make it not sensitive for letter case
        
        int CM2;                                       
        CM2=Integer.parseInt(M2);                              // convert the String M2 to integer.
       
       if ("MHMD".equals(M1) && CM2==123){
           
           
       JOptionPane.showMessageDialog(null,"Welcome  "+M1+"  مرحبا بك يـا  ");
       }
       
       else {
       
       JOptionPane.showMessageDialog(null, "the Name or Password not correct,  "+"الأسم المدخل أو الرقم غير صحيح");
       }
    }
    
}
