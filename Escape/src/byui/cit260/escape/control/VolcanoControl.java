/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.control;

import byui.cit260.escape.view.StartProgramView;
import exceptions.VolcanoControlException;

/**
 *
 * @author Kale
 */
public class VolcanoControl {

    public static double VolcanoControlSubtract() throws VolcanoControlException {
        double current = escape.Escape.getCurrentGame().getPlayer().getDays();
        if (current > 240) {
            throw new VolcanoControlException("Countdown timer is to high");
        }
        if (current <= 0) {
            System.out.println("                                                                                \n"
                    + "                                                                                \n"
                    + "                               O  I..            $..OO                          \n"
                    + "          $ I+I  ,O      =.  .$7$$77 ?Z. = OOO$.7$77$7+OZZZOZ                   \n"
                    + "       .Z777777$$$$8Z8OZZZZZ$$7$$$7$$ZZZZZZZZZO$$7O7$$7ZZZZZZZZ                 \n"
                    + "       777777777 $$$$$Z$8$$$$OO$$$$$OZZZZZ$$$ZZZOZZZZZZZZ$Z$ZZO.                \n"
                    + "       .Z..  .    ,8O$$$$$$$$$$$$$$$$8ZZZ$$$$$8$8ZZZZZOO$$$$OZZZ                \n"
                    + "                  ZZ$O$$$8$$$$$$$$$$$$$$$$$$$$$$$$$$$Z$$Z$$$ZZZ8 .8?,O          \n"
                    + "                  $$$$$ZZZ8$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$Z$$$Z.         \n"
                    + "                  .O$Z .OZZ$$$$$$$$$$$$$$$$$ZO$$$$$$$$$$$$$$$$$$$$$$$$7         \n"
                    + "                    ,Z I7ZZ8$$$$$$$$$$$$$77777Z$$$$$$O$$$$$$$. .  ...           \n"
                    + "                   O77$$77ZZO7777$$$$$Z$77O7777$$$O$$$$$$OZZ .                  \n"
                    + "                  $$7$7$77OZO7777O$$$$$$O$$$$$$$$$$Z$O$$ZZ777$7$                \n"
                    + "                  .$.  .:...OZZOZZO$$$$$$$$$$$$$$$$$ZZZZZ7777777Z               \n"
                    + "                             ZZZZZ~$$$$$$$$$$$OZ$Z$OZZZZZ$887+78                \n"
                    + "                            ..  .   $$$$$$$$8ZZZZZZZZZO ...                     \n"
                    + "                                   8$$$$$$$$ZZZO:OZZZO                          \n"
                    + "                                  .$$$$$$$$$Z,.    ..                           \n"
                    + "                                   $$$$$$$$$$                                   \n"
                    + "                                 .$$$$$$$$$$$8  .                               \n"
                    + "                                .8$$$$$$$$$$$88..                               \n"
                    + "                                DO88888D888OOD88.                               \n"
                    + "                             ..D88OO888O8OO888D8O7 .                            \n"
                    + "                             ..888OOO8DOO8O88888OO8.                            \n"
                    + "                            ..O88ODOO8DOOOOOOD88O8O8.                           \n"
                    + "                           .O8ODO8OO88OO8O888O8O8OOOO.                          \n"
                    + "                           O8888888OOOO8O88888OOOD888O                          \n"
                    + "                        ..OOO8OO8O88O88OO88OO888ODOD8O...                       \n"
                    + "                   ... .O8888OOOOO8O8ODO8OODO88888D888O...                      \n"
                    + "                   ...8888O8O8OOO888OO888OOD8OO8OO8O888O8..                     \n"
                    + "               ....D888O8O888OO8O8OO88DO8OODO888OOO888OO8O8...                  \n"
                    + "               .8O8888O888888888O888DDO8O88OD88O88O888O88DOO..   .              \n"
                    + "            .78888OO88O8OO88O88OO8O8OO8O8O88OOO8888888888888OO8O,               \n"
                    + "       .. .8888888888O88O8O8888O88888888OO8888OO88888888O88OO8888OD...          \n"
                    + "       .D888O8888888OO8O88888888O888888OOO888888OOOOO888888OOO88888O8O.         \n"
                    + "    ..8OO8O8O8888OOO8OO8OOOOOOO8OOOOOOOOOOOOOOOOOOOOOOOOOOOO8OOO888888O88       \n"
                    + "  ________    _____      _____  ___________ ____________   _______________________ \n"
                    + " /  _____/   /  _  \\    /     \\ \\_   _____/ \\_____  \\   \\ /   |_   _____|______   \\\n"
                    + "/   \\  ___  /  /_\\  \\  /  \\ /  \\ |    __)_   /   |   \\   Y   / |    __)_ |       _/\n"
                    + "\\    \\_\\  \\/    |    \\/    Y    \\|        \\ /    |    \\     /  |        \\|    |   \\\n"
                    + " \\______  /\\____|__  /\\____|__  /_______  / \\_______  /\\___/  /_______  /|____|_  /\n"
                    + "        \\/         \\/         \\/        \\/          \\/                \\/        \\/ "
                    + "\n YOU TOOK TO LONG AND THE VOLCANO EXPLODED");
            StartProgramView startProgramView = new StartProgramView("");
            startProgramView.display();
        }
        if (current <= 240) {
            double newcurrent = current - 0.1;
            escape.Escape.getCurrentGame().getPlayer().setDays(newcurrent);
        }
        return 0;

    }
}
