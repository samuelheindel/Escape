/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.control;

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
    public void testCalcRaftCompletion() {
        System.out.println("calcRaftCompletion");
        int logsneeded = 10;
        int logsininventory = 10;
        int ropeneeded = 60;
        int ropeininventory = 60;
        int storageneeded = 2;
        int storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = 100.0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, 100.0);
       
    }
    
    
    
    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void tes2tCalcRaftCompletion() {
        System.out.println("calcRaftCompletion");
        int logsneeded = 9;
        int logsininventory = 10;
        int ropeneeded = 60;
        int ropeininventory = 60;
        int storageneeded = 2;
        int storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1.0);
       
    }
    
      /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test3CalcRaftCompletion() {
        System.out.println("calcRaftCompletion");
        int logsneeded = 10;
        int logsininventory = 101;
        int ropeneeded = 60;
        int ropeininventory = 60;
        int storageneeded = 2;
        int storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1.0);
       
    }
    
         /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test4CalcRaftCompletion() {
        System.out.println("calcRaftCompletion");
        int logsneeded = 10;
        int logsininventory = -1;
        int ropeneeded = 60;
        int ropeininventory = 60;
        int storageneeded = 2;
        int storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1.0);
       
    }
    
           /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test5CalcRaftCompletion() {
        System.out.println("calcRaftCompletion");
        int logsneeded = 101;
        int logsininventory = 10;
        int ropeneeded = 60;
        int ropeininventory = 60;
        int storageneeded = 2;
        int storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1.0);
       
    }
    
               /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test6CalcRaftCompletion() {
        System.out.println("calcRaftCompletion");
        int logsneeded = 10;
        int logsininventory = 10;
        int ropeneeded = 59;
        int ropeininventory = 60;
        int storageneeded = 2;
        int storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1.0);
       
    }
    
                /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test7CalcRaftCompletion() {
        System.out.println("calcRaftCompletion");
        int logsneeded = 10;
        int logsininventory = 10;
        int ropeneeded = 601;
        int ropeininventory = 60;
        int storageneeded = 2;
        int storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1.0);
       
    }
    
                    /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test8CalcRaftCompletion() {
        System.out.println("calcRaftCompletion");
        int logsneeded = 10;
        int logsininventory = 10;
        int ropeneeded = 60;
        int ropeininventory = -1;
        int storageneeded = 2;
        int storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1.0);
       
    }
    
                      /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test9CalcRaftCompletion() {
        System.out.println("calcRaftCompletion");
        int logsneeded = 10;
        int logsininventory = 10;
        int ropeneeded = 60;
        int ropeininventory = 601;
        int storageneeded = 2;
        int storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1.0);
       
    }
    
                          /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test10CalcRaftCompletion() {
        System.out.println("calcRaftCompletion");
        int logsneeded = 10;
        int logsininventory = 10;
        int ropeneeded = 60;
        int ropeininventory = 60;
        int storageneeded = 1;
        int storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1.0);
       
    }
    
                          /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test11CalcRaftCompletion() {
        System.out.println("calcRaftCompletion");
        int logsneeded = 10;
        int logsininventory = 10;
        int ropeneeded = 60;
        int ropeininventory = 60;
        int storageneeded = 30;
        int storageininventory = 2;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1.0);
       
    }
    
                              /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test12CalcRaftCompletion() {
        System.out.println("calcRaftCompletion");
        int logsneeded = 10;
        int logsininventory = 10;
        int ropeneeded = 60;
        int ropeininventory = 60;
        int storageneeded = 2;
        int storageininventory = -1;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1.0);
       
    }
    
                                  /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test13CalcRaftCompletion() {
        System.out.println("calcRaftCompletion");
        int logsneeded = 10;
        int logsininventory = 10;
        int ropeneeded = 60;
        int ropeininventory = 60;
        int storageneeded = 2;
        int storageininventory = 30;
        InventoryControl instance = new InventoryControl();
        double expResult = -1.0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, -1.0);
       
    }
    
                                      /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test14CalcRaftCompletion() {
        System.out.println("calcRaftCompletion");
        int logsneeded = 10;
        int logsininventory = 0;
        int ropeneeded = 60;
        int ropeininventory = 0;
        int storageneeded = 2;
        int storageininventory = 0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0.0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, 0.0);
       
    }
    
                                          /**
     * Test of calcRaftCompletion method, of class InventoryControl.
     */
    @Test
    public void test15CalcRaftCompletion() {
        System.out.println("calcRaftCompletion");
        int logsneeded = 100;
        int logsininventory = 100;
        int ropeneeded = 600;
        int ropeininventory = 600;
        int storageneeded = 29;
        int storageininventory = 29;
        InventoryControl instance = new InventoryControl();
        double expResult = 100.0;
        double result = instance.calcRaftCompletion(logsneeded, logsininventory, ropeneeded, ropeininventory, storageneeded, storageininventory);
        assertEquals(expResult, result, 100.0);
       
    }

    /**
     * Test of calRaftSize method, of class InventoryControl.
     */
    @Test
    public void testCalRaftSize() {
        System.out.println("calRaftSize");
        int people = 1;
        int crates = 4;
        InventoryControl instance = new InventoryControl();
        int expResult = 68;
        int result = instance.calRaftSize(people, crates);
        assertEquals(expResult, result);

    }
      /**
     * Test of calRaftSize method, of class InventoryControl.
     */
    @Test
    public void test2CalRaftSize() {
        System.out.println("calRaftSize");
        int people = -1;
        int crates = 4;
        InventoryControl instance = new InventoryControl();
        int expResult = -1;
        int result = instance.calRaftSize(people, crates);
        assertEquals(expResult, result);

    }
    
      /**
     * Test of calRaftSize method, of class InventoryControl.
     */
    @Test
    public void test3CalRaftSize() {
        System.out.println("calRaftSize");
        int people = 10;
        int crates = 1;
        InventoryControl instance = new InventoryControl();
        int expResult = -1;
        int result = instance.calRaftSize(people, crates);
        assertEquals(expResult, result);

    }
      /**
     * Test of calRaftSize method, of class InventoryControl.
     */
    @Test
    public void test4CalRaftSize() {
        System.out.println("calRaftSize");
        int people = 9;
        int crates = 0;
        InventoryControl instance = new InventoryControl();
        int expResult = -1;
        int result = instance.calRaftSize(people, crates);
        assertEquals(expResult, result);

    }
    
      /**
     * Test of calRaftSize method, of class InventoryControl.
     */
    @Test
    public void test5CalRaftSize() {
        System.out.println("calRaftSize");
        int people = 1;
        int crates = 30;
        InventoryControl instance = new InventoryControl();
        int expResult = -1;
        int result = instance.calRaftSize(people, crates);
        assertEquals(expResult, result);

    }
    
      /**
     * Test of calRaftSize method, of class InventoryControl.
     */
    @Test
    public void test6CalRaftSize() {
        System.out.println("calRaftSize");
        int people = 1;
        int crates = 1;
        InventoryControl instance = new InventoryControl();
        int expResult = 62;
        int result = instance.calRaftSize(people, crates);
        assertEquals(expResult, result);

    }
    
      /**
     * Test of calRaftSize method, of class InventoryControl.
     */
    @Test
    public void test7CalRaftSize() {
        System.out.println("calRaftSize");
        int people = 9;
        int crates = 29;
        InventoryControl instance = new InventoryControl();
        int expResult = 598;
        int result = instance.calRaftSize(people, crates);
        assertEquals(expResult, result);

    }
    
}
