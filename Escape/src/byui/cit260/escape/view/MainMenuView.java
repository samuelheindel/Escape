/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.GameControl;
import byui.cit260.escape.view.GameMenuView;
import byui.cit260.escape.view.HelpMenuView;
import escape.Escape;
import java.util.Scanner;
import static jdk.nashorn.internal.runtime.GlobalFunctions.escape;

/**
 *
 * @author Kale
 */
public class MainMenuView {

    private final String MENU = "\n"
            +"\n--------------------------------------------"
            +"\n|Main Menu                                  "
            +"\n--------------------------------------------"
            +"\nG - Start Game                              "
            +"\nH - Get help on how to play the game        "
            +"\nS - Save game                               "
            +"\nE - Exit                                    "
            +"\n--------------------------------------------";
    public void displayMenu(){
        char selection = ' ';
        do{
            System.out.println(MENU);// display the main menu
            
            String input = this.getInput(); // ge user selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection);// do action based on selection
            
        }while (selection != 'E'); // an selection is not "exit"
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
            case 'N':
                this.startNewGame();
                break;
            case 'G':
                this.startExistingGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    
       }
    private void startNewGame(){
        GameControl.createNewGame(Escape.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
    private void startExistingGame(){
        System.out.println("*** startExistingGame ***");
    }
    private void saveGame(){
        System.out.println("*** saveGame funtion called ***");
    }
    private void displayHelpMenu(){
        HelpMenuView HelpMenu = new HelpMenuView();
        HelpMenu.displayHelpMenu();
    }

}
