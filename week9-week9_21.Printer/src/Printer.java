
import java.util.Scanner;
import java.io.File;

public class Printer {

    private String fileName;

    public Printer(String fileName) throws Exception {
        this.fileName = fileName;
    }

    public void printLinesWhichContain(String word) throws Exception {
        //prints the file lines which contain the parameter word
        File file = new File(this.fileName);
        Scanner reader = new Scanner(file);

        if (word.isEmpty()) {
            while (reader.hasNext()) {
                System.out.println(reader.nextLine());
            }
        }

        while (reader.hasNext()) {
            String current = reader.nextLine();
            if (current.contains(word)) {
                System.out.println(current);
            }
        }
    }
}
