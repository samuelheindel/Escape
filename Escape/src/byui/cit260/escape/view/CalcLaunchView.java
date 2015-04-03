/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.InventoryControl;
import byui.cit260.escape.model.Actor;
import byui.cit260.escape.model.Inventory;
import exceptions.InventoryControlException;
import java.awt.Point;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class CalcLaunchView extends View {

    Inventory[] inventoryValues = escape.Escape.getCurrentGame().getInventory();
    double people = Double.parseDouble("4");
    double logsneeded = Double.parseDouble("-1");
    double logsininventory = inventoryValues[0].getQuantity();
    double ropeneeded = Double.parseDouble("-1");
    double ropeininventory = inventoryValues[1].getQuantity();
    double storageneeded = Double.parseDouble("-1");
    double storageininventory = inventoryValues[2].getQuantity();
    double raftcom = -1;
    double meat = inventoryValues[5].getQuantity();
    double meatneeded = Double.parseDouble("-1");
    double fruit = inventoryValues[4].getQuantity();
    double fruitneeded = Double.parseDouble("-1");

    public CalcLaunchView(String promptMessage) {
        super("We need to do some calculations"
                + "enter S to exicute");
    }

    @Override
    public boolean doAction(Object value) {
        try {
            double raftcom = InventoryControl.calcRaftCompletion(); // call function
            double storagecom = InventoryControl.calStorageNeeded();
            double completion = (raftcom + storagecom) / 2;
            Actor[] actor = Actor.values();
            Point coord1 = actor[4].getCoordinates();
            Point coord2 = actor[5].getCoordinates();
            Point coord3 = actor[6].getCoordinates();
            Point coord4 = actor[7].getCoordinates();
            Point rtcoor = new Point(14, 3);

            if (coord1.x != rtcoor.x & coord1.y != rtcoor.y & coord2.x != rtcoor.x & coord2.y != rtcoor.y & coord3.x != rtcoor.x & coord3.y != rtcoor.y & coord4.x != rtcoor.x & coord4.y != rtcoor.y) {
                this.console.println("Your Crew members need to be in the raft location in order to build the raft!"
                        + "\nYou can not launch until they move to that location!");
            } else if (completion < 90) {
                this.console.println("You launched your raft to soon, It was either incompete or you had"
                        + "\n too few supllies. You died at sea."
                        + "\n   ________                        ________                     \n"
                        + " /  _____/_____    _____   ____   \\_____  \\___  __ ___________ \n"
                        + "/   \\  ___\\__  \\  /     \\_/ __ \\   /   |   \\  \\/ // __ \\_  __ \\\n"
                        + "\\    \\_\\  \\/ __ \\|  Y Y  \\  ___/  /    |    \\   /\\  ___/|  | \\/\n"
                        + " \\______  (____  /__|_|  /\\___  > \\_______  /\\_/  \\___  >__|   \n"
                        + "        \\/     \\/      \\/     \\/          \\/          \\/       ");
                StartProgramView startProgramView = new StartProgramView("");
                startProgramView.display();
            } else if (completion >= 90) {
                this.console.println("                                                                                \n"
                        + "                                                                                \n"
                        + "                                                                                \n"
                        + "        MMM.        .MMM.       MMMMMMMMMMMMM.      .MMMM           . MMM       \n"
                        + "        MMM.        .MMM        MMMMMMMMMMMMM       .MMMM             MMM       \n"
                        + "        MMM.        .MMM        MMMMMMMMMMMMM.      .MMMM             MMM       \n"
                        + "        MMM.        .MMM    .MMM            .MMMM   .MMMM             MMM       \n"
                        + "        MMM.        .MMM    .MMM            .MMMM   .MMMM             MMM       \n"
                        + "        ,..MMM.  .MMM,..    .MMM            .MMMM   .MMMM             MMM       \n"
                        + "           MMM    MMM       .MMM            .MMMM   .MMMM             MMM       \n"
                        + "           .  MMMM  .       .MMM            .MMMM   .MMMM             MMM       \n"
                        + "              MMMM.         .MMM            .MMMM   .MMMM             MMM       \n"
                        + "              MMMM.         .MMM            .MMMM   .MMMM             MMM       \n"
                        + "              MMMM.         .MMM            .MMMM   .MMMM             MMM       \n"
                        + "              MMMM.         .MMM            .MMMM   .MMMM             MMM       \n"
                        + "              MMMM.         .MMM            .MMMM   .MMMM             MMM       \n"
                        + "              MMMM.             MMMMMMMMMMMMM           .MMMMMMMMMMMMM          \n"
                        + "              MMMM.             MMMMMMMMMMMMM           .MMMMMMMMMMMMM          \n"
                        + "                                 .............           ............,          \n"
                        + "                                                                                \n"
                        + "       .... .,..   .....            ,....           ........          ..        \n"
                        + "       MMM  .MMMM  .MMMM            .MMM            .MMMMMM.          MMM       \n"
                        + "       MMM  .MMMM  .MMMM            .MMM            .MMMMMM.          MMM       \n"
                        + "       MMM  .MMMM  .MMMM            .MMM            .MMMMMM.          MMM       \n"
                        + "       MMM  .MMMM  .MMMM            .MMM            .MMMMMM   ..      MMM       \n"
                        + "       MMM  .MMMM  .MMMM            .MMM            .MMM.  MMMM.      MMM       \n"
                        + "       MMM  .MMMM  .MMMM            .MMM            .MMM.  MMMM ..    MMM       \n"
                        + "       MMM  .MMMM  .MMMM            .MMM            .MMM.      MMM    MMM       \n"
                        + "       MMM  .MMMM  .MMMM            .MMM            .MMM.      MMN..  MMM       \n"
                        + "       MMM  .MMMM  .MMMM            .MMM            .MMM.        .MMMMMMM       \n"
                        + "       MMN ..MMMM...MMMM            .MMM            .MMM.        .MMMMMMM       \n"
                        + "         .MMM.  .MMM                .MMM            .MMM.        .MMMMMMM       \n"
                        + "          MMM.   MMM                 MMM             MMM          MMMMMMM       \n"
                        + "                                                                                \n"
                        + "                                                                               "
                        + "\nYou Succeded in launching a complete well stocked raft!"
                        + "\n Congradulations You win! Good luck at sea. ");
                StartProgramView startProgramView = new StartProgramView("");
                startProgramView.display();
            }

        } catch (InventoryControlException ex) {
            this.console.println(ex.getMessage());
        }

        return true;

    }
}
