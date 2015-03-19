/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.model;

import byui.cit260.escape.control.MapControl;
import escape.Escape;
import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.Objects;
import javax.swing.ImageIcon;

/**
 *
 * @author Kale
 */
public enum Scenes implements Serializable {

    ocean("the wide blue sea", "OC"),
    beach("Sandy place around the island", "BE"),
    jungle("Thick Wild trees","JU"),
    volcano("COuld erupt any time","VO"),
    river("Place to get fresh water","RI"),
    palmtree("Can get coconuts and logs from me","PT"),
    cliff("dont fall off me","CF"),
    pigs("For meat", "PI"),
    barbarian("Beware they might be canibles","BB"),
    start("this is where you will start","ST"),
    ferns("used to make rope","FR"),
    fruit("good to eat","FT"),
    stones("Used to make tools", "SN"),
    sticks("Used to make tools","SK"),
    raft("Wher you will build your raft","RT"),
    workbench("Where you can Build tools", "WB"),
    launch("Where you will one day launch a raft","LCH"),;

    private String description;
    private String symbol;

    Scenes(String description, String symbol) {
        this.description = description;
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Scenes{" + "description=" + description + ", symbol=" + symbol + '}';
    }


}
