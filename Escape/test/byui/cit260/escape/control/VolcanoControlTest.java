/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.control;

import exceptions.VolcanoControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kale
 */
public class VolcanoControlTest {
    
    public VolcanoControlTest() {
    }

    /**
     * Test of VolcanoControl method, of class VolcanoControl.
     */
    @Test
    public void testVolcanoControl() throws VolcanoControlException {
        System.out.println("VolcanoControl");
        int countDown = 230;
        int turn = 1;
        VolcanoControl instance = new VolcanoControl();
        double expResult = 229;
        double result = instance.VolcanoControl(countDown, turn);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void test2VolcanoControl() throws VolcanoControlException {
        System.out.println("VolcanoControl");
        int countDown = 241;
        int turn = 1;
        VolcanoControl instance = new VolcanoControl();
        double expResult = -1;
        double result = instance.VolcanoControl(countDown, turn);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void test3VolcanoControl() throws VolcanoControlException {
        System.out.println("VolcanoControl");
        int countDown = -1;
        int turn = 1;
        VolcanoControl instance = new VolcanoControl();
        double expResult = -1;
        double result = instance.VolcanoControl(countDown, turn);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void test4VolcanoControl() throws VolcanoControlException {
        System.out.println("VolcanoControl");
        int countDown = 240;
        int turn = -1;
        VolcanoControl instance = new VolcanoControl();
        double expResult = -1;
        double result = instance.VolcanoControl(countDown, turn);
        assertEquals(expResult, result, 0.0);
    }
}
