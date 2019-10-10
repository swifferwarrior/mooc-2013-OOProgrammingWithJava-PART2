
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder sb = new StringBuilder();

        sb.append("{");
        for (int i = 0; i < t.length; i++) {

            if (i % 4 == 0) { //after every 4 numbers      //if(sb.charAt(t[i]) == (4|8)){
                sb.append("\n");//add a linebreak
            }
            
            sb.append(" " + t[i]); //Add next number in table
            
            if (i != t.length-1){
                sb.append(",");
            }
        }
        sb.append("\n}");
        return sb.append(" ").toString();
    }
}

