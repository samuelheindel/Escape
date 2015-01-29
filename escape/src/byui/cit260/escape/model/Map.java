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
public class Map implements Serializable {
    
       private double rowCount;
       private double colCount;

    public Map() {
    }
       
       

    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getColCount() {
        return colCount;
    }

    public void setColCount(double colCount) {
        this.colCount = colCount;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCount=" + colCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.colCount) ^ (Double.doubleToLongBits(this.colCount) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        return Double.doubleToLongBits(this.colCount) == Double.doubleToLongBits(other.colCount);
    }
       
       
}
