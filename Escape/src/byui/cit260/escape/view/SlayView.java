/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.ActionControl;
import byui.cit260.escape.control.GameControl;
import byui.cit260.escape.control.GatherControl;
import escape.Escape;

/**
 *
 * @author samuel
 */
public class SlayView extends View {

    public SlayView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n   |Slay Beast|                             "
                + "\n--------------------------------------------"
                + "\nS - Slay Pig                              "
                + "\nE - Exit                                    "
                + "\n--------------------------------------------");
    }

    @Override
    public boolean doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'S':
                this.slayBeast();
                break;
            case 'E':
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection *** Try again");
        }
        return false;
    }
    String value = "S";

    private void slayBeast() {
        Double amount = GatherControl.gatherRe(value);
        this.console.println("you added " + amount + " pound of meat to your inventory");
    }

}
