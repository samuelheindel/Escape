/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escape;

import byui.cit260.escape.model.Game;
import byui.cit260.escape.model.Player;
import byui.cit260.escape.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kale
 */
public class Escape {

    private static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    public static void main(String[] args) {

        //open charcter stream files for end user input and output
        try {
            Escape.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            Escape.outFile = new PrintWriter(System.out, true);
        } catch (Exception e) {
        } finally {
            try {
                if (Escape.inFile != null);
                    Escape.inFile.close();
                if (Escape.outFile != null)
                    Escape.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing Files");
                return;
            }

        }
        // create StartProgramView and start the program
        StartProgramView startProgramView = new StartProgramView("");
        try {
            startProgramView.display();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }

    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Escape.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Escape.inFile = inFile;
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
