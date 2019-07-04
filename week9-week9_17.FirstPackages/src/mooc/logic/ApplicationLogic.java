package mooc.logic;

import mooc.ui.UserInterface;

/**
 *
 * @author Admin
 */
public class ApplicationLogic {

    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        //application logic has to see the interface and therefore import it
        this.ui = ui;
    }

    public void execute(int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println("The application logic works");
            this.ui.update();
        }
    }

}

/* POST-SUBMIT NOTES */
/*
1. MISSING FOLDER!
        The exercise was missing the src folder. Added folder then added packages
        and main.java.
*/
