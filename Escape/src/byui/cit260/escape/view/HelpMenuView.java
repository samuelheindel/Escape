/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.GameControl;
import byui.cit260.escape.model.GameMenuView;
import escape.Escape;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class HelpMenuView {

    private final String MENU = "\n"
            +"\n------------------------------------------------------------------------------"
            +"\n|Help Menu                                                                    "
            +"\n------------------------------------------------------------------------------"
            +"\nG - What is the goal of the game?                                             "
            +"\nM - How to move                                                               "
            +"\nB - View Bag/View Status of Raft/Resources needed                             "
            +"\nA -  Interact (Harvest certain resources, use items, etc.)                    "
            +"\nL - View your location.                                                       "
            +"\nO -  Observe surroundings                                                     "
            +"\nQ - Quit or Go Back to Main Menu                                              "
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
            case 'G':
                this.displayGameGoal();
                break;
            case 'M':
                this.displayHowToMove();
                break;
            case 'B':
                this.displayBag();
                break;
            case 'A':
                this.displayInteract();
                break;
            case 'L':
                this.displayViewLocation();
                break;
            case 'O':
                this.displayObserveSurroundings();
                break;
            case 'Q':
                this.goBackToMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    
       }
    private void displayGameGoal(){
        System.out.println("*** startExistingGame ***");
    }
    private void displayHowToMove(){
        System.out.println("*** startExistingGame ***");
    }
    private void displayBag(){
        System.out.println("*** saveGame funtion called ***");
    }
    private void displayInteract(){
        System.out.println("*** displayHelpMenu funtion called ***");
    }
    private void displayViewLocation(){
        System.out.println("*** startExistingGame ***");
    }
    private void displayObserveSurroundings(){
        System.out.println("*** saveGame funtion called ***");
    }
    private void goBackToMenu(){
        System.out.println("*** displayHelpMenu funtion called ***");
    }

}

