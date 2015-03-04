/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class BagView extends View {
    public BagView() {
        super("\n"
            +"\n------------------------------------------------------------------------------"
            +"\n|Bag Menu                                                                     "
            +"\n------------------------------------------------------------------------------"
            +"\nH - How to equip Hammer                                                       "
            +"\nT - How to equip Hatchet                                                      "
            +"\nK - How to equip Knife                                                        "
            +"\nB - How to equip Bow                                                          "
            +"\nQ - Quit Action menu                                                          " 
            +"\n------------------------------------------------------------------------------");
    }
    @Override
    public void doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice){
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
            case 'Q':
                this.goBackToMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    
       }
    private void displayHammer(){
        System.out.println("*"
                + "Use the letter H to equip the hammer      *");
    }
    private void displayHatchet(){
        System.out.println("*"
                + "Use the letter T to equip the hatchet     *");
    }
    private void displayKnife(){
        System.out.println("*"
                + "Use the letter K to equip the knife       *");
    }
    private void displayBow(){
        System.out.println("*"
                + "Use the letter B to equip the bow         *");
    }
    private void goBackToMenu(){
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
}

