
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner reader = new Scanner(System.in);

        System.out.print("Give a day: ");
        String day = reader.nextLine();
        isAWeekDay(day);
        System.out.println("");

        System.out.print("Give vowels: ");
        String vowel = reader.nextLine();
        allVowels(vowel);
        System.out.println("");

        System.out.print("Give a time: ");
        String time = reader.nextLine();
        clockTime(time);

    }

    public static boolean isAWeekDay(String string) {
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            System.out.println("The form is fine;");
            return true;
        }
        System.out.println("The form is wrong.");
        return false;
    }

    public static boolean allVowels(String string) {
        if (string.matches("(a|e|i|o|u|ä|ö)*")) {
            System.out.println("The form is right.");
            return true;
        }
        System.out.println("The form is false.");
        return false;
    }

    public static boolean clockTime(String string) {
        String hour = "([0-1][0-9]|20|21|22|23):";
        String minute = "[0-5][0-9]:";
        String second = "[0-5][0-9]";
        
        if (hour.matches("2[4-9]")){
            return false;
        }
        
        if (string.matches(hour + minute + second)) {
            System.out.println("The form is fine.");
            return true;
        }
        System.out.println("The form is false.");
        return false;
    }

}
