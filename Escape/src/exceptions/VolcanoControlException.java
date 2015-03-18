/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Kale
 */
public class VolcanoControlException extends Exception {

    public VolcanoControlException() {
    }

    public VolcanoControlException(String message) {
        super(message);
    }

    public VolcanoControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public VolcanoControlException(Throwable cause) {
        super(cause);
    }

    public VolcanoControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
