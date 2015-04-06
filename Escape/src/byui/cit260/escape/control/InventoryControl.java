/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.control;

import byui.cit260.escape.model.Inventory;
import byui.cit260.escape.view.ErrorView;
import exceptions.InventoryControlException;

/**
 *
 * @author Kale
 */
public class InventoryControl {

    public static double calcRaftCompletion() throws InventoryControlException {

        Inventory[] inventoryValues = escape.Escape.getCurrentGame().getInventory();
        double people = Double.parseDouble("4");
        double logsneeded = inventoryValues[0].getQuantityneeded();
        double logsininventory = inventoryValues[0].getQuantity();
        double ropeneeded = inventoryValues[1].getQuantityneeded();
        double ropeininventory = inventoryValues[1].getQuantity();
        double storageneeded = inventoryValues[2].getQuantityneeded();
        double storageininventory = inventoryValues[2].getQuantity();
        double raftcom = -1;

        if (logsneeded < 10 || logsneeded > 250) {

            throw new InventoryControlException("to few logs");
        }
        if (logsininventory < 0 || logsininventory > 250) {

            throw new InventoryControlException("to many logs");
        }
        if (ropeneeded < 60 || ropeneeded > 600) {

            throw new InventoryControlException("to little rope");
        }
        if (ropeininventory < 0 || ropeininventory > 600) {

            throw new InventoryControlException("to much rope");
        }
        if (storageneeded < 2 || storageneeded > 29) {

            throw new InventoryControlException("to much storage");
        }
        if (storageininventory < 0 || storageininventory > 29) {

            throw new InventoryControlException("to little sroage");
        }

        double logs = logsininventory / logsneeded;
        double rope = ropeininventory / ropeneeded;
        double storage = storageininventory / storageneeded;
        double addthem = logs + rope + storage;
        double persentcom = (addthem / 3) * 100;
        return persentcom;
    }

    public static double calRaftSize(double people, double crates) throws InventoryControlException {

        if (people < 1 || people > 9) {
            throw new InventoryControlException("to few people or to many people");
        }
        if (crates < 1 || crates > 29) {
            throw new InventoryControlException("to few crates or to many crates");
        }

        double pspace = (6 * 10) * people;
        double raftsize = pspace + (crates * 2);
        return raftsize;
    }

    public static double calStorageNeeded() throws InventoryControlException {
        Inventory[] inventoryValues = escape.Escape.getCurrentGame().getInventory();
        double people = Double.parseDouble("4");
        double meat = inventoryValues[5].getQuantity();
        double meatneeded = inventoryValues[5].getQuantityneeded();
        double fruit = inventoryValues[4].getQuantity();
        double fruitneeded = inventoryValues[4].getQuantityneeded();
        double percommeat = meat / meatneeded;
        double percomfruit = fruit / fruitneeded;
        double combined = ((percomfruit + percommeat) / 2) * 100;

        if (people > 4 || people < 1) {
            throw new InventoryControlException("to few people or to many people");
        }
        if (meat > 12 || meat < 0) {
            throw new InventoryControlException("to little meat or to much meat");
        }
        if (meatneeded > 12 || meatneeded < 1) {
            throw new InventoryControlException("to little meat or to much meat");
        }
        if (fruit > 16 || fruit < 0) {
            throw new InventoryControlException("to little meat or to much meat");
        }
        if (fruitneeded > 16 || fruitneeded < 1) {
            throw new InventoryControlException("to little meat or to much meat");
        }


        return combined;
    }

}
