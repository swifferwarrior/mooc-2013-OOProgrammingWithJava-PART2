import UserInterface.Interface;

public class Main {
    public static void main(String[] args) {
        Interface what = new Interface();
        
        what.start();
    }
}

/* POST-SUBMIT NOTES */
/*
1. VARIABLE HAS PRIVATE ACCESS ONLY
        Tried to do what.people.put() but couldn't. Made a getPeople() in Interface class
        and then used what.getPeople().put.
*/
