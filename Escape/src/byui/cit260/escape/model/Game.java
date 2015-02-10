/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.model;

import java.io.Serializable;

/**
 *
 * @author Kale
 */
public class Game implements Serializable{
    
    private double turn;
    private int noPeople;

    public Game() {
    }
    
    

    public double getTurn() {
        return turn;
    }

    public void setTurn(double turn) {
        this.turn = turn;
    }

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }

    @Override
    public String toString() {
        return "Game{" + "turn=" + turn + ", noPeople=" + noPeople + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.turn) ^ (Double.doubleToLongBits(this.turn) >>> 32));
        hash = 83 * hash + this.noPeople;
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.turn) != Double.doubleToLongBits(other.turn)) {
            return false;
        }
        if (this.noPeople != other.noPeople) {
            return false;
        }
        return true;
    }
    
    
    
}
