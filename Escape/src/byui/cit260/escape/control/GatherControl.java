/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.control;

import byui.cit260.escape.model.Inventory;
import byui.cit260.escape.model.Location;
import byui.cit260.escape.model.Player;
import escape.Escape;
import java.awt.Point;

/**
 *
 * @author Kale
 */
public class GatherControl {

    public static double gatherRe(String ch) {
        // Get the Player
        Player player = Escape.getCurrentGame().getPlayer();
        // Get the Player location
        Point coordinate = player.getCoordinates();
        Location[][] locations = Escape.getCurrentGame().getMap().getLocations();
        // Get the Scene
        String sceneSymbol = locations[coordinate.x][coordinate.y].getScene().getSymbol();
        double sceneAmount = locations[coordinate.x][coordinate.y].getScene().getAmount();
        Inventory[] InventoryList = Escape.getCurrentGame().getInventory();
        double newamount = 0;

        if (sceneSymbol == "PT") {
            if (ch == "G") {
                if (InventoryList[0].getQuantity() < 240) {
                    newamount = InventoryList[0].getQuantity() + sceneAmount;
                    InventoryList[0].setQuantity(newamount);
                }
            }
        } else if (sceneSymbol == "PI") {
            if (ch == "S") {
                if (InventoryList[3].getQuantity() < 12) {
                    newamount = InventoryList[3].getQuantity() + sceneAmount;
                    InventoryList[3].setQuantity(newamount);
                }
            }
        } else if (sceneSymbol == "FR") {
            if (ch == "G") {
                if (InventoryList[1].getQuantity() < 400) {
                    newamount = InventoryList[1].getQuantity() + sceneAmount;
                    InventoryList[1].setQuantity(newamount);
                }
            }
        } else if (sceneSymbol == "FT") {
            if (ch == "G") {
                if (InventoryList[4].getQuantity() < 16) {
                    newamount = InventoryList[4].getQuantity() + sceneAmount;
                    InventoryList[4].setQuantity(newamount);
                }
            }
        } else if (sceneSymbol == "RI") {
            if (ch == "G") {
                if (InventoryList[5].getQuantity() < 20) {
                    newamount = InventoryList[5].getQuantity() + sceneAmount;
                    InventoryList[5].setQuantity(newamount);
                }
            }
        } else if (sceneSymbol == "BB") {
            if (ch == "A") {
                if (InventoryList[3].getQuantity() < 12) {
                    newamount = InventoryList[3].getQuantity() + sceneAmount;
                    InventoryList[3].setQuantity(newamount);
                }
            }
        } else {
            sceneAmount = 0;
        }

        return sceneAmount;
    }
}
