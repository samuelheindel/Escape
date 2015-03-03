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

public class StartProgramView {
    public StartProgramView(){
        
    }
    public void startProgram(){
     //DIsplay the banner screem
        this.displayBanner();
        // Get the players name 
        String playersName = this.getPlayersName();
        // creat and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        // Display welcome message
        this.displayWelcomeMessage(player);
        //Disolay main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
        
    }

    private void displayBanner() {
        System.out.println("\n\n####################################################################################");
          
        System.out.println("*                                                                                      *"
            + "\n* You are a captain of your own ship and have a crew under your command.               *"
            + "\n* While sailing the 7 seas you were caught in a massive storm.                         *"
            + "\n* Your ship was thrown on the rocks and destroyed along with all of your provisions.   *"
            + "\n* There is an island next to the rocks that you were able to swim to.                  *"
            + "\n* Your crew is lost.                                                                   *");
        System.out.println("*                                                                                      *"
            + "\n* You have been stranded on a Jaba Island.                                             *"
            + "\n* You are alone and have nothing.                                                      *"
            + "\n* The island you notice an active volcano that is going to erupt at any moment.        *"
            + "\n* The island is small enough that the volcano will destroy everything.                 *"
            + "\n* It is imperative that you escape from the island.                                    *"
            + "\n* The island has many resources that are available to gather.                          *"
            + "\n* The resources will be used to create a way for you to escape the island.             *");
         System.out.println("*                                                                                      *"
            + "\n* Beware your days are numbered!                                                       *");
        System.out.println("\n\n####################################################################################");
    
        
        
    }

    private String getPlayersName() {
        boolean valid = false; // indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); // Keyboard input stream
      
        while (!valid) { // while a valid name has not been retrieved
            //Prompt o players name
            System.out.println("What is your name Captian?");
            
            // get the name from the key and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();
            
               // if the name is invalid (less than two characters in length)
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be Blank");
                continue; // and repeat again
                
            }
            break; // out of the (exit) the repetition
            
        }
                
        return playersName; // return the name
    }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n================================================");
        System.out.println("\tWelcome to Jaba Island Captain " + player.getName());
        System.out.println("\tWe hope you can survive!");
        System.out.println("\n\n================================================");
    }
   private String getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); // Keyboard input stream
      
        while (!valid) { // while a valid name has not been retrieved
            //Prompt o players name
            System.out.println("Enter your selection below");
            
            // get the name from the key and trim off the blanks
            input = keyboard.nextLine();
            input = input.trim();
            
               // if the name is invalid (less than two characters in length)
            if (input.length() > 1) {
                System.out.println("Invalid name - input must be one letter");
                continue; // and repeat again
                
            }
            break; // out of the (exit) the repetition
            
        }
                
        return input; // return the name
    }



}
