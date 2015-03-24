/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.InventoryControl;
import exceptions.InventoryControlException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class CalcRaftCompletionView extends View {

    double people = Double.parseDouble("-1");
    double logsneeded = Double.parseDouble("-1");
    double logsininventory = Double.parseDouble("-1");
    double ropeneeded = Double.parseDouble("-1");
    double ropeininventory = Double.parseDouble("-1"); // variables
    double storageneeded = Double.parseDouble("-1");
    double storageininventory = -1;
    double raftcom = -1;

    public CalcRaftCompletionView(String promptMessage) {
        super("We will calculate our raft completion");
    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the if valid
        while (!valid) { // start while loop
            System.out.println("How many people will be on yoour raft?");
            try {
                this.people = Double.parseDouble(this.keyboard.readLine()); // people variable
            } catch (IOException ex) {
                Logger.getLogger(CalcRaftCompletionView.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (people > 9) {
                System.out.println("invalid number of people");
                continue;
            } else if (people < 1) {
                System.out.println("invalid number of people");
                continue;
            } else {
                System.out.println("Valid number of people.");
            }
            try {
                logsneeded = Double.parseDouble("10");
            } catch (NumberFormatException nf) {

                System.out.println("\nYou must enter a vailid number."
                        + "Try again.");
            }
            try {
                ropeneeded = Double.parseDouble("60");
            } catch (NumberFormatException nf) {

                System.out.println("\nYou must enter a vailid number."
                        + "Try again.");
            }
            try {
                storageneeded = Double.parseDouble("2");
            } catch (NumberFormatException nf) {

                System.out.println("\nYou must enter a vailid number."
                        + "Try again.");
            }

            System.out.println("How many logs do you have in your inventory?");
            try {
                this.logsininventory = Double.parseDouble(this.keyboard.readLine()); // logs variable
            } catch (IOException ex) {
                Logger.getLogger(CalcRaftCompletionView.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            try {
                this.ropeininventory = Double.parseDouble(this.keyboard.readLine()); // rope variable
            } catch (IOException ex) {
                Logger.getLogger(CalcRaftCompletionView.class.getName()).log(Level.SEVERE, null, ex);
            }
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
            try {
                this.storageininventory = Double.parseDouble(this.keyboard.readLine()); // storage variable
            } catch (IOException ex) {
                Logger.getLogger(CalcRaftCompletionView.class.getName()).log(Level.SEVERE, null, ex);
            }
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

        return "";
    }

    @Override
    public void doAction(Object value) {
        try {
            double raftcom = InventoryControl.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory); // call function
            System.out.println("Raft " + raftcom + "% completed");
        } catch (InventoryControlException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
