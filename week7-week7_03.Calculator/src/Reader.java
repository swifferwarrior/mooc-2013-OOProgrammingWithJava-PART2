import java.util.Scanner;

public class Reader {
    private Scanner reader = new Scanner(System.in);
    
    public Reader(){
        Scanner reader = new Scanner(System.in);
    }
    
    public String readString(){
       return reader.nextLine();
    }
            
    public int readInteger(){
        return Integer.parseInt(reader.nextLine());
    }
}

/* POST*SUBMIT NOTES */

/*
1. INITIALIZING VARIABLES IN THE METHODS
        In this case, both readString and readInteger don't need a variable to
        store the info. Just return what is given.
*/