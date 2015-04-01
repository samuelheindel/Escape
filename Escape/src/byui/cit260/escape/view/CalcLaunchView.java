/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.InventoryControl;
import byui.cit260.escape.model.Inventory;
import exceptions.InventoryControlException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class CalcLaunchView extends View {

    Inventory[] inventoryValues = escape.Escape.getCurrentGame().getInventory();
    double people = Double.parseDouble("4");
    double logsneeded = Double.parseDouble("-1");
    double logsininventory = inventoryValues[0].getQuantity();
    double ropeneeded = Double.parseDouble("-1");
    double ropeininventory = inventoryValues[1].getQuantity();
    double storageneeded = Double.parseDouble("-1");
    double storageininventory = inventoryValues[2].getQuantity();
    double raftcom = -1;
    double meat = inventoryValues[5].getQuantity();
    double meatneeded = Double.parseDouble("-1");
    double fruit = inventoryValues[4].getQuantity();
    double fruitneeded = Double.parseDouble("-1");

    public CalcLaunchView(String promptMessage) {
        super("We need to do some calculations");
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

            try {
                meatneeded = people * Double.parseDouble("3");
            } catch (NumberFormatException nf) {

                ErrorView.display(this.getClass().getName(), "\nYou must enter a vailid number."
                        + "Try again.");
            }
            try {
                fruitneeded = people * Double.parseDouble("4");
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
            double storagecom = InventoryControl.calStorageNeeded(people, meatneeded, meat, fruitneeded, fruit);
            double completion = (raftcom / 50) + (storagecom / 50);
            this.console.println("you launched the raft " + completion + " completed");
            if (completion < 100) {
                this.console.println("You launched your raft to soon, It was either incompete or you had"
                        + "\n too few supllies. You died at sea."
                        + "\n GAME OVER!");
                StartProgramView startProgramView = new StartProgramView("");
                startProgramView.display();
            } else if (completion > 99) {
                this.console.println("You Succeded in launching a complete well stocked raft!"
                        + "\n Congradulations You win! Good luck at sea. ");
                StartProgramView startProgramView = new StartProgramView("");
                startProgramView.display();
            }
        } catch (InventoryControlException ex) {
            this.console.println(ex.getMessage());
        }
        return true;

    }
}
