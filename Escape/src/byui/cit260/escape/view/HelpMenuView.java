/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;
import java.util.Scanner;


/**
 *
 * @author samuel
 */
public class HelpMenuView {

    private final String MENU = "\n"
            +"\n------------------------------------------------------------------------------"
            +"\n|Help Menu                                                                    "
            +"\n------------------------------------------------------------------------------"
            +"\nG - What is the goal of the game?                                             "
            +"\nM - How to move                                                               "
            +"\nB - View Bag/View Status of Raft/Resources needed                             "
            +"\nA -  Interact (Harvest certain resources, use items, etc.)                    "
            +"\nL - View your location.                                                       "
            +"\nO -  Observe surroundings                                                     "
            +"\nQ - Quit or Go Back to Main Menu                                              "
            +"\n------------------------------------------------------------------------------";
    public void displayHelpMenu(){
        char selection = ' ';
        do{
            System.out.println(MENU);// display the main menu
            
            String input = this.getInput(); // ge user selection
            selection = input.charAt(0); // get first character of string
            
            this.doAction(selection);// do action based on selection
            
        }while (selection != 'Q'); // an selection is not "exit"
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

    private void doAction(char choice) {
        switch (choice){
            case 'G':
                this.displayGameGoal();
                break;
            case 'M':
                this.displayHowToMove();
                break;
            case 'B':
                this.displayBag();
                break;
            case 'A':
                this.displayInteract();
                break;
            case 'L':
                this.displayViewLocation();
                break;
            case 'O':
                this.displayObserveSurroundings();
                break;
            case 'Q':
                this.goBackToMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    
       }
    private void displayGameGoal(){
        System.out.println("*                                                                                      *"
            + "\n* The goal of this game is to gather resources such as,               *"
            + "\n* food, and plant material. You are to build a raft and stock it      *"
            + "\n* with everything necisatry to survive at sea.                        *"
            + "\n* On the island there is a volcano about to erupt, you must escape    *"
            + "\n* before time runs out, or GAME OVER!.                                *");
    }
    private void displayHowToMove(){
        System.out.println("*"
                + "\n*Use the MOVE command followed by a direction and distance.       *"
                + "\n*EXAMPLE: MOVE NORTH 3                                            *");
    }
    private void displayBag(){
        System.out.println("*"
                + "\n*To display your bag items use the OPEN BAG command.              *"
                + "\n*Only tools are stored in the bag.                                *"
                + "\n*Tools are used for gathering, hunting, crafting, and fighting.   *");
    }
    private void displayInteract(){
        System.out.println("*"
                + "\n*Once a tool is equiped you can interact with an item.            *"
                + "\n*Depending on the item and tool                                   *"
                + "\n*you can use the EQUIP GATHER, ATACK, SLAY, or CRAFT commands           *"
                + "\n*followed by the name of the object                               *"
                + "\n*EXAMPLE: GATHER FRUIT                                            *");
    }
    private void displayViewLocation(){
        System.out.println("*"
                + "\n*Use the DISPLAY LOCATION command to show your position           *"
                + "\n*on the map                                                       *");
    }
    private void displayObserveSurroundings(){
        System.out.println("*"
                + "\n*Use the OBSERVE SURROUNDINGS command to reveal the               *"
                + "\n*objects in your location                                         *");
    }
    private void goBackToMenu(){
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }

}

