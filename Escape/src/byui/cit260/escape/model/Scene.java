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

    ocean("This area is Ocaean There is nothing you can gather here, and you might want to move", "OC"),
    beach("This is the beach, a Sandy place around the island this is a good place to go fishing", "BE"),
    jungle("This is the Jungle, thick Wild trees this area isnt good for much but is often surrounded by barbarians","JU"),
    volcano("This is the volcano it could erupt any time","VO"),
    river("This is the river a great place to get fresh water","RI"),
    palmtree("Here are palmtrees tehy can be used to make logs, you can also get coconuts and logs from them","PT"),
    cliff("the clifs are have a good view but arnt good for much dont fall off me","CF"),
    pigs("Here are some pigs they are good for meat", "PI"),
    barbarian("Watch out barbarians are here beware they might be canibles","BB"),
    start("this is where you will start, you can see the volcano smoking in the distance and a jungle ahead","ST"),
    ferns("Used to make rope","FR"),
    fruit("This area contains fruit trees they are great to eat.","FT"),
    stones("This is a stoney area. The stones are great for making tools.","SN"),
    sticks("This is an area covered in old drift wood. they could be great for making tools","SK"),
    raft("This looks like a good place to build your raft.","RT"),
    workbench("This area has a large flat rock in it that would be a great workbench for crafting items", "WB"),
    launch("This looks like a perfect place to launch your raft.","LCH"),;

    private String description;
    private String symbol;

    Scene(String description, String symbol) {
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
