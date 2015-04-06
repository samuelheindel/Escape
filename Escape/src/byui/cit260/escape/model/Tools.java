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
 * @author samuel
 */
public class Tools implements Serializable {

    private String description;
    private int damage;
    private int gather;

    public Tools(String description, int damage, int gather) {
        this.damage = damage;
        this.description = description;
        this.gather = gather;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getGather() {
        return gather;
    }

    public void setGather(int gather) {
        this.gather = gather;
    }

    @Override
    public String toString() {
        return "Tools{" + "description=" + description + ", damage=" + damage + ", gather=" + gather + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + this.damage;
        hash = 37 * hash + this.gather;
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
        final Tools other = (Tools) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.damage != other.damage) {
            return false;
        }
        if (this.gather != other.gather) {
            return false;
        }
        return true;
    }

}
