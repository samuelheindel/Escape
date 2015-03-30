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
import exceptions.MapControlExceptions;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.runtime.GlobalFunctions.escape;

/**
 *
 * @author Kale
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n   |Main Menu|                             "
                + "\n--------------------------------------------"
                + "\nN - Start Game                              "
                + "\nL - Load Game                               "
                + "\nH - Get help on how to play the game        "
                + "\nS - Save game                               "
                + "\nE - Exit                                    "
                + "\n--------------------------------------------");
    }

    @Override
    public boolean doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'N': {
                try {
                    this.startNewGame();
                } catch (MapControlExceptions ex) {
                    Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 'L':
                this.startExistingGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'E':
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
        }
        return false;
    }

    private void startNewGame() throws MapControlExceptions {
        GameControl.createNewGame(Escape.getPlayer());

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("\n\nEnter the file path for the file where the game"
                + "is saved");
        String filePath = this.getInput();
        
        try{
            // Start a saved game
            GameControl.getSavedGame(filePath);
            
        }catch (Exception ex) {
        ErrorView.display("MainMenuView", ex.getMessage());
    }
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void saveGame() {
         System.out.println("\n\nEnter the file path for the file where the game"
                + "is to be saved");
        String filePath = this.getInput();
        
        try{
            // save the game to the file
            GameControl.saveGame(Escape.getCurrentGame(), filePath);
            
        }catch (Exception ex) {
        ErrorView.display("MainMenuView", ex.getMessage());
    }
    }

    private void displayHelpMenu() {
        HelpMenuView HelpMenu = new HelpMenuView();
        HelpMenu.display();
    }
}
