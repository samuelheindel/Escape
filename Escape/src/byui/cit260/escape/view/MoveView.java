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
public class MoveView extends View{

    public MoveView() {
        super("\n"
            +"\n--------------------------------------------"
            +"\n    Move Menu                               "
            +"\n--------------------------------------------"
            +"\nN - Move North                              "
            +"\nE - Move East                               "
            +"\nS - Move South                              "
            +"\nW - Move West                               "
            +"\nX - Exit                                    "
            +"\n--------------------------------------------");
    }
   

    @Override
    public void doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'N':
                this.moveNorth();
                break;
            case 'E':
                this.moveEast();
                break;
            case 'S':
                this.moveSouth();
                break;
            case 'W':
                this.moveWest();
                break;
            case 'X':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    
       }
    private void moveNorth(){
        MoveNorthView NorthView = new MoveNorthView();
        int displayMoveNorthView;
        displayMoveNorthView = NorthView.displayMoveNorthView();
       
    }
    private void moveEast(){
        System.out.println("*** moveEast funtion called ***");
    }
    private void moveSouth(){
        System.out.println("*** moveSouth funtion called ***");
    }
    private void moveWest(){
        System.out.println("*** moveWest funtion called ***");
    }
   

}