/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.control;

import exceptions.VolcanoControlException;

/**
 *
 * @author Kale
 */
public class VolcanoControl {

    public double VolcanoControl(int countDown, int turn) throws VolcanoControlException {
        if (countDown > 240) {
            throw new VolcanoControlException("Countdown timer is to high");
        }
        if (countDown < 0) {
            throw new VolcanoControlException("Countdown timer is less than 0");
        }
        if (turn <= 0) {
            throw new VolcanoControlException("Turn is less than or equal to 0");
        }

        double currentCountDown = countDown - turn;

        return currentCountDown;

    }
}
