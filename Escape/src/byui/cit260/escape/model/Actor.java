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

    Barbarian1("Barbarian", "He is a ruthless canible barbarian be aware of my bite", new Point(9, 5)),
    Barbarian2("Barbarian", "He is a ruthless canible barbarian be aware of my bite", new Point(6, 9)),
    Barbarian3("Barbarian", "He is a ruthless canible barbarian be aware of my bite", new Point(9, 11)),
    Barbarian4("Barbarian", "He is a ruthless canible barbarian be aware of my bite", new Point(12, 8)),
    Jeb("Jeb", "A former crew mate ho is an overal nice guy", new Point(8, 3)),
    Jack("Jack", "A rude an mean crew mate who wont hesitate to stab you in the back", new Point(15, 7)),
    Ned("Ned", "He could be a big help to you if yoou can trust him", new Point(10, 15)),
    Toby("Toby", "He could be a big help to you if yoou can trust him", new Point(4, 9));

    private final String name;
    private final String description;
    private final Point coordinates;

    Actor(String name, String description, Point coordinates) {
        this.name = name;
        this.coordinates = coordinates;
        this.description = description;

    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }

}
