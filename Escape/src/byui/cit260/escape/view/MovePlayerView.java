/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.MapControl;
import byui.cit260.escape.model.Player;
import byui.cit260.escape.model.Scene;
import escape.Escape;
import exceptions.MapControlExceptions;
import java.awt.Point;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class MovePlayerView extends View {

    Player player = escape.Escape.getPlayer();
    int x = -1;
    int y = -1;
    Point coordinates = new Point(x, y);

    public MovePlayerView(String promptMessage) {
        super("Where would you like to move?");
    }

    public void displayMovePlayer(Player player) throws MapControlExceptions {
        Escape.setPlayer(player);
    }

    @Override
    public String getInput() {
        boolean valid = false; // indicates if the if valid
        while (!valid) { // start while loop
            this.console.println("Enter a row");
            try {
                this.coordinates.x = Integer.parseInt(this.keyboard.readLine()); // people variable
            } catch (IOException ex) {
                this.console.println("row invalid");
            }
            if (coordinates.x > 20) {
                ErrorView.display(this.getClass().getName(), "invalid row number");
                continue;
            } else if (coordinates.x < 0) {
                this.console.println(
                        "invalid row number");
                continue;
            } else {
                this.console.println("Enter a column number");
            }

            try {
                this.coordinates.y = Integer.parseInt(this.keyboard.readLine()); // logs variable
            } catch (IOException ex) {
                this.console.println("row invalid");
            }
            if (coordinates.y > 20) {
                ErrorView.display(this.getClass().getName(), "invalid column number");
                continue;
            } else if (coordinates.y < 0) {
                ErrorView.display(this.getClass().getName(), "invalid column number");
                continue;
            } else {
                this.console.println("valid location");
            }
            break; // out of the (exit) the repetition
        }

        return ""; //return raftcom to input variable in display
    }

    @Override
    public boolean doAction(Object value) {
        try {
            Scene scene = MapControl.movePlayerToLocation(player, coordinates); // call function
            this.console.println(scene.getDescription());
        } catch (MapControlExceptions me) {
            this.console.println(me.getMessage());
        }
        return true;
    }
}
