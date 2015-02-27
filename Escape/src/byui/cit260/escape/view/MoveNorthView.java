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
public class MoveNorthView {
    
    public int displayMoveNorthView(){
       
    
        return this.getInput();
      
    }
    private int getInput() {
        boolean valid = false; // indicates if the name has been retrieved
        int input = 0;
        Scanner keyboard = new Scanner(System.in); // Keyboard input stream

        while (!valid) { // while a valid name has not been retrieved
            //Prompt o players name
            System.out.println("Enter your desired spaces to move.");

            // get number from user
            input = keyboard.nextInt();

            // If value is equal or greater than 0
            if (input ==  0 || input > 0) {
                System.out.println("Invalid input - Input must be a number");
                continue; // and repeat again

            }
            break; // out of the (exit) the repetition

        }

        return input; // return value of spaces 
    }

}
