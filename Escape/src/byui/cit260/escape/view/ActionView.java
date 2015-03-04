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
                + "\nE - Equip tool                                                                "
                + "\nG - Gather an item                                                            "
                + "\nA - Attack a person                                                           "
                + "\ns - Slay beast                                                                "
                + "\nE - Exit                                                                      "
                + "\n------------------------------------------------------------------------------");
    }



  
    @Override
    public void doAction(Object value) {
        String action = (String)value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'E':
                this.displayEquipMenu();
                break;
            case 'G':
                this.displayGatherItems();
                break;
            case 'A':
                this.displayAttack();
                break;
            case 'S':
                this.displaySlay();
                break;
            case 'Q':
                this.goBackToMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }

    }

    private void displayEquipMenu() {
        BagView bagMenu = new BagView();
        bagMenu.display();
    }

    private void displayGatherItems() {
        GatherView gatherMenu = new GatherView();
        gatherMenu.displayMenu();

    }

    private void displayAttack() {
        AttackView attackMenu = new AttackView();
        attackMenu.displayMenu();
    }

    private void displaySlay() {
        SlayView slayMenu = new SlayView();
        slayMenu.displayMenu();
    }

    private void goBackToMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

}
