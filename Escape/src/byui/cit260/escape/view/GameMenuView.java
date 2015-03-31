/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.GameControl;
import byui.cit260.escape.control.GatherControl;
import byui.cit260.escape.model.Actor;
import byui.cit260.escape.model.Inventory;
import byui.cit260.escape.model.Location;
import byui.cit260.escape.model.Player;
import byui.cit260.escape.model.Scene;
import escape.Escape;
import java.awt.Point;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                + "\nW - Show current Location                   "
                + "\nL - Show players in locations in file       "
                + "\nJ - Show players in locations               "
                + "\nV - View Map                                "
                + "\nM - Move                                    "
                + "\nC - Check Game Status                       "
                + "\nR - Check raft completion                   "
                + "\nZ - calculate the raft size                 "
                + "\nG - calculate the storage you need          "
                + "\nF - Launch your raft                        "
                + "\nS - Save Game                               "
                + "\nE - Exit                                    "
                + "\n--------------------------------------------");
    }

    @Override
    public boolean doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'I':
                this.viewInventory();
                break;
            case 'A':
                this.Bag();
                break;
            case 'W':
                this.currentLocation(this.out);
                break;
            case 'L':
                this.playerLocationView1(this.out);
                break;
            case 'J':
                this.playerLocationView(this.console);
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
            case 'G':
                this.CalcStorageNeeded();
            case 'F':
                this.calcLaunch();
            case 'E':
                this.goBackToMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
        }
        return false;
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
        Map.displayMap();
    }

    private void saveGame() {
        this.console.println("*** saveGame funtion called ***");
    }

    private void playerLocationView(PrintWriter console) {
        Actor[] actor = Actor.values();
        this.console.println("\n Actor Locations");
        this.console.println("Actors" + "\t" + "\t" + "Coordinates");
        for (int i = 0; i < actor.length; i++) {
            String name = actor[i].getName();
            Point location = actor[i].getCoordinates();
            this.console.print("\n" + name + "\t" + "\t  (" + location.getX() + "," + location.getY() + ")");
        }

    }

    private void playerLocationView1(PrintWriter out) {
        try {
            System.out.println("\n\nEnter the file path for the file where the actor location list"
                    + "is to be saved");
            String filePath = this.getInput();
            out = new PrintWriter(filePath);

            Actor[] actor = Actor.values();
            out.println("\n Actor Locations");
            out.println("Actors" + "\t" + "\t" + "Coordinates");
            for (int i = 0; i < actor.length; i++) {
                String name = actor[i].getName();
                Point location = actor[i].getCoordinates();
                out.print("\n" + name + "\t" + "\t  (" + location.getX() + "," + location.getY() + ")");
                out.flush();
            }
        } catch (Exception ex) {
            ErrorView.display("GameMenuView", "Error writing to file" + ex.getMessage());
        }
    }

    private void currentLocation(PrintWriter console) {
        Point player = Escape.getPlayer().getCoordinates();
        this.console.println("\n This is the point you are located on the map" + player);
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

    private void calcLaunch() {
        CalcLaunchView gamecom = new CalcLaunchView("");
        gamecom.display();

    }

    private void CalcStorageNeeded() {
        FoodStorageView foodneeded = new FoodStorageView("");
        foodneeded.display();
    }

}
