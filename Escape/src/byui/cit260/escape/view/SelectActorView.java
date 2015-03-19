/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.escape.view;

/**
 *
 * @author samuel
 */
public class SelectActorView {

    public SelectActorView() {
        super("\n"
                + "\n--------------------------------------------"
                + "\n   Select Crew member                       "
                + "\n--------------------------------------------"
                + "\nD - Display found crew                      "
                + "\nA - Jeb                                     "
                + "\nB - Ned                                     "
                + "\nc - Jack                                    "
                + "\nE - Exit                                    "
                + "\n--------------------------------------------");
    }
    
    @Override
    public void doAction(Object value) {
        String action = (String) value;
        char choice = action.charAt(0);
        switch (choice) {
            case 'D':
                this.crew();
                break;
            case 'A':
                this.actorJeb();
                break;
            case 'B':
                this.actorNed();
                break;
            case 'C':
                this.actorJack();
                break;
            case 'E':
                return;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
        }

    }

    private void crew() {

    }

    private void actorJeb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void actorNed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void actorJack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
