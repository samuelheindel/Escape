/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.GameControl;
import byui.cit260.escape.control.InventoryControl;
import byui.cit260.escape.model.Inventory;
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

    Inventory[] inventoryValues = escape.Escape.getCurrentGame().getInventory();
    double people = Double.parseDouble("4");
    double logsneeded = Double.parseDouble("-1");
    double logsininventory = inventoryValues[0].getQuantity();
    double ropeneeded = Double.parseDouble("-1");
    double ropeininventory = inventoryValues[1].getQuantity();
    double storageneeded = Double.parseDouble("-1");
    double storageininventory = inventoryValues[2].getQuantity();
    double raftcom = -1;

    public CalcRaftCompletionView(String promptMessage) {
        super("We will calculate our raft completion");
    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the if valid
        while (!valid) { // start while loop
            try {
                logsneeded = people * Double.parseDouble("10");
            } catch (NumberFormatException nf) {

                ErrorView.display(this.getClass().getName(), "\nYou must enter a vailid number."
                        + "Try again.");
            }
            try {
                ropeneeded = people * Double.parseDouble("60");
            } catch (NumberFormatException nf) {

                ErrorView.display(this.getClass().getName(), "\nYou must enter a vailid number."
                        + "Try again.");
            }
            try {
                storageneeded = people * Double.parseDouble("2");
            } catch (NumberFormatException nf) {

                ErrorView.display(this.getClass().getName(), "\nYou must enter a vailid number."
                        + "Try again.");
            }

            break; // out of the (exit) the repetition
        }

        return "";
    }

    @Override
    public boolean doAction(Object value) {
        try {
            double raftcom = InventoryControl.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory); // call function
            this.console.println("Raft " + raftcom + "% completed");
        } catch (InventoryControlException ex) {
            this.console.println(ex.getMessage());
        }
        return true;

    }
}
