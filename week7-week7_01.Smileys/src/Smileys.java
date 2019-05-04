
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
        printWithSmileys("Words");
    }

    private static void printWithSmileys(String characterString) {
        //print the given character string surrounded by smileys
        String symbol = getSymbol(characterString);
        String frame = getFrame(symbol.length());

        System.out.println(frame);
        System.out.println(symbol);
        System.out.println(frame);

    }

    private static boolean isOdd(int number) {
        if (number % 2 == 1) {
            // System.out.println("That's odd");
            return true;
        }

        //System.out.println("Nah it's even");
        return false;
    }

    private static String getSymbol(String symbol) {
        String symbolString = symbol;

        if (isOdd(symbol.length())) {
            symbolString += " ";
        }
        return ":) " + symbolString + " :)";
    }

    private static String getFrame(int symbolStringLength) {
        int numberOfSmileys = symbolStringLength / 2;
        String stringOfSmileys = "";

        for (int i = 0; i < numberOfSmileys; i++) {
            stringOfSmileys += ":)";
        }

        return stringOfSmileys;
    }

}
