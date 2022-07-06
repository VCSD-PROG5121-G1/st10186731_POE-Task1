
package prog1.java;

import javax.swing.JOptionPane;


public class TaskInput {
    
public static String descTask;
public static String statusTask;
public static int optChoice;
public static int addTask;
public static String nameSurnameDev;
public static String nameTask;
public static int durTask;
public static int totalDurTasks;
public static String taskID;
public static int devStatusTask;

 TaskInput(){
   
 JOptionPane.showMessageDialog(null,"Welcome to EasyKanban.");
 
 //variables called for counters
 totalDurTasks = 0;
        durTask = 0;
        int countingTheTask =0;
        
        
        // do while loop to return to main menu once each action has taken place
 do{
     //menu displays options for the user to select 
  optChoice = Integer.parseInt(JOptionPane.showInputDialog("Please select an Option:"
         + "| Option 1 > ADD TASKS "
         + "| Option 2 > SHOW REPORT "
         + "| Option 3 > QUIT PROGRAM"));
     
    //used ot determine each case selected only 3 cases possible 
    switch(optChoice){
        
    case 1 :
                
       addTask = Integer.parseInt(JOptionPane.showInputDialog("Please enter the total number"
               + " of tasks you would like to assign:"));
      // runs the program that runs the add task function for as many tasks as the user inputs  
      for (int d=0; d<addTask; d++){
          
          countingTheTask++;
          
      nameTask = JOptionPane.showInputDialog("Please enter the name of the assigned task:");
      
     do{
         
       descTask = JOptionPane.showInputDialog("Please enter a DESCRIPTION"
               + " of the assigned task that does not eceed 50 characters in length:"); 
       //tests conditions set in the string of description
       if(descTask.length ()<= 50){
           
        JOptionPane.showMessageDialog(null," Task Description has been successfully captured.");
        
       }
       //displays negative outcome
       else {
           
         JOptionPane.showMessageDialog(null,"Description has failed to capture. "
                 + "Please ensure that the description is no longer than 50 words.");  
           
       }  //while loop repeats if statement if the variable entered does not meat the required conditions of the method 
     }while (descTask.length()>50);
     
     
     //prompts the user to input the developers name and surname
       nameSurnameDev = JOptionPane.showInputDialog("Please enter the name and surname of"
              + " the developer that is assigned to the task:");
             
                   
       durTask = Integer.parseInt(JOptionPane.showInputDialog("PLease enter the total time"
              + " duration of the task (in hours)"));
       //functions as it adds up the total number of hours it would take for the assignments 
       totalDurTasks += durTask;
       
       taskID = nameTask.substring(0, 2).toUpperCase()+ ":" + addTask + ":" + nameSurnameDev.substring(0, 3).toUpperCase();
      JOptionPane.showMessageDialog(null,"Your Task ID>>"+taskID);   
       
     do{ 
         //menu that allows the user to select a task status
       devStatusTask = Integer.parseInt(JOptionPane.showInputDialog("Please enter the current status "
              + "of the assigned task select an Option number:\t|"
              + "Option 1 > To Do \t |"
              + "Option 2 > Doing \t |"
              + "Option 3 > Done"));
       
      //if else statement runs through the selected option and selects an apropriate outcome  
       if(devStatusTask == 1){
                 
         JOptionPane.showMessageDialog(null,"To do");
         statusTask = ("To do");
       }
       
       else if (devStatusTask == 2) {
         
          JOptionPane.showMessageDialog(null,"Doing");
          statusTask = ("Doing");
       }
       
       else if (devStatusTask == 3) {
          
           JOptionPane.showMessageDialog(null,"Done");
           statusTask = ("Done");
           
       }//else displays negative outcome if the user entered an invalid option
       else{
           
          JOptionPane.showMessageDialog(null,"You have selected an ivalid option. "
                    + "Please select a valid option for task status in the menu provided."); 
       }
        
     }while(devStatusTask > 3 || devStatusTask < 1);
     
     
     // JOptionPane displays all information enetred within this program
     JOptionPane.showMessageDialog(null,"Task Details: Task Name:|"+ nameTask +"\t| Task Description:|"+ descTask);
     JOptionPane.showMessageDialog(null,"Task Details: Task developers name:|"+ nameSurnameDev +"\t| Task status:|"
                                         + ""+ statusTask +"|Time duration:|"+ durTask );
     JOptionPane.showMessageDialog(null,"Task Details:Total duration:|"+ totalDurTasks +"Hrs|Task ID:|"+taskID);
     
     
     }
        break;
        
           
              
       
    case 2 :
        //construct class contains the method procces the Arrays that are initialized to capture and display the neccessary information that is requested.
        JOptionPane.showMessageDialog(null,"you have selected to view Task Report");
        TaskArrays user3 = new TaskArrays ();
        
          //JOptionPane.showMessageDialog(null,"Feature comming soon!!!");
     
       break;
       
                   
       
       
    case 3 :
        
       JOptionPane.showMessageDialog(null,"Thank you for useing EasyKanban.We anticipate your return.");
       
       break;
       
      //ends the program 
    default:
        JOptionPane.showMessageDialog(null,"You have selected and invalid option. "
            + "Please ensure you select one of the given options.");
        break;
    }
    //returns to the main menu if any option wasn't selected 
 }while(optChoice != 3);       
 
          
 
}
} 
 
  
 

    

