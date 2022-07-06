/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package prog1.java;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danie
 */
public class TaskArraysTest {
    
    public TaskArraysTest() {
    }

    /**
     * Test of longDevDuration method, of class TaskArrays.
     */
    @Test
    public void testLongDevDuration() {
        System.out.println("longDevDuration");
        int[] timeHrs = null;
        String[] devDetails = null;
        TaskArrays.longDevDuration(timeHrs, devDetails);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of allTaskDetails method, of class TaskArrays.
     */
    @Test
    public void testAllTaskDetails() {
        System.out.println("allTaskDetails");
        int[] timeHrs = null;
        String[] devDetails = null;
        String[] taskStatus = null;
        String[] nameTask = null;
        String[] taskID = null;
        TaskArrays.allTaskDetails(timeHrs, devDetails, taskStatus, nameTask, taskID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of taskDeletion method, of class TaskArrays.
     */
    @Test
    public void testTaskDeletion() {
        System.out.println("taskDeletion");
        int numTasks = 0;
        String[] taskID = null;
        int[] timeHrs = null;
        String[] devDetails = null;
        String[] nameTask = null;
        String[] taskStatus = null;
        TaskArrays.taskDeletion(numTasks, taskID, timeHrs, devDetails, nameTask, taskStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SearchFunction method, of class TaskArrays.
     */
    @Test
    public void testSearchFunction() {
        System.out.println("SearchFunction");
        String nameInput = "";
        String[] devDetails = null;
        String[] nameTask = null;
        String[] taskStatus = null;
        int[] timeHrs = null;
        TaskArrays.SearchFunction(nameInput, devDetails, nameTask, taskStatus, timeHrs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of devSearch method, of class TaskArrays.
     */
    @Test
    public void testDevSearch() {
        System.out.println("devSearch");
        String devName = "";
        String[] devDetails = null;
        String[] nameTask = null;
        String[] taskStatus = null;
        TaskArrays.devSearch(devName, devDetails, nameTask, taskStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completedTasks method, of class TaskArrays.
     */
    @Test
    public void testCompletedTasks() {
        System.out.println("completedTasks");
        String[] devDetails = null;
        String[] nameTask = null;
        String[] taskStatus = null;
        int[] timeHrs = null;
        TaskArrays.completedTasks(devDetails, nameTask, taskStatus, timeHrs);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
