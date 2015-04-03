/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import java.util.Scanner;

/**
 *
 * @author Kale
 */
public class MoveView extends View {

    public MoveView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n    Move Menu                               "
                + "\n--------------------------------------------"
                + "\nY - Move Yourself                           "
                + "\nC - Move Crew Memeber                       "
                + "\nV - View Map                           "
                + "\nE - Exit                                    "
                + "\n--------------------------------------------");
    }

    @Override
    public boolean doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'Y':
                this.movePlayer();
                break;
            case 'C':
                this.moveCrew();
                break;
            case 'V':
                this.viewMap();
                break;
            case 'E':
                this.goBackToMenu();
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
        }
        return false;

    }

    private void movePlayer() {
        MovePlayerView moveplayer = new MovePlayerView("");
        moveplayer.display();
    }

    private void moveCrew() {
        SelectActorView actorMenu = new SelectActorView();
        actorMenu.display();
    }

    private void goBackToMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void viewMap() {
        MapView Map = new MapView("");
        Map.displayMap();
    }

}
