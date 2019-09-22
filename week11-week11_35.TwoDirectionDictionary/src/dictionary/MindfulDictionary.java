package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MindfulDictionary {

    private Map<String, String> finnishToEng;
    private Map<String, String> englishToFin;
    private File file;
    private Scanner reader;

    public MindfulDictionary() {
        this.finnishToEng = new HashMap<String, String>();
        this.englishToFin = new HashMap<String, String>();
    }

    public MindfulDictionary(String file) throws FileNotFoundException {
        this();
        this.file = new File(file);
    }

    public void add(String word, String translation) {
        //adds a word to the dictionary
        //each word has only one translation; if the same word is added twice, nothing happens
        if (!this.finnishToEng.containsKey(word)) {
            this.finnishToEng.put(word, translation);
            this.englishToFin.put(translation, word);
        }
    }

    public String translate(String word) {
        //returns the word translation; if the word isn't recognised, returns null
        if (this.finnishToEng.containsKey(word)) {
            return this.finnishToEng.get(word);
        } else if (this.englishToFin.containsKey(word)) {
            return this.englishToFin.get(word);
        }

        return null;
    }

    public void remove(String word) {
        //removes the given word and it's translation from your dictionary
        if (this.finnishToEng.containsKey(word)) {
            this.englishToFin.remove(this.finnishToEng.get(word));
            this.finnishToEng.remove(word);
        } else if (this.englishToFin.containsKey(word)) {
            this.finnishToEng.remove(this.englishToFin.get(word));
            this.englishToFin.remove(word);
        }
    }

    public boolean load() {
        try {
            reader = new Scanner(this.file);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] parts = line.split(":");

                String finnish = parts[0];
                String english = parts[1];

                add(finnish, english);
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public boolean save() {
        //dictionary contents are written into the file whose name was given as parameter
        //returns false if file can't be saved, otherwise true
        try {
            FileWriter writer = new FileWriter(file);
            for (String word : this.finnishToEng.keySet()) {
                writer.write(word + ":" + this.finnishToEng.get(word) + "\n");
            }
            writer.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
