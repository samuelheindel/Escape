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
        double meat = inventoryValues[3].getQuantity();
        double meatneeded = inventoryValues[3].getQuantityneeded();
        double fruit = inventoryValues[4].getQuantity();
        double fruitneeded = inventoryValues[4].getQuantityneeded();

        if (people > 4 || people < 1) {
            throw new InventoryControlException("to few people or to many people");
        }
        if (meat > 13 || meat < 0) {
            throw new InventoryControlException("to little meat or to much meat");
        }
        if (meatneeded > 13 || meatneeded < 0) {
            throw new InventoryControlException("to little meat needed or to much meat needed");
        }
        if (fruit > 17 || fruit < 0) {
            throw new InventoryControlException("to little fruit or to much fruit");
        }
        if (fruitneeded > 17 || fruitneeded < 0) {
            throw new InventoryControlException("to little fruit needed or to much fruit needed");
        }
        double percommeat = meat / meatneeded;
        double percomfruit = fruit / fruitneeded;
        double combined = ((percomfruit + percommeat) / 2) * 100;

        return combined;
    }

}
