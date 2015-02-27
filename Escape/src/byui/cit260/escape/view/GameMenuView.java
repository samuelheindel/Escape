/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.GameControl;
import escape.Escape;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class GameMenuView {

    private final String MENU = "\n"
            + "\n--------------------------------------------"
            + "\n    Game Menu                               "
            + "\n--------------------------------------------"
            + "\nA - Action                                  "
            + "\nV - View Map                                "
            + "\nM - Move                                    "
            + "\nS - Save Game                               "
            + "\nC - Check Game Status                       "
            + "\nR - Check raft completion                       "
            + "\nE - Exit                                    "
            + "\n--------------------------------------------";

    public void displayMenu() {
        char selection = ' ';
        do {
            System.out.println(MENU);// display the main menu

            String input = this.getInput(); // get user selection
            selection = input.charAt(0); // get first character of string

            this.doAction(selection);// do action based on selection

        } while (selection != 'E'); // an selection is not "exit"
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
                System.out.println("Invalid input - input must be one letter");
                continue; // and repeat again

            }
            break; // out of the (exit) the repetition

        }

        return input; // return the name 
    }

    public void doAction(char choice) {
        switch (choice) {
            case 'A':
                this.actionView();
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
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    }      

    private void actionView() {
        ActionView ActionMenu = new ActionView();
        ActionMenu.displayActionMenu();
    }

    private void displayMap() {
        System.out.println("*** startExistingGame ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame funtion called ***");
    }

    private void checkGameStatus() {
        HelpMenuView HelpMenu = new HelpMenuView();
        HelpMenu.displayHelpMenu();
    }
    
    private void checkRaftStatus() {
        CalcRaftCompletionView CalcRaftCompletion = new CalcRaftCompletionView();
        CalcRaftCompletion.displayCalcRaftCompletion();
    }

    private void displayMoveView() {
        MoveView MoveMenu = new MoveView();
        MoveMenu.displayMoveMenu();
    }

}
