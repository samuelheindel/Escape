/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Kale
 */
public class Location implements Serializable {

    private int row;
    private int column;
    private boolean visited;
    private Scene scene;
    private Actor actors;

    public Location() {
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Actor getActors() {
        return actors;
    }

    public void setActors(Actor actors) {
        this.actors = actors;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.row;
        hash = 29 * hash + this.column;
        hash = 29 * hash + (this.visited ? 1 : 0);
        hash = 29 * hash + Objects.hashCode(this.scene);
        hash = 29 * hash + Objects.hashCode(this.actors);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.scene != other.scene) {
            return false;
        }
        if (this.actors != other.actors) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", scene=" + scene + ", actors=" + actors + '}';
    }



}
