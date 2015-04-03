/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.ActionControl;
import byui.cit260.escape.control.GameControl;
import byui.cit260.escape.control.GatherControl;
import byui.cit260.escape.model.Inventory;
import byui.cit260.escape.model.Location;
import byui.cit260.escape.model.Player;
import escape.Escape;
import exceptions.VolcanoControlException;
import java.awt.Point;
import static javafx.scene.input.KeyCode.G;

/**
 *
 * @author samuel
 */
public class GatherView extends View {

    public GatherView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n   |Gather Resource|                        "
                + "\n--------------------------------------------"
                + "\nG - Gather Resource                         "
                + "\nE - Exit                                    "
                + "\n--------------------------------------------");
    }

    @Override
    public boolean doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'G':
                this.gatherResource();
                break;
            case 'E':
                return true;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
        }
        return false;

    }
    String value = "G";

    private void gatherResource() {
        try {
            Player player = Escape.getCurrentGame().getPlayer();
            // Get the Player location
            Point coordinate = player.getCoordinates();
            Location[][] locations = Escape.getCurrentGame().getMap().getLocations();
            // Get the Scene
            String sceneSymbol = locations[coordinate.x][coordinate.y].getScene().getSymbol();
            Inventory[] inventory = Escape.getCurrentGame().getInventory();
            double invenqua1 = inventory[0].getQuantity();
            double invenqua2 = inventory[1].getQuantity();
            double invenqua3 = inventory[4].getQuantity();
            double invenqua4 = inventory[5].getQuantity();

            Double amount = GatherControl.gatherRe(value);
            if (sceneSymbol == "PT" & invenqua1 < 240) {
                this.console.println("you added " + amount + " logs to your inventory");
            } 
            
            else if (sceneSymbol == "PT" & invenqua1 == 240) {
                this.console.println("This part of your inventory is full");
            } 
            
            else if (sceneSymbol == "FR" & invenqua2 < 400) {
                this.console.println("you added " + amount + " yards of rope to your inventory");
            } 
            
            else if (sceneSymbol == "FR" & invenqua2 == 400) {
                this.console.println("This part of your inventory is full");
            } 
            
            else if (sceneSymbol == "FT" & invenqua3 < 16) {
                this.console.println("you added " + amount + " pound of fruit to your inventory");
            } 
            
            else if (sceneSymbol == "FT" & invenqua3 == 16) {
                this.console.println("This part of your inventory is full");
            } 
            
            else if (invenqua4 < 20 & sceneSymbol == "RI") {
                this.console.println("you added " + amount + " gallon of water to your inventory");
            } 
            
            else if (invenqua4 == 20 & sceneSymbol == "RI") {
                this.console.println("This part of your inventory is full");
            } 
            
            else {
                this.console.println("You were not able to gather anything in this location");
            }
            
            
        } catch (VolcanoControlException vc) {
            this.console.println("VolcanoControl, error in countdown" + vc.getMessage());
        }
    }
}
