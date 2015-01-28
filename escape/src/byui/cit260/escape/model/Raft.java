/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author samuel
 */
public class Raft implements Serializable{
    private String description;
    private int loglength;
    private int logwidth;
    private int storagespce;
    private int playerspace;
    private int maxweight;

    public Raft() {
    }

    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String discription) {
        this.description = discription;
    }

    public int getLoglength() {
        return loglength;
    }

    public void setLoglength(int loglength) {
        this.loglength = loglength;
    }

    public int getLogwidth() {
        return logwidth;
    }

    public void setLogwidth(int logwidth) {
        this.logwidth = logwidth;
    }

    public int getStoragespce() {
        return storagespce;
    }

    public void setStoragespace(int storagespace) {
        this.storagespce = storagespace;
    }

    public int getPlayerspace() {
        return playerspace;
    }

    public void setPlayerspace(int playerspace) {
        this.playerspace = playerspace;
    }

    public int getMaxweight() {
        return maxweight;
    }

    public void setMaxweight(int maxweight) {
        this.maxweight = maxweight;
    }

    @Override
    public String toString() {
        return "Raft{" + "discription=" + description + ", loglength=" + loglength + ", logwidth=" + logwidth + ", storagespce=" + storagespce + ", playerspace=" + playerspace + ", maxweight=" + maxweight + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + this.loglength;
        hash = 79 * hash + this.logwidth;
        hash = 79 * hash + this.storagespce;
        hash = 79 * hash + this.playerspace;
        hash = 79 * hash + this.maxweight;
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
        final Raft other = (Raft) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.loglength != other.loglength) {
            return false;
        }
        if (this.logwidth != other.logwidth) {
            return false;
        }
        if (this.storagespce != other.storagespce) {
            return false;
        }
        if (this.playerspace != other.playerspace) {
            return false;
        }
        if (this.maxweight != other.maxweight) {
            return false;
        }
        return true;
    }

    

}
