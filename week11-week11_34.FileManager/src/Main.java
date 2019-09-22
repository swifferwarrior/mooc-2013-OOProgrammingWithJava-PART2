
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        FileManager t = new FileManager();
        ArrayList<String> eng = new ArrayList<String>();
        eng.add("One");
        eng.add("Two");

        for (String line : t.read("src/testinput1.txt")) {
            System.out.println(line);
        }

        /* WRITING A LINE
        System.out.println("");
        System.out.println("Writing a line");
        t.save("src/testinput1.txt", "Hello, buddy :)");*/


        // WRITING A LIST
       System.out.println("");
        System.out.println("Writing a list");
        t.save("src/testinput1.txt", t.read("src/testinput2.txt"));
        
        for (String line : t.read("src/testinput1.txt")) {
            System.out.println(line);
        }
    }
}
