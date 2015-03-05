/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

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
    public void doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'S':
                this.slayBeast();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }

    }

    private void slayBeast() {
        ActionControl.slayBeast();//calls function
    }
    
    

}
