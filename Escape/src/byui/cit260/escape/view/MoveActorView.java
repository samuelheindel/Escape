/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.MapControl;
import byui.cit260.escape.model.Actor;
import byui.cit260.escape.model.Scene;
import exceptions.MapControlExceptions;
import java.awt.Point;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class MoveActorView extends View {

    private Actor actor;
    int x = -1;
    int y = -1;
    Point coordinates = new Point(x, y);

    public MoveActorView(String promptMessage) {
        super("where would you like to move this person");
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void displayMoveActor(Actor actor) throws MapControlExceptions {
        this.setActor(actor);

    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the if valid
        while (!valid) { // start while loop
            this.console.println("Enter a row");
            try {
                this.x = Integer.parseInt(this.keyboard.readLine()); // people variable
            } catch (IOException ex) {
                Logger.getLogger(MoveActorView.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (x > 20) {
                ErrorView.display(this.getClass().getName(),"invalid row number");
                continue;
            } else if (x < 0) {
                this.console.println(
                        "invalid row number");
                continue;
            } else {
                this.console.println("Enter a column number");
            }

            try {
                this.y = Integer.parseInt(this.keyboard.readLine()); // logs variable
            } catch (IOException ex) {
                Logger.getLogger(MoveActorView.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (y > 20) {
                ErrorView.display(this.getClass().getName(),"invalid column number");
                continue;
            } else if (y < 0) {
                ErrorView.display(this.getClass().getName(),"invalid column number");
                continue;
            } else {
                this.console.println("valid location");
            }
            break; // out of the (exit) the repetition
        }

        return ""; //return raftcom to input variable in display
    }

    @Override
    public void doAction(Object value) {
        try {
            Scene scene = MapControl.moveActorToLocation(this.getActor(), coordinates); // call function
            this.console.println(scene.getDescription());
        } catch (MapControlExceptions me) {
            this.console.println(me.getMessage());
        }

    }
}
