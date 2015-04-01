/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.ActionControl;
import byui.cit260.escape.control.GatherControl;
import exceptions.VolcanoControlException;

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
                + "\nE - Exit                                    "
                + "\n--------------------------------------------");
    }

    @Override
    public boolean doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'S':
                this.attackSavage();
                break;
            case 'E':
                this.goBackToMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
        }
        return false;
    }
    String value = "A";

    private void attackSavage() {
        try{
        Double amount = GatherControl.gatherRe(value);
        this.console.println("you added " + amount + " pound of meat to your inventory");
        }catch (VolcanoControlException vc){
            this.console.println("VolcanoControl, error in countdown" + vc.getMessage());
        }
    }

    private void goBackToMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

}
