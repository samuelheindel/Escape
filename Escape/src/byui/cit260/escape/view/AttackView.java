/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.ActionControl;

/**
 *
 * @author samuel
 */
public class AttackView extends View {

    public AttackView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n   Choose who to attack                     "
                + "\n--------------------------------------------"
                + "\nS - Attack savage                           "
                + "\nC - Attack crew member                      "
                + "\nE - Exit                                    "
                + "\n--------------------------------------------");
    }

    @Override
    public void doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'S':
                this.attackSavage();
                break;
            case 'C':
                this.attackCrew();
                break;
            case 'E':
                this.goBackToMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    }

    private void attackSavage() {
        ActionControl.AttackSavage(); // call function
    }

    private void attackCrew() {
        ActionControl.AttackCrew(); // call function
    }

    private void goBackToMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

}
