/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.model.Actor;
import byui.cit260.escape.model.Location;
import byui.cit260.escape.model.Map;
import escape.Escape;
import java.awt.Point;

/**
 *
 * @author samuel
 */
public class MapView extends View {

    public MapView(String promptMessage) {
        super("This is the Map");
    }

    Location[][] displayMap() {
        Actor[] actor = Actor.values();
        Point pcoor = Escape.getCurrentGame().getPlayer().getCoordinates();
        Point acoor1 = actor[4].getCoordinates();
        Point acoor2 = actor[5].getCoordinates();
        Point acoor3 = actor[6].getCoordinates();
        Point acoor4 = actor[7].getCoordinates();
        Map map = Escape.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        Location plocation = locations[pcoor.x][pcoor.y];
        Location Alocation1 = locations[acoor1.x][acoor1.y];
        Location Alocation2 = locations[acoor2.x][acoor2.y];
        Location Alocation3 = locations[acoor3.x][acoor3.y];
        Location Alocation4 = locations[acoor4.x][acoor4.y];
        this.console.println("Jaba Island Map");
        this.console.println("\n     0 ,  1 ,  2 ,  3 ,  4 ,  5 ,  6 ,  7 ,  8 ,  9 , 10 , 11 , 12 , 13 , 14 , 15 , 16 , 17 , 18 , 19 "
                + "\n--------------------------------------------------------------------------------------------------");
        for (int i = 0; i < map.getRowCount(); i++) {
            this.console.print(i + " | ");
            for (int j = 0; j < map.getColCount(); j++) {
                Location location = locations[i][j];
                String symbol = location.getScene().getSymbol();
                if (location == plocation) {
                    this.console.print("%YOU%" + " | ");
                } else if (location == Alocation1) {
                    this.console.print("JEB" + " | ");
                } else if (location == Alocation1 & location == Alocation2 & location == Alocation3 & location == Alocation4) {
                    this.console.print("CREW" + " | ");
                } else if (location == Alocation2) {
                    this.console.print("JACK" + " | ");
                } else if (location == Alocation3) {
                    this.console.print("NED" + " | ");
                } else if (location == Alocation4) {
                    this.console.print("TOBY" + " | ");

                } else if (symbol == "OC") {
                    this.console.print("~~" + " | ");
                } else {
                    this.console.print(symbol + " | ");
                }
            }
            this.console.println("\n--------------------------------------------------------------------------------------------------");
        }
        return locations;
    }

    @Override
    public boolean doAction(Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
