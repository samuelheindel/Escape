/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.control;

import byui.cit260.escape.model.Toollist;
import byui.cit260.escape.model.Tools;
import escape.Escape;

/**
 *
 * @author samuel
 */
public class ToolsControl {

    private static Tools[] createToolsList() {
        Tools[] tools
                = new Tools[4];

        Tools hammer = new Tools();
        hammer.setDescription("Hammer");
        hammer.setDamage(20);
        hammer.setGather(0);
        tools[Toollist.hammer.ordinal()] = hammer;

        Tools bow = new Tools();
        bow.setDescription("Bow");
        bow.setDamage(25);
        bow.setGather(0);
        tools[Toollist.bow.ordinal()] = bow;

        Tools knife = new Tools();
        knife.setDescription("Knife");
        knife.setDamage(10);
        knife.setGather(20);
        tools[Toollist.knife.ordinal()] = knife;

        Tools hatchet = new Tools();
        hatchet.setDescription("Hatchet");
        hatchet.setDamage(20);
        hatchet.setGather(20);
        tools[Toollist.hatchet.ordinal()] = hatchet;
        return tools;

    }

    public static Tools[] getSortedToolsList() {
        Tools[] tools = Escape.getCurrentGame().getTools();
        Tools tempTools;
        for (int i = 0; i < tools.length - 1; i++) {
            for (int j = 0; j < tools.length - 1 - i; j++) {
                if (tools[j].getDamage() < tools[i].getDamage()) {
                    tempTools = tools[j];
                    tools[j] = tools[j + 1];
                    tools[j + 1] = tempTools;
                }

            }
        }
        return tools;
    }
}
