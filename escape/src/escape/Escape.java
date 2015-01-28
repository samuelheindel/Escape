/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape;

import byui.cit260.escape.model.Game;
import byui.cit260.escape.model.Player;
import byui.cit260.escape.model.Raft;

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
    }
    
}
