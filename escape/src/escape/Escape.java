/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape;

import byui.cit260.escape.model.Actor;
import byui.cit260.escape.model.Bag;
import byui.cit260.escape.model.Game;
import byui.cit260.escape.model.Inventory;
import byui.cit260.escape.model.Location;
import byui.cit260.escape.model.Map;
import byui.cit260.escape.model.Player;
import byui.cit260.escape.model.Raft;
import byui.cit260.escape.model.Scene;
import byui.cit260.escape.model.Tools;
import byui.cit260.escape.model.Volcano;
import byui.cit260.escape.model.Workbench;

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
           
           Map mapLoc = new Map();
           mapLoc.setRowCount(5);
           mapLoc.setColCount(5);
           String map = mapLoc.toString();
           System.out.println(map);
           
           Location locInfo = new Location();
           locInfo.setRow(5);
           locInfo.setColumn(5);
           locInfo.setVisited(true);
           String location = locInfo.toString();
           System.out.println(location);
           
           Actor actorInfo = new Actor();
           actorInfo.setName("Kale");
           String actor = actorInfo.toString();
           System.out.println(actor);
           
           Scene sceneInfo = new Scene();
           sceneInfo.setDescription("Something will happen to you");
           sceneInfo.setTime(12.30);
           String scene = sceneInfo.toString();
           System.out.println(scene);
           
           Volcano timeLeft = new Volcano();
           timeLeft.setCountDown(20);
           String volcano = timeLeft.toString();
           System.out.println(volcano);
           
           
         
    }
    
}
