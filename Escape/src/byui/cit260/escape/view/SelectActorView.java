/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.model.Actor;
import exceptions.MapControlExceptions;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class SelectActorView extends View {

    public SelectActorView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n   Select Crew member                       "
                + "\n--------------------------------------------"
                + "\nD - Display found crew                      "
                + "\nA - Jeb                                     "
                + "\nB - Ned                                     "
                + "\nC - Jack                                    "
                + "\nE - Exit                                    "
                + "\n--------------------------------------------");
    }

    @Override
    public void doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'D':
                this.crew();
                break;
            case 'A':
                this.moveActor(Actor.Jeb);
                break;
            case 'B':
                this.moveActor(Actor.Ned);
                break;
            case 'C':
                this.moveActor(Actor.Jack);
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }

    }

    private void crew() {

    }

    private void moveActor(Actor actor) {
        MoveActorView MoveActor = new MoveActorView();
        try {
            MoveActor.displayMoveActor(actor);
        } catch (MapControlExceptions me) {
            System.out.println(me.getMessage());
        }
    }
}