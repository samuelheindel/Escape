/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.GameControl;
import byui.cit260.escape.model.Inventory;
import escape.Escape;
import exceptions.InventoryControlException;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n    Game Menu                               "
                + "\n--------------------------------------------"
                + "\nI - See inventory                           "
                + "\nA - Equip tool from bag                     "
                + "\nL - Show players in locations               "
                + "\nV - View Map                                "
                + "\nM - Move                                    "
                + "\nS - Save Game                               "
                + "\nC - Check Game Status                       "
                + "\nR - Check raft completion                   "
                + "\nZ - calculate the raft size                 "
                + "\nE - Exit                                    "
                + "\n--------------------------------------------");
    }

    @Override
    public void doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'I':
                this.viewInventory();
                break;
            case 'A':
                this.Bag();
                break;
            case 'L':
                this.playerLocationView();
                break;
            case 'V':
                this.displayMap();
                break;
            case 'M':
                this.displayMoveView();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'C':
                this.checkGameStatus();
            case 'R':
                this.checkRaftStatus();
            case 'Z':
                this.calcRaftSize();
            case 'E':
                this.goBackToMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
        }
    }

    private void viewInventory() {
        //get a sorted list of inventory items for the current game
        Inventory[] inventory = GameControl.getSortedInventoryList();

        this.console.println("\n         List of Inventory Items");
        this.console.println("\t" + "           Description" + "\t"
                + "Required" + "\t"
                + "In Stock");

        //for each inventory item
        for (Inventory inventoryItem : inventory) {
            //Display the description,the required amount and amount in stock
            this.console.println(inventoryItem.getDescription() + "\t" + "\t" + "\t"
                    + inventoryItem.getQuantityneeded() + "\t   "
                    + inventoryItem.getQuantity());

        }
    }

    private void Bag() {
        BagView Bag = new BagView();
        Bag.display();
    }

    private void displayMap() {
        MapView Map = new MapView("");
        Map.display();
    }

    private void saveGame() {
        this.console.println("*** saveGame funtion called ***");
    }

    private void playerLocationView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private void checkGameStatus() {
        HelpMenuView HelpMenu = new HelpMenuView();
        HelpMenu.display();
    }

    private void checkRaftStatus() {
        CalcRaftCompletionView calcraftcompletion = new CalcRaftCompletionView("");
        calcraftcompletion.display();
    }

    private void calcRaftSize() {
        CalcRaftSizeView calcraftsize = new CalcRaftSizeView("");
        calcraftsize.display();
    }

    private void displayMoveView() {
        MoveView MoveMenu = new MoveView();
        MoveMenu.display();
    }

    private void goBackToMenu() {
        MainMenuView gameMenu = new MainMenuView();
        gameMenu.display();
    }

}
