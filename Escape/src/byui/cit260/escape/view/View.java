/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import escape.Escape;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Kale
 */
public abstract class View implements ViewInterface {

    private String promptmessage;

    protected static final BufferedReader keyboard = Escape.getInFile();
    protected static final PrintWriter console = Escape.getOutFile();
    protected static final PrintWriter out = Escape.getLogFile();

    public View(String promptMessage) {
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
            this.console.println(this.promptmessage);// display the main menu
            value = this.getInput(); //get the user selection
            this.doAction(value);// do action based on selection

        } while (!value.equals("E")); // an selection is not "exit"
    }

    @Override
    public String getInput() {

        boolean valid = false; // indicates if the name has been retrieved
        String selection = null;

        try {
            while (!valid) {
            // while a valid name has not been retrieved
                //Prompt o players name
                this.console.println("\t\nPlease enter your input below.");

                // get the name from the key and trim off the blanks
                selection = this.keyboard.readLine();
                selection = selection.trim();

                // if the name is invalid (less than two characters in length)
                if (selection.length() < 1) {
                    ErrorView.display(this.getClass().getName(),
                            "\n The value can not be blank");
                    continue; // and repeat again

                }
                break; // out of the (exit) the repetition
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + e.getMessage());
        }
        return selection; // returns input
    }

}
