/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape;

import byui.cit260.escape.model.Actor;
import byui.cit260.escape.model.Game;
import byui.cit260.escape.model.Inventory;
import byui.cit260.escape.model.Location;
import byui.cit260.escape.model.Map;
import byui.cit260.escape.model.Player;
import byui.cit260.escape.model.Raft;
import byui.cit260.escape.model.Scenes;
import byui.cit260.escape.model.Volcano;
import byui.cit260.escape.model.Workbench;
import byui.cit260.escape.view.StartProgramView;

/**
 *
 * @author Kale
 */
public class Escape {

    
    private static Game currentGame = null;
    private static Player player =  null;
   
    
    
  
    public static void main(String[] args) {
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();
                 
         
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Escape.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Escape.player = player;
    }

    
    
    
    
    
  
}
