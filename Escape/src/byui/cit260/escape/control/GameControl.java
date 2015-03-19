/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.control;

import byui.cit260.escape.model.Game;
import byui.cit260.escape.model.Inventory;
import byui.cit260.escape.model.Item;
import byui.cit260.escape.model.Location;
import byui.cit260.escape.model.Map;
import byui.cit260.escape.model.Player;
import byui.cit260.escape.model.Raft;
import byui.cit260.escape.model.Scene;
import byui.cit260.escape.model.Volcano;
import escape.Escape;
import exceptions.MapControlExceptions;

/**
 *
 * @author Kale
 */
public class GameControl {

    public static void createNewGame(Player player) throws MapControlExceptions {

        Game game = new Game(); // creates ne game
        Escape.setCurrentGame(game);// save in esacpe

        game.setPlayer(player); // save player in game

        // create the inventory list and save in the game
        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);

        Volcano volcano = new Volcano(); // creates volcano
        game.setVolcano(volcano); // saves vocano in game

        Raft raft = new Raft(); // creates Raft
        game.setRaft(raft); // saves Raft in game

        Map map = GameControl.createMap();// create and initialize new map
        game.setMap(map);//save map in game

        //move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
    }

    private static Inventory[] createInventoryList() {
        Inventory[] inventory
                = new Inventory[6];

        Inventory logs = new Inventory();
        logs.setDescription("Logs");
        logs.setQuantity(0);
        logs.setQuantityneeded(0);
        inventory[Item.logs.ordinal()] = logs;

        Inventory rope = new Inventory();
        rope.setDescription("Rope");
        rope.setQuantity(0);
        rope.setQuantityneeded(0);
        inventory[Item.rope.ordinal()] = rope;

        Inventory storage = new Inventory();
        storage.setDescription("Storage crates");
        storage.setQuantity(0);
        storage.setQuantityneeded(0);
        inventory[Item.storage.ordinal()] = storage;

        Inventory meat = new Inventory();
        meat.setDescription("Meat");
        meat.setQuantity(0);
        meat.setQuantityneeded(0);
        inventory[Item.meat.ordinal()] = meat;

        Inventory fruit = new Inventory();
        fruit.setDescription("Fruit");
        fruit.setQuantity(0);
        fruit.setQuantityneeded(0);
        inventory[Item.fruit.ordinal()] = fruit;

        Inventory bag = new Inventory();
        bag.setDescription("bag");
        bag.setQuantity(1);
        bag.setQuantityneeded(1);
        inventory[Item.bag.ordinal()] = bag;
        return inventory;

    }

    private static Map createMap() {
        // creat map 
        Map map = new Map(20, 20);

        // asign scenes to locations
        GameControl.assignScenesToLocation(map);

        return map;
    }

    private static void assignScenesToLocation(Map map) {
        Location[][] locations = map.getLocations();

        locations[0][0].setScene(Scene.ocean);
        locations[0][1].setScene(Scene.ocean);
        locations[0][2].setScene(Scene.ocean);
        locations[0][3].setScene(Scene.ocean);
        locations[0][4].setScene(Scene.ocean);
        locations[0][5].setScene(Scene.ocean);
        locations[0][6].setScene(Scene.ocean);
        locations[0][7].setScene(Scene.ocean);
        locations[0][8].setScene(Scene.ocean);
        locations[0][9].setScene(Scene.ocean);
        locations[0][10].setScene(Scene.ocean);
        locations[0][11].setScene(Scene.ocean);
        locations[0][12].setScene(Scene.ocean);
        locations[0][13].setScene(Scene.ocean);
        locations[0][14].setScene(Scene.ocean);
        locations[0][15].setScene(Scene.ocean);
        locations[0][16].setScene(Scene.ocean);
        locations[0][17].setScene(Scene.ocean);
        locations[0][18].setScene(Scene.ocean);
        locations[0][19].setScene(Scene.ocean);

        locations[1][0].setScene(Scene.ocean);
        locations[1][1].setScene(Scene.ocean);
        locations[1][2].setScene(Scene.beach);
        locations[1][3].setScene(Scene.beach);
        locations[1][4].setScene(Scene.ocean);
        locations[1][5].setScene(Scene.ocean);
        locations[1][6].setScene(Scene.ocean);
        locations[1][7].setScene(Scene.ocean);
        locations[1][8].setScene(Scene.ocean);
        locations[1][9].setScene(Scene.ocean);
        locations[1][10].setScene(Scene.ocean);
        locations[1][11].setScene(Scene.ocean);
        locations[1][12].setScene(Scene.beach);
        locations[1][13].setScene(Scene.beach);
        locations[1][14].setScene(Scene.ocean);
        locations[1][15].setScene(Scene.ocean);
        locations[1][16].setScene(Scene.ocean);
        locations[1][17].setScene(Scene.ocean);
        locations[1][18].setScene(Scene.ocean);
        locations[1][19].setScene(Scene.ocean);

        locations[2][0].setScene(Scene.ocean);
        locations[2][1].setScene(Scene.ocean);
        locations[2][2].setScene(Scene.beach);
        locations[2][3].setScene(Scene.beach);
        locations[2][4].setScene(Scene.beach);
        locations[2][5].setScene(Scene.beach);
        locations[2][6].setScene(Scene.beach);
        locations[2][7].setScene(Scene.beach);
        locations[2][8].setScene(Scene.beach);
        locations[2][9].setScene(Scene.beach);
        locations[2][10].setScene(Scene.beach);
        locations[2][11].setScene(Scene.beach);
        locations[2][12].setScene(Scene.river);
        locations[2][13].setScene(Scene.beach);
        locations[2][14].setScene(Scene.beach);
        locations[2][15].setScene(Scene.beach);
        locations[2][16].setScene(Scene.beach);
        locations[2][17].setScene(Scene.beach);
        locations[2][18].setScene(Scene.ocean);
        locations[2][19].setScene(Scene.ocean);

        locations[3][0].setScene(Scene.ocean);
        locations[3][1].setScene(Scene.ocean);
        locations[3][2].setScene(Scene.beach);
        locations[3][3].setScene(Scene.beach);
        locations[3][4].setScene(Scene.palmtree);
        locations[3][5].setScene(Scene.palmtree);
        locations[3][6].setScene(Scene.palmtree);
        locations[3][7].setScene(Scene.palmtree);
        locations[3][8].setScene(Scene.sticks);
        locations[3][9].setScene(Scene.palmtree);
        locations[3][10].setScene(Scene.palmtree);
        locations[3][11].setScene(Scene.palmtree);
        locations[3][12].setScene(Scene.river);
        locations[3][13].setScene(Scene.palmtree);
        locations[3][14].setScene(Scene.palmtree);
        locations[3][15].setScene(Scene.beach);
        locations[3][16].setScene(Scene.beach);
        locations[3][17].setScene(Scene.beach);
        locations[3][18].setScene(Scene.ocean);
        locations[3][19].setScene(Scene.ocean);

        locations[4][0].setScene(Scene.ocean);
        locations[4][1].setScene(Scene.ocean);
        locations[4][2].setScene(Scene.beach);
        locations[4][3].setScene(Scene.beach);
        locations[4][4].setScene(Scene.palmtree);
        locations[4][5].setScene(Scene.sticks);
        locations[4][6].setScene(Scene.ferns);
        locations[4][7].setScene(Scene.ferns);
        locations[4][8].setScene(Scene.beach);
        locations[4][9].setScene(Scene.palmtree);
        locations[4][10].setScene(Scene.stones);
        locations[4][11].setScene(Scene.palmtree);
        locations[4][12].setScene(Scene.river);
        locations[4][13].setScene(Scene.palmtree);
        locations[4][14].setScene(Scene.ferns);
        locations[4][15].setScene(Scene.palmtree);
        locations[4][16].setScene(Scene.beach);
        locations[4][17].setScene(Scene.ocean);
        locations[4][18].setScene(Scene.ocean);
        locations[4][19].setScene(Scene.ocean);

        locations[5][0].setScene(Scene.ocean);
        locations[5][1].setScene(Scene.ocean);
        locations[5][2].setScene(Scene.ocean);
        locations[5][3].setScene(Scene.beach);
        locations[5][4].setScene(Scene.palmtree);
        locations[5][5].setScene(Scene.ferns);
        locations[5][6].setScene(Scene.palmtree);
        locations[5][7].setScene(Scene.pigs);
        locations[5][8].setScene(Scene.ferns);
        locations[5][9].setScene(Scene.barbarian);
        locations[5][10].setScene(Scene.palmtree);
        locations[5][11].setScene(Scene.palmtree);
        locations[5][12].setScene(Scene.ferns);
        locations[5][13].setScene(Scene.palmtree);
        locations[5][14].setScene(Scene.sticks);
        locations[5][15].setScene(Scene.palmtree);
        locations[5][16].setScene(Scene.beach);
        locations[5][17].setScene(Scene.ocean);
        locations[5][18].setScene(Scene.ocean);
        locations[5][19].setScene(Scene.ocean);

        locations[6][0].setScene(Scene.ocean);
        locations[6][1].setScene(Scene.ocean);
        locations[6][2].setScene(Scene.ocean);
        locations[6][3].setScene(Scene.beach);
        locations[6][4].setScene(Scene.palmtree);
        locations[6][5].setScene(Scene.fruit);
        locations[6][6].setScene(Scene.palmtree);
        locations[6][7].setScene(Scene.jungle);
        locations[6][8].setScene(Scene.jungle);
        locations[6][9].setScene(Scene.jungle);
        locations[6][10].setScene(Scene.jungle);
        locations[6][11].setScene(Scene.jungle);
        locations[6][12].setScene(Scene.pigs);
        locations[6][13].setScene(Scene.palmtree);
        locations[6][14].setScene(Scene.beach);
        locations[6][15].setScene(Scene.palmtree);
        locations[6][16].setScene(Scene.beach);
        locations[6][17].setScene(Scene.ocean);
        locations[6][18].setScene(Scene.ocean);
        locations[6][19].setScene(Scene.ocean);

        locations[7][0].setScene(Scene.ocean);
        locations[7][1].setScene(Scene.ocean);
        locations[7][2].setScene(Scene.ocean);
        locations[7][3].setScene(Scene.beach);
        locations[7][4].setScene(Scene.sticks);
        locations[7][5].setScene(Scene.fruit);
        locations[7][6].setScene(Scene.ferns);
        locations[7][7].setScene(Scene.jungle);
        locations[7][8].setScene(Scene.volcano);
        locations[7][9].setScene(Scene.volcano);
        locations[7][10].setScene(Scene.volcano);
        locations[7][11].setScene(Scene.jungle);
        locations[7][12].setScene(Scene.ferns);
        locations[7][13].setScene(Scene.fruit);
        locations[7][14].setScene(Scene.ferns);
        locations[7][15].setScene(Scene.ferns);
        locations[7][16].setScene(Scene.beach);
        locations[7][17].setScene(Scene.ocean);
        locations[7][18].setScene(Scene.ocean);
        locations[7][19].setScene(Scene.ocean);

        locations[8][0].setScene(Scene.ocean);
        locations[8][1].setScene(Scene.ocean);
        locations[8][2].setScene(Scene.ocean);
        locations[8][3].setScene(Scene.beach);
        locations[8][4].setScene(Scene.palmtree);
        locations[8][5].setScene(Scene.ferns);
        locations[8][6].setScene(Scene.pigs);
        locations[8][7].setScene(Scene.jungle);
        locations[8][8].setScene(Scene.volcano);
        locations[8][9].setScene(Scene.volcano);
        locations[8][10].setScene(Scene.volcano);
        locations[8][11].setScene(Scene.jungle);
        locations[8][12].setScene(Scene.barbarian);
        locations[8][13].setScene(Scene.fruit);
        locations[8][14].setScene(Scene.palmtree);
        locations[8][15].setScene(Scene.palmtree);
        locations[8][16].setScene(Scene.beach);
        locations[8][17].setScene(Scene.beach);
        locations[8][18].setScene(Scene.ocean);
        locations[8][19].setScene(Scene.ocean);

        locations[9][0].setScene(Scene.ocean);
        locations[9][1].setScene(Scene.ocean);
        locations[9][2].setScene(Scene.ocean);
        locations[9][3].setScene(Scene.beach);
        locations[9][4].setScene(Scene.beach);
        locations[9][5].setScene(Scene.beach);
        locations[9][6].setScene(Scene.barbarian);
        locations[9][7].setScene(Scene.jungle);
        locations[9][8].setScene(Scene.volcano);
        locations[9][9].setScene(Scene.volcano);
        locations[9][10].setScene(Scene.volcano);
        locations[9][11].setScene(Scene.jungle);
        locations[9][12].setScene(Scene.pigs);
        locations[9][13].setScene(Scene.palmtree);
        locations[9][14].setScene(Scene.stones);
        locations[9][15].setScene(Scene.palmtree);
        locations[9][16].setScene(Scene.beach);
        locations[9][17].setScene(Scene.beach);
        locations[9][18].setScene(Scene.beach);
        locations[9][19].setScene(Scene.ocean);

        locations[10][0].setScene(Scene.ocean);
        locations[10][1].setScene(Scene.ocean);
        locations[10][2].setScene(Scene.ocean);
        locations[10][3].setScene(Scene.beach);
        locations[10][4].setScene(Scene.palmtree);
        locations[10][5].setScene(Scene.palmtree);
        locations[10][6].setScene(Scene.ferns);
        locations[10][7].setScene(Scene.jungle);
        locations[10][8].setScene(Scene.jungle);
        locations[10][9].setScene(Scene.jungle);
        locations[10][10].setScene(Scene.jungle);
        locations[10][11].setScene(Scene.jungle);
        locations[10][12].setScene(Scene.palmtree);
        locations[10][13].setScene(Scene.beach);
        locations[10][14].setScene(Scene.palmtree);
        locations[10][15].setScene(Scene.palmtree);
        locations[10][16].setScene(Scene.beach);
        locations[10][17].setScene(Scene.ocean);
        locations[10][18].setScene(Scene.ocean);
        locations[10][19].setScene(Scene.ocean);

        locations[11][0].setScene(Scene.ocean);
        locations[11][1].setScene(Scene.ocean);
        locations[11][2].setScene(Scene.ocean);
        locations[11][3].setScene(Scene.beach);
        locations[11][4].setScene(Scene.palmtree);
        locations[11][5].setScene(Scene.palmtree);
        locations[11][6].setScene(Scene.palmtree);
        locations[11][7].setScene(Scene.pigs);
        locations[11][8].setScene(Scene.ferns);
        locations[11][9].setScene(Scene.barbarian);
        locations[11][10].setScene(Scene.ferns);
        locations[11][11].setScene(Scene.palmtree);
        locations[11][12].setScene(Scene.ferns);
        locations[11][13].setScene(Scene.palmtree);
        locations[11][14].setScene(Scene.ferns);
        locations[11][15].setScene(Scene.palmtree);
        locations[11][16].setScene(Scene.beach);
        locations[11][17].setScene(Scene.ocean);
        locations[11][18].setScene(Scene.ocean);
        locations[11][19].setScene(Scene.ocean);

        locations[12][0].setScene(Scene.ocean);
        locations[12][1].setScene(Scene.ocean);
        locations[12][2].setScene(Scene.ocean);
        locations[12][3].setScene(Scene.beach);
        locations[12][4].setScene(Scene.palmtree);
        locations[12][5].setScene(Scene.fruit);
        locations[12][6].setScene(Scene.ferns);
        locations[12][7].setScene(Scene.river);
        locations[12][8].setScene(Scene.palmtree);
        locations[12][9].setScene(Scene.palmtree);
        locations[12][10].setScene(Scene.palmtree);
        locations[12][11].setScene(Scene.palmtree);
        locations[12][12].setScene(Scene.fruit);
        locations[12][13].setScene(Scene.palmtree);
        locations[12][14].setScene(Scene.sticks);
        locations[12][15].setScene(Scene.cliff);
        locations[12][16].setScene(Scene.beach);
        locations[12][17].setScene(Scene.ocean);
        locations[12][18].setScene(Scene.ocean);
        locations[12][19].setScene(Scene.ocean);

        locations[13][0].setScene(Scene.ocean);
        locations[13][1].setScene(Scene.ocean);
        locations[13][2].setScene(Scene.ocean);
        locations[13][3].setScene(Scene.workbench);
        locations[13][4].setScene(Scene.palmtree);
        locations[13][5].setScene(Scene.ferns);
        locations[13][6].setScene(Scene.sticks);
        locations[13][7].setScene(Scene.river);
        locations[13][8].setScene(Scene.ferns);
        locations[13][9].setScene(Scene.beach);
        locations[13][10].setScene(Scene.fruit);
        locations[13][11].setScene(Scene.fruit);
        locations[13][12].setScene(Scene.ferns);
        locations[13][13].setScene(Scene.palmtree);
        locations[13][14].setScene(Scene.palmtree);
        locations[13][15].setScene(Scene.cliff);
        locations[13][16].setScene(Scene.beach);
        locations[13][17].setScene(Scene.beach);
        locations[13][18].setScene(Scene.ocean);
        locations[13][19].setScene(Scene.ocean);

        locations[14][0].setScene(Scene.ocean);
        locations[14][1].setScene(Scene.ocean);
        locations[14][2].setScene(Scene.launch);
        locations[14][3].setScene(Scene.raft);
        locations[14][4].setScene(Scene.palmtree);
        locations[14][5].setScene(Scene.stones);
        locations[14][6].setScene(Scene.river);
        locations[14][7].setScene(Scene.ferns);
        locations[14][8].setScene(Scene.stones);
        locations[14][9].setScene(Scene.palmtree);
        locations[14][10].setScene(Scene.palmtree);
        locations[14][11].setScene(Scene.ferns);
        locations[14][12].setScene(Scene.stones);
        locations[14][13].setScene(Scene.palmtree);
        locations[14][14].setScene(Scene.palmtree);
        locations[14][15].setScene(Scene.cliff);
        locations[14][16].setScene(Scene.beach);
        locations[14][17].setScene(Scene.beach);
        locations[14][18].setScene(Scene.ocean);
        locations[14][19].setScene(Scene.ocean);

        locations[15][0].setScene(Scene.ocean);
        locations[15][1].setScene(Scene.ocean);
        locations[15][2].setScene(Scene.start);
        locations[15][3].setScene(Scene.beach);
        locations[15][4].setScene(Scene.palmtree);
        locations[15][5].setScene(Scene.river);
        locations[15][6].setScene(Scene.palmtree);
        locations[15][7].setScene(Scene.palmtree);
        locations[15][8].setScene(Scene.palmtree);
        locations[15][9].setScene(Scene.palmtree);
        locations[15][10].setScene(Scene.sticks);
        locations[15][11].setScene(Scene.palmtree);
        locations[15][12].setScene(Scene.palmtree);
        locations[15][13].setScene(Scene.cliff);
        locations[15][14].setScene(Scene.cliff);
        locations[15][15].setScene(Scene.cliff);
        locations[15][16].setScene(Scene.beach);
        locations[15][17].setScene(Scene.beach);
        locations[15][18].setScene(Scene.ocean);
        locations[15][19].setScene(Scene.ocean);

        locations[16][0].setScene(Scene.ocean);
        locations[16][1].setScene(Scene.ocean);
        locations[16][2].setScene(Scene.ocean);
        locations[16][3].setScene(Scene.beach);
        locations[16][4].setScene(Scene.river);
        locations[16][5].setScene(Scene.beach);
        locations[16][6].setScene(Scene.beach);
        locations[16][7].setScene(Scene.beach);
        locations[16][8].setScene(Scene.beach);
        locations[16][9].setScene(Scene.beach);
        locations[16][10].setScene(Scene.beach);
        locations[16][11].setScene(Scene.beach);
        locations[16][12].setScene(Scene.beach);
        locations[16][13].setScene(Scene.beach);
        locations[16][14].setScene(Scene.beach);
        locations[16][15].setScene(Scene.beach);
        locations[16][16].setScene(Scene.beach);
        locations[16][17].setScene(Scene.ocean);
        locations[16][18].setScene(Scene.ocean);
        locations[16][19].setScene(Scene.ocean);

        locations[17][0].setScene(Scene.ocean);
        locations[17][1].setScene(Scene.ocean);
        locations[17][2].setScene(Scene.ocean);
        locations[17][3].setScene(Scene.ocean);
        locations[17][4].setScene(Scene.ocean);
        locations[17][5].setScene(Scene.ocean);
        locations[17][6].setScene(Scene.beach);
        locations[17][7].setScene(Scene.beach);
        locations[17][8].setScene(Scene.ocean);
        locations[17][9].setScene(Scene.ocean);
        locations[17][10].setScene(Scene.ocean);
        locations[17][11].setScene(Scene.ocean);
        locations[17][12].setScene(Scene.ocean);
        locations[17][13].setScene(Scene.ocean);
        locations[17][14].setScene(Scene.beach);
        locations[17][15].setScene(Scene.beach);
        locations[17][16].setScene(Scene.beach);
        locations[17][17].setScene(Scene.ocean);
        locations[17][18].setScene(Scene.ocean);
        locations[17][19].setScene(Scene.ocean);

        locations[18][0].setScene(Scene.ocean);
        locations[18][1].setScene(Scene.ocean);
        locations[18][2].setScene(Scene.ocean);
        locations[18][3].setScene(Scene.ocean);
        locations[18][4].setScene(Scene.ocean);
        locations[18][5].setScene(Scene.ocean);
        locations[18][6].setScene(Scene.beach);
        locations[18][7].setScene(Scene.ocean);
        locations[18][8].setScene(Scene.ocean);
        locations[18][9].setScene(Scene.ocean);
        locations[18][10].setScene(Scene.ocean);
        locations[18][11].setScene(Scene.ocean);
        locations[18][12].setScene(Scene.ocean);
        locations[18][13].setScene(Scene.ocean);
        locations[18][14].setScene(Scene.ocean);
        locations[18][15].setScene(Scene.beach);
        locations[18][16].setScene(Scene.beach);
        locations[18][17].setScene(Scene.ocean);
        locations[18][18].setScene(Scene.ocean);
        locations[18][19].setScene(Scene.ocean);

        locations[19][0].setScene(Scene.ocean);
        locations[19][1].setScene(Scene.ocean);
        locations[19][2].setScene(Scene.ocean);
        locations[19][3].setScene(Scene.ocean);
        locations[19][4].setScene(Scene.ocean);
        locations[19][5].setScene(Scene.ocean);
        locations[19][6].setScene(Scene.ocean);
        locations[19][7].setScene(Scene.ocean);
        locations[19][8].setScene(Scene.ocean);
        locations[19][9].setScene(Scene.ocean);
        locations[19][10].setScene(Scene.ocean);
        locations[19][11].setScene(Scene.ocean);
        locations[19][12].setScene(Scene.ocean);
        locations[19][13].setScene(Scene.ocean);
        locations[19][14].setScene(Scene.ocean);
        locations[19][15].setScene(Scene.ocean);
        locations[19][16].setScene(Scene.ocean);
        locations[19][17].setScene(Scene.ocean);
        locations[19][18].setScene(Scene.ocean);
        locations[19][19].setScene(Scene.ocean);
    }

    public static Inventory[] getSortedInventoryList() {
        // get inventory list for current game
        Inventory[] originalInventoryList
                = Escape.getCurrentGame().getInventory();
        //clone make copy of original list
        Inventory[] inventoryList = originalInventoryList.clone();

        // using a bubble sort to sort the list of the invntory list by name
        Inventory tempInventory;
        for (int i = 0; i < inventoryList.length - 1; i++) {
            for (int j = 0; j < inventoryList.length - 1 - i; j++) {
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventory = inventoryList[j];
                    inventoryList[j] = inventoryList[j + 1];
                    inventoryList[j + 1] = tempInventory;
                }
            }
        }
        return inventoryList;
    }
}
