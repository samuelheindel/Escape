/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.model.Location;
import byui.cit260.escape.model.Map;
import escape.Escape;

/**
 *
 * @author samuel
 */
public class MapView {

    Location[][] displayMap() {
        Map map = Escape.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        System.out.println("Jaba Island Map");
        System.out.println("  1  ,  2  ,  3  ,  4  ,  5  ,  6  ,  7  ,  8  ,  9  ,  10  ,  11  ,  12  ,  13  ,  14  ,  15  ,  16  ,  17  ,  18  ,  19  ,  20  ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < map.getRowCount(); i++) {
            System.out.println("\t" + i + " | ");
            for (int j = 0; j < map.getColCount(); j++) {
                Location location = locations[i][j];
                String symbol = location.getScene().getSymbol();
                System.out.println(symbol + " | ");
            }
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------");
        }
        return locations;
    }
}
