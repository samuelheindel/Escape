/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.GameControl;
import byui.cit260.escape.control.ToolsControl;
import byui.cit260.escape.model.Tools;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class BagView extends View {

    public BagView() {
        super("\n"
                + "\n------------------------------------------------------------------------------"
                + "\n|Bag Menu                                                                     "
                + "\n------------------------------------------------------------------------------"
                + "\nS - See tool specs                                                            "
                + "\nH - To equip Hammer                                                           "
                + "\nT - To equip Hatchet                                                          "
                + "\nK - To equip Knife                                                            "
                + "\nB - To equip Bow                                                              "
                + "\nB - To equip Water Jug                                                              "
                + "\nE - Exit Action menu                                                          "
                + "\n------------------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'S':
                this.toolSpecs();
                break;
            case 'H':
                this.displayHammer();
                break;
            case 'T':
                this.displayHatchet();
                break;
            case 'K':
                this.displayKnife();
                break;
            case 'B':
                this.displayBow();
                break;
            case 'J':
                this.displayWater();
                break;
            case 'E':
                this.goBackToMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
        }
        return false;

    }

    private void toolSpecs() {
        //get a sorted list of inventory items for the current game
        ArrayList<Tools> tools = ToolsControl.getSortedToolsList();

        this.console.println("\n         Tool Specs");
        this.console.println("\t" + "\t" + "Damage" + "\t"
                + "Gather");

        //for each inventory item
        for (Tools Tool : tools) {
            //Display the description,the required amount and amount in stock
            this.console.println(Tool.getDescription() + "\t" + "\t"
                    + Tool.getDamage() + "\t   "
                    + Tool.getGather());

        }
    }

    private void displayHammer() {
        ActionView actionMenu = new ActionView();
        actionMenu.display();
    }

    private void displayHatchet() {
        ActionView actionMenu = new ActionView();
        actionMenu.display();
    }

    private void displayKnife() {
        ActionView actionMenu = new ActionView();
        actionMenu.display();
    }

    private void displayBow() {
        ActionView actionMenu = new ActionView();
        actionMenu.display();
    }

    private void goBackToMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayWater() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

}
