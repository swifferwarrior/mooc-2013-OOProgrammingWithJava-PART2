package file;

import java.io.File;
import java.util.Scanner;

public class Analysis {

    private File file;

    public Analysis(File file) {
        this.file = file;
    }

    public int lines() throws Exception {
        //returns the number of lines of the file the constructor
        //received as a parameter
        int lines = 0;
        String lineBuffer = "";
        Scanner reader = new Scanner(this.file);

        while (reader.hasNextLine()) {
            lineBuffer = reader.nextLine();
            lines++;
        }

        reader.close();

        return lines;
    }

    public int characters() throws Exception {
        //returns the number of characters of the file the constructor
        //received as a parameter
        int characters = 0;
        String lineBuffer = "";
        Scanner reader = new Scanner(this.file);

        while (reader.hasNextLine()) {
            lineBuffer = reader.nextLine();
            characters += lineBuffer.length() + 1; //+1 to include line break
        }
        reader.close();
        return characters;
    }

}

/* POST-SUBMIT NOTES */
/*
1. CLOSE THE READER
        Remember that the Scanner object needs to be closed afterwards.
2. LINE BREAKS MATTER
        Remember to add +1 to character length in order to account for the line
        break being a character, too.
*/
