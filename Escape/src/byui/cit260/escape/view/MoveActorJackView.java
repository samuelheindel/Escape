/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.MapControl;
import byui.cit260.escape.model.Actor;
import exceptions.MapControlExceptions;
import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
public class MoveActorJackView {

    public void displayMoveActor() throws MapControlExceptions {
        int input = this.getInput(); // get user selection
        System.out.println("this location contains " + input);
    }

    private static int getInput() throws MapControlExceptions {
        boolean valid = false; // indicates if the if valid
        int x = -1;
        int y = -1;
        Scanner input = new Scanner(System.in);// to get input from user
        while (!valid) { // start while loop
            System.out.println("Enter a row");
            x = input.nextInt(); // people variable
            if (x > 20) {
                System.out.println("invalid row number");
                continue;
            } else if (x < 0) {
                System.out.println(
                "invalid row number");
                continue;
            } else {
                System.out.println("Enter a column number");
            }

            y = input.nextInt(); // logs variable
            if (y > 20) {
                System.out.println("invalid column number");
                continue;
            } else if (y < 0) {
                System.out.println("invalid column number");
                continue;
            } else {
                System.out.println("valid location");
            }
            break; // out of the (exit) the repetition
        }
        int cord = MapControl.moveActorToLocation(Actor.Jack, x; // call function
        return cord; //return raftcom to input variable in display
    }
}
