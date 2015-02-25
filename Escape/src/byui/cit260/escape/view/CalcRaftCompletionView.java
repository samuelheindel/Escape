/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class CalcRaftCompletionView {
    public void displayCalcRaftCompletion() {
        int input = this.getInput(); // get user selection
        System.out.println("Raft " + input + "% completed");
    }
    private static int getInput() {
        boolean valid = false; // indicates if the if valid
        int people = -1;
        int logsneeded = -1;
        int logsininventory = -1;
        int ropeneeded = 0;
        int ropeininventory = -1; // variables
        int storageneeded = -1;
        int storageininventory = -1;
        int raftcom = -1;
        Scanner input = new Scanner(System.in);// to get input from user
        while (!valid) { // start while loop
            System.out.println("How many people will be on yoour raft?");
            people = input.nextInt(); // people variable
            if (people > 9) {
                System.out.println("invalid number of people");
                continue;
            } else if (people < 1) {
                System.out.println("invalid number of people");
                continue;
            } else {
                System.out.println("Valid number of people.");
            }
            logsneeded = people * 10;
            ropeneeded = people * 100;
            storageneeded = people * 2;

            System.out.println("How many logs do you have in your inventory?");
            logsininventory = input.nextInt(); // logs variable
            if (logsininventory > 100) {
                System.out.println("invalid number of logs.");
                continue;
            } else if (logsininventory < 0) {
                System.out.println("invalid number of logs.");
                continue;
            } else {
                System.out.println("Valid number of logs.");
            }
            System.out.println("How much rope do you have in your inventory?");
            ropeininventory = input.nextInt(); // rope variable
            if (ropeininventory > 600) {
                System.out.println("invalid amount of rope.");
                continue;
            } else if (ropeininventory < 0) {
                System.out.println("invalid amount of rope.");
                continue;
            } else {
                System.out.println("Valid amount of rope.");
            }
            System.out.println("How many storage crates do you have in your inventory?");
            storageininventory = input.nextInt(); // storage variable
            if (storageininventory > 29) {
                System.out.println("invalid number of srorage crates.");
                continue;
            } else if (storageininventory < 0) {
                System.out.println("invalid number of srorage crates.");
                continue;
            } else {
                System.out.println("Valid number of srorage crates.");
            }
            break; // out of the (exit) the repetition
        }
        raftcom = InventoryControl.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory); // call function
        return raftcom; //return raftcom to input variable in display
    }
}