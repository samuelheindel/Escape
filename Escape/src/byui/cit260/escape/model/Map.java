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

    private int rowCount;
    private int colCount;
    private Location[][] locations;

    public Map() {
    }

    public Map(int rowCount, int colCount) {
        if (rowCount < 1 || colCount < 1) {
            System.out.println("The number of rows and columns must be greater than zero");
            return;
        }
        this.rowCount = rowCount;
        this.colCount = colCount;

        //creat 2-d array for location objects
        this.locations = new Location[rowCount][colCount];

        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < colCount; column++) {
                //creat and initialize new location object instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);

                //assign the location object to a current location in  array
                locations[row][column] = location;
            }
        }
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColCount() {
        return colCount;
    }

    public void setColCount(int colCount) {
        this.colCount = colCount;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", colCount=" + colCount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.rowCount;
        hash = 47 * hash + this.colCount;
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
        if (this.rowCount != other.rowCount) {
            return false;
        }
        return this.colCount == other.colCount;
    }


}
