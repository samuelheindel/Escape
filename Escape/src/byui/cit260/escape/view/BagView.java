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
public class BagView {
    private final String MENU = "\n"
            +"\n------------------------------------------------------------------------------"
            +"\n|Bag Menu                                                                     "
            +"\n------------------------------------------------------------------------------"
            +"\nH - How to equip Hammer                                                       "
            +"\nT - How to equip Hatchet                                                      "
            +"\nK - How to equip Knife                                                        "
            +"\nB - How to equip Bow                                                          "
            +"\nQ - Quit Action menu                                                          " 
            +"\n------------------------------------------------------------------------------";
    public void displayMenu(){
        char selection = ' ';
        do{
            System.out.println(MENU);// display the main menu
            
            String input = this.getInput(); // ge user selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection);// do action based on selection
            
        }while (selection != 'Q'); // an selection is not "exit"
    }

    private String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); // Keyboard input stream
      
        while (!valid) { // while a valid name has not been retrieved
            //Prompt o players name
            System.out.println("Enter your selection below");
            
            // get the name from the key and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
               // if the name is invalid (less than two characters in length)
            if (input.length() > 1) {
                System.out.println("Invalid name - input must be one letter");
                continue; // and repeat again
                
            }
            break; // out of the (exit) the repetition
            
        }
                
        return input; // return the name 
    }

    private void doAction(char choice) {
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
        gameMenu.display();
    }
}

