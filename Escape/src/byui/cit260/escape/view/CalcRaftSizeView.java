/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.InventoryControl;
import exceptions.InventoryControlException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class CalcRaftSizeView extends View {

    double people = Double.parseDouble("4");
    double storagecrates = Double.parseDouble("8");

    public CalcRaftSizeView(String promptMessage) {
        super("We will calculate your raft size");
    }

    @Override
    public String getInput() {

        return "";
    }

    @Override
    public boolean doAction(Object value) {

        try {
            double raftsize = InventoryControl.calRaftSize(this.people, this.storagecrates); // call function
            this.console.println("Your raft needs to be " + raftsize + " Square feet");
        } catch (InventoryControlException ex) {
            this.console.println(ex.getMessage());
        }
        return true;
    }
}
