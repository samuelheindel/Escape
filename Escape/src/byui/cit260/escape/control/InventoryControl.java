/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.control;

import byui.cit260.escape.model.Inventory;
import exceptions.InventoryControlException;

/**
 *
 * @author Kale
 */
public class InventoryControl {

    public static double calcRaftCompletion(double logsneeded, double logsininventory, double ropeneeded, double ropeininventory, double storageneeded, double storageininventory) throws InventoryControlException {

        if (logsneeded < 10 || logsneeded > 100) {

            throw new InventoryControlException("to few logs");
        }
        if (logsininventory < 0 || logsininventory > 100) {

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

        double needforcom = logsneeded + ropeneeded + storageneeded;

        double raftcom = needforcom - (needforcom - (logsininventory + ropeininventory + storageininventory));
        double persentcom = (raftcom / needforcom) * 100;
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

    public static double calStorageNeeded(double people, double meatneeded, double meat, double fruitneeded, double fruit) throws InventoryControlException {

        Inventory[] inventoryValues = escape.Escape.getCurrentGame().getInventory();

        if (people < 1 || people > 9) {
            throw new InventoryControlException("to few people or to many people");
        }
        if (meatneeded < 1 || meatneeded > 15) {
            throw new InventoryControlException("to few people or to many people");
        }
        if (meat < 0 || meat > 15) {
            throw new InventoryControlException("to few people or to many people");
        }
        if (fruitneeded < 1 || fruitneeded > 20) {
            throw new InventoryControlException("to few people or to many people");
        }
        if (fruit < 0 || fruit > 20) {
            throw new InventoryControlException("to few crates or to many crates");
        }
        double storageneeded = meatneeded + fruitneeded;
        double completioninven = fruit + meat;
        double completion = (completioninven / storageneeded) * 100;
        return completion;
    }

}
