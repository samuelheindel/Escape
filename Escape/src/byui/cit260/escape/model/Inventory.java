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
public class Inventory implements Serializable {

    private String inventorytype;
    private double quantity;
    private double quantityneeded;
    private String description;

    public Inventory() {
    }

    public String getInventorytype() {
        return inventorytype;
    }

    public void setInventorytype(String inventorytype) {
        this.inventorytype = inventorytype;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantityneeded() {
        return quantityneeded;
    }

    public void setQuantityneeded(double quantityneeded) {
        this.quantityneeded = quantityneeded;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventorytype=" + inventorytype + ", quantity=" + quantity + ", quantityneeded=" + quantityneeded + ", description=" + description + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.inventorytype);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.quantity) ^ (Double.doubleToLongBits(this.quantity) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.quantityneeded) ^ (Double.doubleToLongBits(this.quantityneeded) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.description);
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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.inventorytype, other.inventorytype)) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        if (this.quantityneeded != other.quantityneeded) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

}
