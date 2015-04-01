/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.control;

import byui.cit260.escape.model.Actor;
import byui.cit260.escape.model.Location;
import byui.cit260.escape.model.Map;
import byui.cit260.escape.model.Player;
import byui.cit260.escape.model.Scene;
import escape.Escape;
import exceptions.MapControlExceptions;
import exceptions.VolcanoControlException;
import java.awt.Point;

/**
 *
 * @author Kale
 */
public class MapControl {

    public static Scene moveActorToLocation(Actor actor, Point coordinates) throws MapControlExceptions, VolcanoControlException {

        Map map = Escape.getCurrentGame().getMap();
        int newRow = coordinates.x;
        int newColumn = coordinates.y;

        if (newRow < 0 || newRow >= map.getRowCount()
                || newColumn < 0 || newColumn >= map.getColCount()) {
            throw new MapControlExceptions("Can not move actor to the location"
                    + coordinates.x + ", " + coordinates.y
                    + " because the location is outside"
                    + " the bounds of the map.");

        }
        Location[][] locations = Escape.getCurrentGame().getMap().getLocations();
        Scene scene = locations[newRow][newColumn].getScene();
        Point actorlocation = actor.getCoordinates();
        actorlocation.x = coordinates.x;
        actorlocation.y = coordinates.y;
        VolcanoControl.VolcanoControlSubtract();
        return scene;
    }

    public static void moveActorsToStartingLocation(Map map) throws MapControlExceptions, VolcanoControlException {
        //for every actor 
        Actor[] actors = Actor.values();

        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            MapControl.moveActorToLocation(actor, coordinates);

        }
    }

    public static Scene movePlayerToLocation(Player player, Point coordinates) throws MapControlExceptions, VolcanoControlException {

        Map map = Escape.getCurrentGame().getMap();
        int newRow = coordinates.x;
        int newColumn = coordinates.y;

        if (newRow < 0 || newRow >= map.getRowCount()
                || newColumn < 0 || newColumn >= map.getColCount()) {
            throw new MapControlExceptions("Can not move actor to the location"
                    + coordinates.x + ", " + coordinates.y
                    + " because the location is outside"
                    + " the bounds of the map.");

        }
        Location[][] locations = Escape.getCurrentGame().getMap().getLocations();
        Scene scene = locations[newRow][newColumn].getScene();
        Point playerlocation = player.getCoordinates();
        playerlocation.x = coordinates.x;
        playerlocation.y = coordinates.y;
        VolcanoControl.VolcanoControlSubtract();
//        get old location
//                remove player from old location
//                        get new loation 
//                                assigne player to new location. 
        return scene;
    }
}
