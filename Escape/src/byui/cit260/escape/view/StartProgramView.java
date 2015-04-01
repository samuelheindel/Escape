/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import byui.cit260.escape.control.ProgramControl;
import byui.cit260.escape.model.Player;
import java.util.Scanner;

/**
 *
 * @author samuel
 */
//startProgram(): void
//BEGIN
//Display the banner screen
//Get the players name
//Create a new player
//DISPLAY a customized welcome message
//DISPLAY the main menu
//END
public class StartProgramView extends View {

    public StartProgramView(String promptMessage) {
        super("\n\n####################################################################################"
                + "*                                                                                      *"
                + "\n* You are a captain of your own ship and have a crew under your command.               *"
                + "\n* While sailing the 7 seas you were caught in a massive storm.                         *"
                + "\n* Your ship was thrown on the rocks and destroyed along with all of your provisions.   *"
                + "\n* There is an island next to the rocks that you were able to swim to.                  *"
                + "\n* Your crew is lost.                                                                   *"
                + "\n*                                                                                      *"
                + "\n* You have been stranded on a Jaba Island.                                             *"
                + "\n* You are alone and have nothing.                                                      *"
                + "\n* The island you notice an active volcano that is going to erupt at any moment.        *"
                + "\n* The island is small enough that the volcano will destroy everything.                 *"
                + "\n* It is imperative that you escape from the island.                                    *"
                + "\n* The island has many resources that are available to gather.                          *"
                + "\n* The resources will be used to create a way for you to escape the island.             *"
                + "\n*                                                                                      *"
                + "\n* Beware your days are numbered!                                                       *"
                + "\n\n####################################################################################"
                + "\n\nWhat is your Name Captain?");
    }

 

    private void displayWelcomeMessage(String name) {
        this.console.println("\n\n================================================");
        this.console.println("\tWelcome to Jaba Island Captain " + name);
        this.console.println("\tWe hope you can survive!");
        this.console.println("\n\n================================================");
    }

    @Override
    public boolean doAction(Object name) {
        this.displayWelcomeMessage((String) name);
        Player player = new Player();
        player.setName((String) name);
        escape.Escape.setPlayer(player);
        //Disolay main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
        return true;
    }

}