package wordinspection;

import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class WordInspection {

    private File file;
    private List<String> wordList;
    private List<String> wordsWithL;
    private List<String> wordsWithZ;
    private List<String> palindromes;
    private final String VOWELS = "aeiouyäö";

    public WordInspection(File file) {
        this.file = file;
        this.wordList = new ArrayList<String>();
        this.wordsWithL = new ArrayList<String>();
        this.wordsWithZ = new ArrayList<String>();
        this.palindromes = new ArrayList<String>();
    }

    public int wordCount() throws Exception{
        //counts the file words and prints their number
        Scanner reader = new Scanner(file, "UTF-8");
        int wordCount = 0;
        String buffer = "";

        while (reader.hasNextLine()) {
            buffer = reader.nextLine();
            wordList.add(buffer);
            wordCount++;
        }
        return wordCount;
    }

    public List<String> wordsContainingZ() throws Exception {
        //returns all the file words with contain a 'Z'
        for (String word : wordList) {
            if (word.contains("z")) {
                this.wordsWithZ.add(word);
            }
        }
        return this.wordsWithZ;
    }

    public List<String> wordsEndingInL() throws Exception {
        //returns all the Finnish words of the file which end in "L"
        for (String word : wordList) {
            char letter = word.charAt(word.length() - 1);

            if (letter == 'l') {
                this.wordsWithL.add(word);
            }
        }

        return this.wordsWithL;
    }

    public List<String> palindromes() throws Exception {
        //returns all the palindrome words of the file
        for (String word : wordList) {
            String reverse = reverse(word);
            if (word.equals(reverse)) {
                this.palindromes.add(word);
            }
        }

        return this.palindromes;
    }

    public String reverse(String word){ //method to be used with palindromes()
        String reverseWord = "";
        int wordLength = word.length();
        char reverseLetter = word.charAt(wordLength - 1);

        while (wordLength > 1) {
            reverseWord += reverseLetter;
            wordLength--;
            reverseLetter = word.charAt(wordLength - 1);
        }
        return reverseWord;
    }

    public List<String> wordsWhichContainAllVowels() throws Exception{
        //returns all the words of the file which contain all Finnish vowels:
        //aeiouyäö
        List<String> vowelWords = new ArrayList<String>();

        for (String word : wordList) {
            if (       word.contains("a")
                    && word.contains("e")
                    && word.contains("i")
                    && word.contains("o")
                    && word.contains("u")
                    && word.contains("y")
                    && word.contains("ä")
                    && word.contains("ö")) {
                vowelWords.add(word);
            }
        }
        return vowelWords;
    }
}
