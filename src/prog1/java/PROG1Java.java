package prog1.java;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class PROG1Java {
    // universal variables that are called in methods used to determine set function for registration
    
    public static String userName;
    public static String passWord;
    public static String firstName;
    public static String lastName;
    
    public static void main(String[] args) {
       
        //Displays input information for the operating client.
        //System.out.println statements used to display information if needed to recall when logging in.
       firstName = JOptionPane.showInputDialog("Please enter your first name:");
        
       lastName = JOptionPane.showInputDialog("Please enter your last name:"); 
                             
     //calls methods to run in main to display conditioned information about each factor in the registration field. 
     checkUserName();
     checkPasswordComplexity();
     allConstructors();
     
     
      
    }    
    public static void checkUserName()
    {
    //method checks conditions of the username that was submitted.
    // displays the message if the conditions tested are true.    
   do{
            
        userName = JOptionPane.showInputDialog("Please enter a username that contains an underscore "
               + "and that is no longer than 5 characters in length:");
         
        
    if (userName.length()<=5 && userName.contains("_"))
    {
        JOptionPane.showMessageDialog(null,"Username successfully captured!");             
    }
    //Displays the false message if the conditions are not met.
    else
    {
        JOptionPane.showMessageDialog(null,"Username is not correctly formatted, "
                + "please ensure that your username contains an underscore"
                + " and is no longer that 5 characters in length. "); 
               
    }  
            }while(userName.length()>5 || !userName.contains("_")); 
      
    }
    
    
    public static void checkPasswordComplexity(){
        
        do{
    
          passWord = JOptionPane.showInputDialog("Please enter password that has a minimum of 8 charaters, "
               + "contains a capital letter, a number, a special character and no white spaces:");
        
           if(passWord.length()>7 && !passWord.contains(" ")&& passWord.matches(".*\\d.*") 
            && containsUpperCase(passWord) && containsSpecialCharacter(passWord) )
    {
        JOptionPane.showMessageDialog(null,"Password successfully captured!");
        
        
        
    } 
    //displays a message if the password conditions are not met.
    else
    {
     JOptionPane.showMessageDialog(null,"Password is not correctly formatted,"
              + "please ensure that your password contains at least 8 characters,"
              + " a special character, a capital letter and a number. ");
     
     
    }
    
    } while(passWord.length()<7 || passWord.contains(" ") || !passWord.matches(".*\\d.*") 
            || !containsUpperCase(passWord) || !containsSpecialCharacter(passWord));
        }
    

//method that runs through the password string checking if it contains a Capital letter.
    public static boolean containsUpperCase(String passWord)
    {
     char[] capital= passWord.toCharArray();
     
     for(char password: capital )
     {
       if (Character.isUpperCase(password))
       {
        return true;   
       }  
       
       }
        return false;
    }

    
    public static boolean containsSpecialCharacter(String passWord)
    {
        
    return Pattern.compile("[^a-zA-Z0-9]").matcher(passWord).find();
        
    }
    
    public static void allConstructors (){
        UserLogin user1 = new UserLogin (userName, passWord, firstName, lastName);
        TaskInput user2 = new TaskInput();
        
    }
    
    
    
    
    
      }

    
    
   


