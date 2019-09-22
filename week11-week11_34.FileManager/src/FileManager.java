
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        //returns the lines of the parameter file in ArrayList form
        File txt = new File(file);
        Scanner reader = new Scanner(txt);
        List<String> fileLines = new ArrayList<String>();

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            fileLines.add(line);
        }
        return fileLines;
    }

    public void save(String file, String text) throws IOException {
        //writes the string of the second argument into the file of the first argument
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        FileWriter writer = new FileWriter(file);
        String txt = "";
        
        for (String line : texts) {
            txt += line + "\n";
        }
        writer.write(txt);
        writer.close();
    }
}
