
package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {
    private File file;

    public Analysis(File file) {
        this.file = file;
    }
    
    public int lines() throws Exception{
        //returns the number of lines of the file the constructor
        //received as a parameter
        int lines = 0;
        String lineBuffer = "";
        Scanner reader = new Scanner(this.file);
        
        while (reader.hasNextLine()){
            lineBuffer = reader.nextLine();
            lines++;
        }
        
        reader.close();
        
        return lines;
    }
}
/* POST-SUBMIT NOTES */
/*
1. CLOSE THE READER
        Remember that the Scanner object needs to be closed afterwards.
*/