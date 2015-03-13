/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Kale
 */
public enum Actor implements Serializable {
    
    Barbarian("He is a ruthless canible barbarian be aware of my bite"),
    Jeb("A former crew mate ho is an overal nice guy"),
    Jack("A rude an mean crew mate who wont hesitate to stab you in the back"),
    Ned("He could be a big help to you if yoou can trust him");
    
    

    private final String description;
    private final Point coordinates;


    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }


    public String getDescription() {
        return description;
    }



    public Point getCoordinates() {
        return coordinates;
    }


    @Override
    public String toString() {
        return "Actor{" + "name=" + ", description=" + description + ", coordinates=" + coordinates + '}';
    }


    
    
    
}
