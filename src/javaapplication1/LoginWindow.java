/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javaapplication1;

import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author jsaunders
 */
public class LoginWindow {
    
    GUIprogram mainProgram;
    Credentials passcode;
    
    String y = mainProgram.getSentM();
    
    
   /*
    Retrieves the UserName from the login screen
    */
    public String getUserName(){
        String uN = mainProgram.getUserName();
        return uN;
    }
    
    /*
    Retrieves the Password from the login screen
    using teh Credentials class to obtain a plain text string of the password
    */
    
    public String getPassword(){
        String pwd = passcode.getPassword(mainProgram.getPassword());
        return pwd;
    }
        public boolean credentials(){
            //if(control.loginRequest()==true){
                return true;
//           // }
//            else{
//                return false;
//            }
        }
       
    
    
    
            
    
    
    

    
 }  
    
    
 
