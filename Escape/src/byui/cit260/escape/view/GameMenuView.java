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
public class GameMenuView extends View {

   public GameMenuView() {
        super("\n"
            + "\n--------------------------------------------"
            + "\n    Game Menu                               "
            + "\n--------------------------------------------"
            + "\nA - Action                                  "
            + "\nV - View Map                                "
            + "\nM - Move                                    "
            + "\nS - Save Game                               "
            + "\nC - Check Game Status                       "
            + "\nR - Check raft completion                   "
            + "\nE - Exit                                    "
            + "\n--------------------------------------------");
   }
   

     @Override
    public void doAction(Object value) {
        String action = (String)value;
        char choice = action.charAt(0);
        switch (choice){
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
        ActionMenu.display();
    }

    private void displayMap() {
        System.out.println("*** startExistingGame ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame funtion called ***");
    }

    private void checkGameStatus() {
        HelpMenuView HelpMenu = new HelpMenuView();
        HelpMenu.display();
    }
    
    private void checkRaftStatus() {
        CalcRaftCompletionView CalcRaftCompletion = new CalcRaftCompletionView();
        CalcRaftCompletion.displayCalcRaftCompletion();
    }

    private void displayMoveView() {
        MoveView MoveMenu = new MoveView();
        MoveMenu.display();
    }

}
