/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.control;

import byui.cit260.escape.model.Toollist;
import byui.cit260.escape.model.Tools;
import escape.Escape;
import java.util.ArrayList;

/**
 *
 * @author samuel
 */
public class ToolsControl {

    private static ArrayList<Tools> createToolsList() {

        ArrayList<Tools> tools = new ArrayList<>();
        Tools jug = new Tools("Jug", 0 , 10);
        tools.add(jug);
        tools.add(new Tools("knife", 5 , 5));
        tools.add(new Tools("hammer", 10 , 0));
        tools.add(new Tools("hatchet", 15 , 10));
        tools.add(new Tools("bow", 20 , 0));
        return tools;

    }

    public static ArrayList getSortedToolsList() {
        ArrayList<Tools> tools = ToolsControl.createToolsList();
        Tools tempTools = null;
        for (int i = 0; i < tools.size() - 1; i++) {
        }
        return tools;

    }
}
