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
public class Inventory implements Serializable{
    private String inventorytype;
    private int quantity;
    private int quantityneeded;

    public Inventory() {
    }

    
    
    public String getInventorytype() {
        return inventorytype;
    }

    public void setInventorytype(String inventorytype) {
        this.inventorytype = inventorytype;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantityneeded() {
        return quantityneeded;
    }

    public void setQuantityneeded(int quantityneeded) {
        this.quantityneeded = quantityneeded;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventorytype=" + inventorytype + ", quantity=" + quantity + ", quantityneeded=" + quantityneeded + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.inventorytype);
        hash = 41 * hash + this.quantity;
        hash = 41 * hash + this.quantityneeded;
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
        return true;
    }

   
    
    
    
}
