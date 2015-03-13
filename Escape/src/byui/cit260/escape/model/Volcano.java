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
public class Volcano implements Serializable{
        
    
        private double countDown;

    public Volcano() {
    this.countDown = 240;
    }
       

    public double getCountDown() {
        return countDown;
    }

    public void setCountDown(int countDown) {
        this.countDown = countDown;
    }

    @Override
    public String toString() {
        return "Volcano{" + "countDown=" + countDown + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (int) (59 * hash + this.countDown);
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
        final Volcano other = (Volcano) obj;
        if (this.countDown != other.countDown) {
            return false;
        }
        return true;
    }
        
        
    
}
