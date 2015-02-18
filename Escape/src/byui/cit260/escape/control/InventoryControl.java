/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.control;

/**
 *
 * @author Kale
 */
public class InventoryControl {
    
    public double calcRaftCompletion(int logsneeded, int logsininventory, int ropeneeded, int ropeininventory, int storageneeded, int storageininventory){
        
        if (logsneeded < 10 || logsneeded > 100){
		 
            return -1;
        }
        if (logsininventory  <0 || logsininventory > 100){
		
            return -1;
        }
        if (ropeneeded  <60 || ropeneeded > 600){
		
            return -1;
        }
        if (ropeininventory  <0 || ropeininventory > 600){
		 
            return -1;
        }
        if (storageneeded  <2 || storageneeded > 29){
		
            return -1;
        }
        if (storageininventory  <0 || storageininventory > 29){
		
            return -1;
        }
        
         
        int needforcom = logsneeded + ropeneeded + storageneeded;

        int raftcom = needforcom - (needforcom - (logsininventory + ropeininventory + storageininventory));
        int persentcom = (raftcom / needforcom) * 100;
	return persentcom;
    }
    
      public int calcRaftSize(int people, int crates) {

        if (people < 1 || people > 9) {
            return -1;
        }
        if (crates < 1 || crates > 29) {
            return -1;
        }

        int pspace = (6 * 10) * people;
        int raftsize = pspace + (crates * 2);
        return raftsize;
    }

}
