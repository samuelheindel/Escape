/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import java.util.Scanner;

/**
 *
 * @author Kale
 */
public class MoveView {

    private final String MENU = "\n"
            +"\n--------------------------------------------"
            +"\n    Move Menu                               "
            +"\n--------------------------------------------"
            +"\nN - Move North                              "
            +"\nE - Move East                               "
            +"\nS - Move South                              "
            +"\nW - Move West                               "
            +"\nX - Exit                                    "
            +"\n--------------------------------------------";
    public void displayMoveMenu(){
        char selection = ' ';
        do{
            System.out.println(MENU);// display the main menu
            
            String input = this.getInput(); // get user selection
            selection = input.charAt(0); // get first character of string
           
            
            this.doAction(selection);// do action based on selection
            
        }while (selection != 'E'); // an selection is not "exit"
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
                System.out.println("Invalid input - input must be one letter");
                continue; // and repeat again
                
            }
            break; // out of the (exit) the repetition
            
        }
                
        return input; // return the Dicection 
       
        
    }

    private void doAction(char choice) {
        switch (choice){
            case 'N':
                this.moveNorth();
                break;
            case 'E':
                this.moveEast();
                break;
            case 'S':
                this.moveSouth();
                break;
            case 'W':
                this.moveWest();
                break;
            case 'X':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }
    
       }
    private void moveNorth(){
        MoveNorthView NorthView = new MoveNorthView();
        int displayMoveNorthView;
        displayMoveNorthView = NorthView.displayMoveNorthView();
       
    }
    private void moveEast(){
        System.out.println("*** moveEast funtion called ***");
    }
    private void moveSouth(){
        System.out.println("*** moveSouth funtion called ***");
    }
    private void moveWest(){
        System.out.println("*** moveWest funtion called ***");
    }
   

}