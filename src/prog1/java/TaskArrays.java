package prog1.java;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.List;

public class TaskArrays {

    public static int optSelect;
    public static int numTasks;

    TaskArrays() {
        //promts the user to enter the number tasks they would like to save, this converts the number of tasks entered into number of elements in the array

        numTasks = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number tasks you would like to assign:"));

        String[] devDetails = new String[numTasks];
        String[] nameTask = new String[numTasks];
        int[] timeHrs = new int[numTasks];
        String[] taskStatus = new String[numTasks];
        String[] taskID = new String[numTasks];

        //the number of tasks entered will determine how many times the for loop repeats
        for (int x = 0; x < numTasks; x++) {
            //each prompt saves data in each array
            devDetails[x] = JOptionPane.showInputDialog("Please enter the name and surname of the assigned developer:");

            nameTask[x] = JOptionPane.showInputDialog("Please enter the name of the assigned task:");

            taskID[x] = JOptionPane.showInputDialog("Please enter the Task ID of the assigned task:");

            timeHrs[x] = Integer.parseInt(JOptionPane.showInputDialog("Please enter the time duration(in hours)of the assigned task:"));

            taskStatus[x] = JOptionPane.showInputDialog("Please enter the current status of the assigned task> "
                    + "Type: To do | Doing | Done");

        }
        //do while loop and switch case enables user to re select a menu option as well as return to the main menu and quit the program
        do {

            optSelect = Integer.parseInt(JOptionPane.showInputDialog("please select a report option number:"
                    + "Option 1 > Longest task duration|"
                    + "Option 2 > Display All task details|"
                    + "Option 3 > Display All Completed task detials|"
                    + "Option 4 > Search for developer for task info|"
                    + "Option 5 > Delete Task information|"
                    + "Option 6 > Search Task names|"
                    + "Option 7 > Return to main menu|"));

            switch (optSelect) {

                case 1: //option 1- displays the developer with the longest task duration

                    JOptionPane.showMessageDialog(null, "You have selected to view the task with the longest time allocation.");
                    longDevDuration(timeHrs, devDetails);

                    break;

                case 2:// option 2 - displays all developer and task details

                    allTaskDetails(timeHrs, devDetails, taskStatus, nameTask, taskID);

                    break;

                case 3://all completed tasks

                    completedTasks(devDetails, nameTask, taskStatus, timeHrs);

                    break;

                case 4://option 3- Displays the Search for tasks assigned to a developer   

                    String devName = JOptionPane.showInputDialog("Please enter a developer name you would like to search for.");

                    devSearch(devName, devDetails, nameTask, taskStatus);

                    break;

                case 5://option 5- alows the user to delete task informaton

                    taskDeletion(numTasks, taskID, timeHrs, devDetails, nameTask, taskStatus);

                    break;

                case 6: //option 6- allows user to Search Task name for task details

                    String nameInput = JOptionPane.showInputDialog("Please enter a valid task name to view task deatials:");

                    SearchFunction(nameInput, devDetails, nameTask, taskStatus, timeHrs);

                    break;

                case 7://takes the user back to the main menu

                    JOptionPane.showInternalMessageDialog(null, "Main menu loading...");

                    break;

                default://this message will dispaly if the user does not select 1 of the 7 options displayed
                    JOptionPane.showMessageDialog(null, "You have selected an invalid option. "
                            + "Please ensure you select one of the given options.");
                    break;
            }
        } while (optSelect != 7);

    }

    //method used to determine the task with the longest time duration as well as linking the devloper to the task duration
    public static void longDevDuration(int[] timeHrs, String[] devDetails) {

        int c;
        int highestDuration = timeHrs[0];//initilizes the array 

        for (c = 0; c < timeHrs.length; c++) {

            if (timeHrs[c] > highestDuration) {
                highestDuration = timeHrs[c];
            }
            //JOptionPane displays processed array element when it passes the conditions as well as the for loop
            JOptionPane.showMessageDialog(null, "The task with the longest time duration to complete>>" + highestDuration + "|-Developer" + devDetails[c]);

        }

    }

    //method enables the display of all elements of all arrays in this task  
    public static void allTaskDetails(int timeHrs[], String devDetails[], String taskStatus[], String nameTask[], String taskID[]) {

        JOptionPane.showMessageDialog(null, "Tasks available to view:");

        //forloop runs through all the elements and displays them to its corrisponding array 
        for (int q = 0; q < devDetails.length; q++) {

            JOptionPane.showMessageDialog(null, "Developer:" + devDetails[q]);
            JOptionPane.showMessageDialog(null, "Task Names:" + nameTask[q]);
            JOptionPane.showMessageDialog(null, "Task Status:" + taskStatus[q]);
            JOptionPane.showMessageDialog(null, "Task time duration:" + timeHrs[q]);
            JOptionPane.showMessageDialog(null, "Task ID:" + taskID[q]);

            //system.out.println allows for an easier analysis of the array elements   
            System.out.println("Developer:" + devDetails[q]);
            System.out.println("Task Names:" + nameTask[q]);
            System.out.println("Task Status:" + taskStatus[q]);
            System.out.println("Task time duration:" + timeHrs[q]);
            System.out.println("Task ID:" + taskID[q]);

        }

    }

    //method allows the user to remove an element index from the array list 
    public static void taskDeletion(int numTasks, String[] taskID, int[] timeHrs, String[] devDetails, String[] nameTask, String[] taskStatus) {

        List<String> deleteList = Arrays.asList(nameTask);//initialises and calls for the array list inorder to delete an index element

        String clientDeletion = JOptionPane.showInputDialog("Enter the task name you would"
                + " like to delete from the list of tasks");

        deleteList.remove(clientDeletion);

        JOptionPane.showMessageDialog(null, "The task you entered has been deleted successfully.");

    }

    //method used to  search for task details by entering a valid task name 
    public static void SearchFunction(String nameInput, String devDetails[], String nameTask[], String taskStatus[], int timeHrs[]) {

        for (int b = 0; b < nameTask.length; b++) {

            //if statement parameterised in order to determine if the task name the user entered exists     
            if (nameTask[b].equalsIgnoreCase(nameInput)) {

                JOptionPane.showMessageDialog(null, "Task name:>>" + nameTask[b]);
                JOptionPane.showMessageDialog(null, "Developer:>>" + devDetails[b]);
                JOptionPane.showMessageDialog(null, "Task Status:>>" + taskStatus[b]);
                JOptionPane.showMessageDialog(null, "Time duration of task:>>" + timeHrs[b]);

                System.out.println("Task name:" + nameTask[b]);
                System.out.println("Developer:" + devDetails[b]);
                System.out.println("Task Status:" + taskStatus[b]);
                System.out.println("Time duration of task:" + timeHrs[b]);

            } // error message is displayed if the task name is incorrect         
            else {

                JOptionPane.showMessageDialog(null, "Task name is invalid and is not found, please ensure "
                        + "you enter a valid Task name.");
            }

        }

    }

    //method that allows for a user to search for task information when a valid developer name is entered 
    public static void devSearch(String devName, String devDetails[], String nameTask[], String taskStatus[]) {

        for (int e = 0; e < devDetails.length; e++) {

            //if statement is condistioned to ensure an existing developer name is entered 
            if (devDetails[e].equalsIgnoreCase(devName)) {

                JOptionPane.showMessageDialog(null, "Developer:>>" + devDetails[e]);
                JOptionPane.showMessageDialog(null, "Task Status:>>" + taskStatus[e]);
                JOptionPane.showMessageDialog(null, "Task name:>>" + nameTask[e]);

                System.out.println("Developer:" + devDetails[e]);
                System.out.println("Task Status:" + taskStatus[e]);
                System.out.println("Task name" + nameTask[e]);

            } //error message is displayed if the developer name is invalid        
            else {

                JOptionPane.showMessageDialog(null, "Developer name is invalid and is not found, please ensure "
                        + "you enter a valid developer name.");
            }

        }

    }

    // method allows the user to view all tasks that have been completed with the task status of "Done"
    public static void completedTasks(String devDetails[], String nameTask[], String taskStatus[], int timeHrs[]) {

        JOptionPane.showMessageDialog(null, "Tasks that have been completed>>");
        System.out.println("Tasks that have been completed:");

        int d;
        //string variable initialised to test the taskStatus Array for "Done" tasks
        String compClass = ("Done");
        for (d = 0; d < taskStatus.length; d++) {
            //if statement parameterised in order to determine if a task has been complted if it is it displays the completed task along with task detaisl.
            if (taskStatus[d].equalsIgnoreCase(compClass)) {

                JOptionPane.showMessageDialog(null, "Task name:>>" + nameTask[d]);
                JOptionPane.showMessageDialog(null, "Developer:>>" + devDetails[d]);
                JOptionPane.showMessageDialog(null, "Task Status:>>" + taskStatus[d]);
                JOptionPane.showMessageDialog(null, "Time duration of task:>>" + timeHrs[d]);

                System.out.println("Task name:" + nameTask[d]);
                System.out.println("Developer:" + devDetails[d]);
                System.out.println("Task Status:" + taskStatus[d]);
                System.out.println("Time duration of task:" + timeHrs[d]);

            } //else statement displays message if there are no completed tasks
            else {

                JOptionPane.showMessageDialog(null, "There are no completed tasks as of yet.");
            }

        }

    }

}
