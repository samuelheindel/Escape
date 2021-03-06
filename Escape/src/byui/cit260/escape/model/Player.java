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
public class Player implements Serializable {

    private String name;
    private Double days;
    private Point coordinates;

    public Player() {
        this.coordinates = new Point(15, 2);
        this.name = null;
        this.days = 24.00;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Point coordinates) {
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDays() {
        return days;
    }

    public void setDays(Double days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", days=" + days + ", coordinates=" + coordinates + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.days);
        hash = 59 * hash + Objects.hashCode(this.coordinates);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.days, other.days)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }

 
    }

  