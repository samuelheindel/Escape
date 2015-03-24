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
public class CalcRaftSizeView extends View {

    double people = Double.parseDouble("-1");
    double storagecrates = Double.parseDouble("-1");

    public CalcRaftSizeView(String promptMessage) {
        super("We will calculate your raft size");
    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the if valid

        while (!valid) { // start while loop
            System.out.println("How many people will be on yoour raft?");
            try {
                this.people = Double.parseDouble(this.keyboard.readLine()); // people variable
            } catch (IOException ex) {
                Logger.getLogger(CalcRaftSizeView.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (people > 9) {
                System.out.println("to many people");
                continue;
            } else if (people < 1) {
                System.out.println("to few people");
                continue;
            } else {
                System.out.println("Valid number of people.");
            }

            System.out.println("How many storage crates will you need? at least 2 per person.");
            try {
                this.storagecrates = Double.parseDouble(this.keyboard.readLine()); // storage variable
            } catch (IOException ex) {
                Logger.getLogger(CalcRaftSizeView.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (storagecrates > 29) {
                System.out.println("to many storage crates");
                continue;
            } else if (storagecrates < 1) {
                System.out.println("to few storage crates");
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
            double raftsize = InventoryControl.calRaftSize(this.people, this.storagecrates); // call function
            System.out.println("Your raft needs to be " + raftsize + " Square feet");
        } catch (InventoryControlException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
