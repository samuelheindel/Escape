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
public class Raft implements Serializable {

    private String description;
    private double loglength;
    private double logwidth;
    private double storagespace;
    private double players;

    public Raft() {
        this.description = "\n This is the raft that can get you off hte island";
        this.loglength = 10;
        this.logwidth = 1;
        this.storagespace = 0;
        this.players = 1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String discription) {
        this.description = discription;
    }

    public double getLoglength() {
        return loglength;
    }

    public void setLoglength(int loglength) {
        this.loglength = loglength;
    }

    public double getLogwidth() {
        return logwidth;
    }

    public void setLogwidth(int logwidth) {
        this.logwidth = logwidth;
    }

    public double getStoragespce() {
        return storagespace;
    }

    public void setStoragespace(int storagespace) {
        this.storagespace = storagespace;
    }

    public double getPlayers() {
        return players;
    }

    public void setPlayers(int playerspace) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Raft{" + "discription=" + description + ", loglength=" + loglength + ", logwidth=" + logwidth + ", storagespce=" + ", playerspace=" + players + ", maxweight=" + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = (int) (79 * hash + this.loglength);
        hash = (int) (79 * hash + this.logwidth);
        hash = (int) (79 * hash + this.storagespace);
        hash = (int) (79 * hash + this.players);
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
        if (this.storagespace != other.storagespace) {
            return false;
        }
        if (this.players != other.players) {
            return false;
        }
        return true;
    }

}
