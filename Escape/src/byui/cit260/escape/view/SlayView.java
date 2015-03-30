/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.ActionControl;
import byui.cit260.escape.control.GameControl;
import escape.Escape;

/**
 *
 * @author samuel
 */
public class SlayView extends View {


    public SlayView() {
        super("\n"
            +"\n--------------------------------------------"
            +"\n   |Slay Beast|                             "
            +"\n--------------------------------------------"
            +"\nS - Slay Beast                              "                             
            +"\nE - Exit                                    "
            +"\n--------------------------------------------");
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
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
        }
        return false;
    }

    private void slayBeast() {
        ActionControl.SlayBeast();//calls function
    }
    
    

}
