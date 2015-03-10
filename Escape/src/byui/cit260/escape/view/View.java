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
public abstract class View implements ViewInterface {

    private String promptmessage;
    
    public View (String promptMessage){
        this.promptmessage = promptMessage;
    }

    public String getPromptmessage() {
        return promptmessage;
    }

    public void setPromptmessage(String promptmessage) {
        this.promptmessage = promptmessage;
    }
    
    

    @Override
    public void display() {
        String value;
        do {
            System.out.println(this.promptmessage);// display the main menu
            value = this.getInput(); //get the user selection
            this.doAction(value);// do action based on selection

        } while (!value.equals("E")); // an selection is not "exit"
    }

    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in); // Keyboard input stream
        boolean valid = false; // indicates if the name has been retrieved
        String selection = null;

        while (!valid) { // while a valid name has not been retrieved
            //Prompt o players name
            System.out.println("\t\nEnter your selection below");

            // get the name from the key and trim off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();

            // if the name is invalid (less than two characters in length)
            if (selection.length() < 1) {
                System.out.println("\n Invalid selection");
                continue; // and repeat again

            }
            break; // out of the (exit) the repetition

        }
        return selection; // returns input
    }

}