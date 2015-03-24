/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

import escape.Escape;
import java.io.PrintWriter;

/**
 *
 * @author Kale
 */
public class ErrorView {

    private static final PrintWriter errorFile = Escape.getOutFile();
    private static final PrintWriter logFile = Escape.getLogFile();

    public static void display(String className, String errorMessage){
        
        errorFile.println(
                "----------------------------------------------------------"
                + "\n- ERROR - " + errorMessage
                + "\n----------------------------------------------------------");

        //Log error
        logFile.println(className + " - " + errorMessage);

    }

}
