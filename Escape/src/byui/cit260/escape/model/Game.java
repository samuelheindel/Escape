/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Kale
 */
public class Game implements Serializable {

    private Game game;
    private Player player;
    private double turn;
    private int noPeople;
    private Inventory[] inventory;
    private Tools[] tools;

    private Volcano volcano;
    private Raft raft;
    private Map map;

    public Game() {
    }



    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }

    public Tools[] getTools() {
        return tools;
    }

    public void setTools(Tools[] tools) {
        this.tools = tools;
    }

    public double getTurn() {
        return turn;
    }

    public void setTurn(double turn) {
        this.turn = turn;
    }

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Volcano getVolcano() {
        return volcano;
    }

    public void setVolcano(Volcano volcano) {
        this.volcano = volcano;
    }

    public Raft getRaft() {
        return raft;
    }

    public void setRaft(Raft raft) {
        this.raft = raft;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Game{" + "game=" + game + ", player=" + player + ", turn=" + turn + ", noPeople=" + noPeople + ", inventory=" + inventory + ", tools=" + tools + ", actorlocation=" + ", volcano=" + volcano + ", raft=" + raft + ", map=" + map + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.game);
        hash = 97 * hash + Objects.hashCode(this.player);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.turn) ^ (Double.doubleToLongBits(this.turn) >>> 32));
        hash = 97 * hash + this.noPeople;
        hash = 97 * hash + Arrays.deepHashCode(this.inventory);
        hash = 97 * hash + Arrays.deepHashCode(this.tools);
        hash = 97 * hash + Objects.hashCode(this.volcano);
        hash = 97 * hash + Objects.hashCode(this.raft);
        hash = 97 * hash + Objects.hashCode(this.map);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.game, other.game)) {
            return false;
        }
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        if (Double.doubleToLongBits(this.turn) != Double.doubleToLongBits(other.turn)) {
            return false;
        }
        if (this.noPeople != other.noPeople) {
            return false;
        }
        if (!Arrays.deepEquals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Arrays.deepEquals(this.tools, other.tools)) {
            return false;
        }

        if (!Objects.equals(this.volcano, other.volcano)) {
            return false;
        }
        if (!Objects.equals(this.raft, other.raft)) {
            return false;
        }
        if (!Objects.equals(this.map, other.map)) {
            return false;
        }
        return true;
    }



}
