/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape;

import byui.cit260.escape.model.Bag;
import byui.cit260.escape.model.Game;
import byui.cit260.escape.model.Inventory;
import byui.cit260.escape.model.Player;
import byui.cit260.escape.model.Raft;
import byui.cit260.escape.model.Tools;
import byui.cit260.escape.model.Workbench;
import javax.tools.Tool;

/**
 *
 * @author Kale
 */
public class Escape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           Player playerOne = new Player();
           
           playerOne.setName("Captin Kale");
           playerOne.setDays(10.00);
           
           String playerInfo = playerOne.toString();
           System.out.println(playerInfo);
     
           Raft raftdes = new Raft();
           
           raftdes.setDescription("its gonna be big");
           raftdes.setLoglength(20);
           raftdes.setLogwidth(10);
           raftdes.setStoragespace(50);
           raftdes.setPlayerspace(10);
           raftdes.setMaxweight(10);
           
           String RaftInfo = raftdes.toString();
           System.out.println(RaftInfo);
           
           Game gameDay = new Game();
           
           gameDay.setDay(13);
           gameDay.setNoPeople(1);
           
           String gameInfo = gameDay.toString();
           System.out.println(gameInfo);
           
           Inventory invquantities = new Inventory();
           
           invquantities.setInventorytype("logs");
           invquantities.setQuantity(15);
           invquantities.setQuantityneeded(12);
           
           String inventoryinfo = invquantities.toString();
           System.out.println(inventoryinfo);
           
           Bag bagitems = new Bag();
           
           bagitems.setItemtype("hammer");
           bagitems.setQuantity(15);
           
           String searchbag = bagitems.toString();
           System.out.println(searchbag);
           
           Tools tooltime = new Tools();
           
           tooltime.setTool("hatchet");
           
           String obtaintool = tooltime.toString();
           System.out.println(obtaintool);
           
           Workbench build = new Workbench();
           
           build.setDiscription("you can make tools with me");
           
           String craft = build.toString();
           System.out.println(craft);
    }
    
}
