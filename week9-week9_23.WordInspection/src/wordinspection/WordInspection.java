package wordinspection;

import java.io.File;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class WordInspection {

    private File file;
    //private List<String> wordList = new ArrayList<String>();

    public WordInspection(File file) {
        this.file = file;
    }
    
    //private Scanner reader = new Scanner(this.file, "UTF-8");

    /*public List<String> wordList(File file) throws Exception{
        Scanner reader = new Scanner(file, "UTF-8");
        
        while (reader.hasNextLine()){
            String word = reader.nextLine();
            wordList.add(word);
        }
        return wordList;
    }*/
    
    public int wordCount() throws Exception {
        //counts the file words and prints their number
        Scanner reader = new Scanner(file, "UTF-8");
        int wordCount = 0;

        while (reader.hasNextLine()) {
            reader.nextLine();
            wordCount++;
        }
        return wordCount;
    }

    public List<String> wordsContainingZ() throws Exception {
        //returns all the file words with contain a 'Z'
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> wordsWithZ = new ArrayList<String>();

        while (reader.hasNextLine()) {
            String word = reader.nextLine();
            if (word.contains("z")) {
                wordsWithZ.add(word);
            }
        }
        return wordsWithZ;
    }

    public List<String> wordsEndingInL() throws Exception {
        //returns all the Finnish words of the file which end in "L"
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> wordsWithL = new ArrayList<String>();

        while (reader.hasNextLine()) {
            String word = reader.nextLine();

            if (word.endsWith("l")) {
                wordsWithL.add(word);
            }
        }

        return wordsWithL;
    }

    public List<String> palindromes() throws Exception {
        //returns all the palindrome words of the file
        Scanner reader = new Scanner(file, "UTF-8");
        List<String> palindromes = new ArrayList<String>();

        while (reader.hasNextLine()) {
            String word = reader.nextLine();            
            String reverseWord = reverse(word);
            
            if (word.equals(reverseWord)) {
                palindromes.add(word);
            }
            reverseWord = "";
        }

        return palindromes;
    }

    public String reverse(String word) { //method to be used with palindromes()
        String reverseWord = "";
        int wordLength = word.length();
        char reverseLetter = word.charAt(wordLength - 1);

        while (wordLength > 1){
            reverseWord += reverseLetter;
            wordLength--;
            reverseLetter = word.charAt(wordLength - 1);
        }
        reverseWord += reverseLetter;
        return reverseWord;
    }

    public List<String> wordsWhichContainAllVowels() throws Exception {
        //returns all the words of the file which contain all Finnish vowels:
        //aeiouyäö
        List<String> vowelWords = new ArrayList<String>();
        Scanner reader = new Scanner(this.file, "UTF-8");

        while (reader.hasNextLine()) {
            String word = reader.nextLine();
            if (word.contains("a")
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
