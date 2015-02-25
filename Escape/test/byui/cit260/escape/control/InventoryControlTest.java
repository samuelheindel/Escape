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
    public void tes2tCalcRaftCompletion() {
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
    public void test3CalcRaftCompletion() {
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
    public void test4CalcRaftCompletion() {
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
    public void test5CalcRaftCompletion() {
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
    public void test6CalcRaftCompletion() {
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
    public void test7CalcRaftCompletion() {
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
    public void test8CalcRaftCompletion() {
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
    public void test9CalcRaftCompletion() {
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
    public void test10CalcRaftCompletion() {
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
    public void test11CalcRaftCompletion() {
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
    public void test12CalcRaftCompletion() {
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
    public void test13CalcRaftCompletion() {
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
    public void test14CalcRaftCompletion() {
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
    public void test15CalcRaftCompletion() {
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
