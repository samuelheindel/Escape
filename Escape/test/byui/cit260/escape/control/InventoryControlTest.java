/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.control;

import exceptions.InventoryControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author samuel
 */
public class InventoryControlTest {

    public InventoryControlTest() {
    }

    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void testCalcRaftCompletion() throws InventoryControlException {
        System.out.println("calcRaftCompletion");
        double logsneeded = 10;
        double logsininventory = 10;
        double ropeneeded = 60;
        double ropeininventory = 60;
        double storageneeded = 2;
        double storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = 100;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, 100);

    }

    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void tes2tCalcRaftCompletion() throws InventoryControlException {
        System.out.println("calcRaftCompletion");
        double logsneeded = 9;
        double logsininventory = 10;
        double ropeneeded = 60;
        double ropeininventory = 60;
        double storageneeded = 2;
        double storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test3CalcRaftCompletion() throws InventoryControlException {
        System.out.println("calcRaftCompletion");
        double logsneeded = 10;
        double logsininventory = 101;
        double ropeneeded = 60;
        double ropeininventory = 60;
        double storageneeded = 2;
        double storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test4CalcRaftCompletion() throws InventoryControlException {
        System.out.println("calcRaftCompletion");
        double logsneeded = 10;
        double logsininventory = -1;
        double ropeneeded = 60;
        double ropeininventory = 60;
        double storageneeded = 2;
        double storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test5CalcRaftCompletion() throws InventoryControlException {
        System.out.println("calcRaftCompletion");
        double logsneeded = 101;
        double logsininventory = 10;
        double ropeneeded = 60;
        double ropeininventory = 60;
        double storageneeded = 2;
        double storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test6CalcRaftCompletion() throws InventoryControlException {
        System.out.println("calcRaftCompletion");
        double logsneeded = 10;
        double logsininventory = 10;
        double ropeneeded = 59;
        double ropeininventory = 60;
        double storageneeded = 2;
        double storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test7CalcRaftCompletion() throws InventoryControlException {
        System.out.println("calcRaftCompletion");
        double logsneeded = 10;
        double logsininventory = 10;
        double ropeneeded = 601;
        double ropeininventory = 60;
        double storageneeded = 2;
        double storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test8CalcRaftCompletion() throws InventoryControlException {
        System.out.println("calcRaftCompletion");
        double logsneeded = 10;
        double logsininventory = 10;
        double ropeneeded = 60;
        double ropeininventory = -1;
        double storageneeded = 2;
        double storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test9CalcRaftCompletion() throws InventoryControlException {
        System.out.println("calcRaftCompletion");
        double logsneeded = 10;
        double logsininventory = 10;
        double ropeneeded = 60;
        double ropeininventory = 601;
        double storageneeded = 2;
        double storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test10CalcRaftCompletion() throws InventoryControlException {
        System.out.println("calcRaftCompletion");
        double logsneeded = 10;
        double logsininventory = 10;
        double ropeneeded = 60;
        double ropeininventory = 60;
        double storageneeded = 1;
        double storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test11CalcRaftCompletion() throws InventoryControlException {
        System.out.println("calcRaftCompletion");
        double logsneeded = 10;
        double logsininventory = 10;
        double ropeneeded = 60;
        double ropeininventory = 60;
        double storageneeded = 30;
        double storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test12CalcRaftCompletion() throws InventoryControlException {
        System.out.println("calcRaftCompletion");
        double logsneeded = 10;
        double logsininventory = 10;
        double ropeneeded = 60;
        double ropeininventory = 60;
        double storageneeded = 2;
        double storageininventory = -1;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test13CalcRaftCompletion() throws InventoryControlException {
        System.out.println("calcRaftCompletion");
        double logsneeded = 10;
        double logsininventory = 10;
        double ropeneeded = 60;
        double ropeininventory = 60;
        double storageneeded = 2;
        double storageininventory = 30;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test14CalcRaftCompletion() throws InventoryControlException {
        System.out.println("calcRaftCompletion");
        double logsneeded = 10;
        double logsininventory = 0;
        double ropeneeded = 60;
        double ropeininventory = 0;
        double storageneeded = 2;
        double storageininventory = 0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test15CalcRaftCompletion() throws InventoryControlException {
        System.out.println("calcRaftCompletion");
        double logsneeded = 100;
        double logsininventory = 100;
        double ropeneeded = 600;
        double ropeininventory = 600;
        double storageneeded = 29;
        double storageininventory = 29;
        InventoryControl instance = new InventoryControl();
        double expResult = 100;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, 100);

    }

    /**
     * Test of calRaftSize method, of class InventoryControl.
     */
    @Test
    public void testCalRaftSize() throws InventoryControlException {
        System.out.println("calRaftSize");
        double people = 1;
        double crates = 4;
        InventoryControl instance = new InventoryControl();
        double expResult = 68;
        double result = instance.calRaftSize(people, crates);
        assertEquals(expResult, result, 68);

    }

    /**
     * Test of calRaftSize method, of class InventoryControl.
     */
    @Test
    public void test2CalRaftSize() throws InventoryControlException {
        System.out.println("calRaftSize");
        double people = -1;
        double crates = 4;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calRaftSize(people, crates);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calRaftSize method, of class InventoryControl.
     */
    @Test
    public void test3CalRaftSize() throws InventoryControlException {
        System.out.println("calRaftSize");
        double people = 10;
        double crates = 1;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calRaftSize(people, crates);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calRaftSize method, of class InventoryControl.
     */
    @Test
    public void test4CalRaftSize() throws InventoryControlException {
        System.out.println("calRaftSize");
        double people = 9;
        double crates = 0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calRaftSize(people, crates);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calRaftSize method, of class InventoryControl.
     */
    @Test
    public void test5CalRaftSize() throws InventoryControlException {
        System.out.println("calRaftSize");
        double people = 1;
        double crates = 30;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.calRaftSize(people, crates);
        assertEquals(expResult, result, -1);

    }

    /**
     * Test of calRaftSize method, of class InventoryControl.
     */
    @Test
    public void test6CalRaftSize() throws InventoryControlException {
        System.out.println("calRaftSize");
        double people = 1;
        double crates = 1;
        InventoryControl instance = new InventoryControl();
        double expResult = 62;
        double result = instance.calRaftSize(people, crates);
        assertEquals(expResult, result, 62);

    }

    /**
     * Test of calRaftSize method, of class InventoryControl.
     */
    @Test
    public void test7CalRaftSize() throws InventoryControlException {
        System.out.println("calRaftSize");
        double people = 9.0;
        double crates = 29.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 598.0;
        double result = instance.calRaftSize(people, crates);
        assertEquals(expResult, result, 598.0);

    }

}
