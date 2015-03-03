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
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
            +"\n--------------------------------------------"
            +"\n|Main Menu                                  "
            +"\n--------------------------------------------"
            +"\nN - Start Game                              "
            +"\nG - Start Game                              "
            +"\nH - Get help on how to play the game        "
            +"\nS - Save game                               "
            +"\nE - Exit                                    "
            +"\n--------------------------------------------");
    }


    @Override
    public void doAction(Object value) {
        char choice = (Character) value;
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
