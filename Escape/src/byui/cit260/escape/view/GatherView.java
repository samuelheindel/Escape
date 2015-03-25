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

public class GatherView extends View {


    public GatherView() {
        super("\n"
            +"\n--------------------------------------------"
            +"\n   |Gather Resource|                        "
            +"\n--------------------------------------------"
            +"\nG - Gather Resource                         "                             
            +"\nE - Exit                                    "
            +"\n--------------------------------------------");
    }

 @Override
    public void doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'G':
                this.gatherResource();
                break;
            case 'E':
                return;
            default:
                this.console.println("\n*** Invalid selection *** Try again");
        }

    }

    private void gatherResource() {
        ActionControl.GatherResource();//calls function
    }
    
    

}
