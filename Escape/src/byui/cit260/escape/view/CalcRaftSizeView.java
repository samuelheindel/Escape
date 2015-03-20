/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.InventoryControl;
import exceptions.InventoryControlException;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class CalcRaftSizeView {

    public void displayCalcRaftSize() throws InventoryControlException {
        double input = this.getInput(); // get user selection
        System.out.println("Your raft needs to be " + input + " Square feet");
    }

    private static double getInput() throws InventoryControlException {
        boolean valid = false; // indicates if the if valid
        double people = Double.parseDouble("-1");
        double storagecrates = Double.parseDouble("-1");
        Scanner input = new Scanner(System.in);// to get input from user
        while (!valid) { // start while loop
            System.out.println("How many people will be on yoour raft?");
            people = input.nextDouble(); // people variable
            if (people > 9) {
                throw new InventoryControlException("to many people");
            } else if (people < 1) {
                throw new InventoryControlException("to few people");
            } else {
                System.out.println("Valid number of people.");
            }

            System.out.println("How many storage crates will you need? at least 2 per person.");
            storagecrates = input.nextDouble(); // storage variable
            if (storagecrates > 29) {
                throw new InventoryControlException("to many storage crates");
            } else if (storagecrates < 1) {
                throw new InventoryControlException("to few storage crates");
            } else {
                System.out.println("Valid number of srorage crates.");
            }
            break; // out of the (exit) the repetition
        }
        double raftsize = InventoryControl.calRaftSize(people, storagecrates); // call function
        return raftsize; //return raftcom to input variable in display
    }
}
