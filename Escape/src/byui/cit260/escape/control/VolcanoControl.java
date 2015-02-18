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
public class VolcanoControl {
    public double VolcanoControl(int countDown, int turn ){
    if (countDown > 240){ 
	return -1;  
    }
    if (countDown < 0){
	return -1;
    }
    if (turn <= 0){
	return -1;
    }
    
    double currentCountDown=countDown-turn;
	
    return currentCountDown;

}
}