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
public class ActionView extends View {

    public ActionView() {
        super("\n"
                + "\n------------------------------------------------------------------------------"
                + "\n|Action Menu                                                                  "
                + "\n------------------------------------------------------------------------------"
                + "\nG - Gather an item                                                            "
                + "\nA - Attack a person                                                           "
                + "\nS - Slay beast                                                                "
                + "\nE - Exit                                                                      "
                + "\n------------------------------------------------------------------------------");
    }

    @Override
    public boolean doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'G':
                this.displayGatherItems();
                break;
            case 'A':
                this.displayAttack();
                break;
            case 'S':
                this.displaySlay();
                break;
            case 'E':
                this.goBackToMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
        }
        return false;

    }

    private void displayGatherItems() {
        GatherView gatherMenu = new GatherView();
        gatherMenu.display();

    }

    private void displayAttack() {
        AttackView attackMenu = new AttackView();
        attackMenu.display();
    }

    private void displaySlay() {
        SlayView slayMenu = new SlayView();
        slayMenu.display();
    }

    private void goBackToMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

}
