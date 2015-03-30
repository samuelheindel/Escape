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
public class MoveNorthView extends View{
    
    public MoveNorthView(){
        super("\n"
            +"\n--------------------------------------------"
            +"\n   |Move North|                             "
            +"\n--------------------------------------------"
            +"\nS - Spaces                                  "
            +"\nE - Exit                                    "
            +"\n--------------------------------------------");
    }
    
    @Override
    public boolean doAction(Object value) {
        String action = (String)value;
        char choice = action.charAt(0);
        switch (choice){
            case 'S':
                this.Spaces();
                break;
            case 'E':
                return true;
            default:
                ErrorView.display(this.getClass().getName(),"\n*** Invalid selection *** Try again");
        }
        return false;
    
}

    private void Spaces() {
            this.console.println("You have called spaces function");
    }
    
}