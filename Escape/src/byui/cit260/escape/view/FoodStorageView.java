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
public class FoodStorageView extends View {

    Inventory[] inventoryValues = escape.Escape.getCurrentGame().getInventory();
    double people = Double.parseDouble("-1");
    double meat = inventoryValues[5].getQuantity();
    double meatneeded = Double.parseDouble("-1");
    double fruit = inventoryValues[4].getQuantity();
    double fruitneeded = Double.parseDouble("-1");

    public FoodStorageView(String promptMessage) {
        super("We will calculate the Food storage you have");
    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the if valid

        while (!valid) { // start while loop
             this.console.println("How many people will be on yoour raft?");
            try {
                this.people = Double.parseDouble(this.keyboard.readLine()); // people variable
            } catch (IOException ex) {
                Logger.getLogger(CalcRaftCompletionView.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (people > 9) {
                ErrorView.display(this.getClass().getName(), "to many people");
                continue;
            } else if (people < 1) {
                ErrorView.display(this.getClass().getName(), "to few people");
                continue;
            } else {
                this.console.println("Valid number of people.");
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
            double storageneeded = InventoryControl.calStorageNeeded(people, meatneeded, meat, fruitneeded, fruit); // call function
            this.console.println("Your food storage is " + storageneeded + "% complete ");
        } catch (InventoryControlException ex) {
            this.console.println(ex.getMessage());
        }
        return true;
    }
}
