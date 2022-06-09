
package prog1.java;

import javax.swing.JOptionPane;


public class UserLogin {
    
    public static String userName2;
    public static String passWord2;
    
    UserLogin (String userName, String passWord, String firstName, String lastName){
        
      do{
        
        userName2 = JOptionPane.showInputDialog("Please enter your Username to LOGIN to your account:"); 
 
        passWord2 = JOptionPane.showInputDialog("Please enter your login Password:");
  
  
     
  if(userName.equals (userName2) && passWord.equals(passWord2))
  {
      
   JOptionPane.showMessageDialog(null,"A successful login");
   JOptionPane.showMessageDialog(null,"Welcome back "+ firstName +" "+lastName+" "+"it is great to see you again!");
      
  }
  //message displays if conditions are not met and password and username do not match.
  else
  {
      
    JOptionPane.showMessageDialog(null,"A failed login");
    JOptionPane.showMessageDialog(null,"Username or password incorrect,please try again.");
    
  }
} while(!userName.equals (userName2) && !passWord.equals(passWord2));
      }
        
        
        
        
        
        
        
    }
    
