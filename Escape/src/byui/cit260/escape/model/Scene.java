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
public enum Scene implements Serializable {

    ocean("This area is Ocaean There is nothing you can gather here, and you might want to move", "OC", 0),
    beach("This is the beach, a Sandy place around the island this is a good place to go fishing", "BE", 0),
    jungle("This is the Jungle, thick Wild trees this area isnt good for much but is often surrounded by barbarians","JU", 0),
    volcano("This is the volcano it could erupt any time","VO", 0),
    river("This is the river a great place to get fresh water","RI", 1),
    palmtree("Here are palmtrees they can be used to make logs, you can also get coconuts and logs from them","PT", 5),
    cliff("the clifs are have a good view but arnt good for much dont fall off me","CF", 0),
    pigs("Here are some pigs they are good for meat", "PI", 1),
    barbarian("Watch out barbarians are here beware they might be canibles","BB", 1),
    start("this is where you will start, you can see the volcano smoking in the distance and a jungle ahead","ST", 0),
    ferns("This area contains ferns. They are used to make rope","FR", 10),
    fruit("This area contains fruit trees they are great to eat.","FT", 1),
    stones("This is a stoney area. The stones are great for making tools.","SN", 1),
    sticks("This is an area covered in old drift wood. they could be great for making tools","SK", 1),
    raft("This looks like a good place to build your raft.","RT", 0),
    workbench("This area has a large flat rock in it that would be a great workbench for crafting items", "WB", 0),
    launch("This looks like a perfect place to launch your raft.","LCH",0),;

    private String description;
    private String symbol;
    private double amount;

    Scene(String description, String symbol, double amount) {
        this.description = description;
        this.symbol = symbol;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
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
