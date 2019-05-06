
public class Calculator {

    private Reader reader = new Reader();
    private int calculationsDone;

    public Calculator() {
        this.calculationsDone = 0;
        this.reader = new Reader();
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum() {
        System.out.println("Type a value: ");
        int first = this.reader.readInteger();

        System.out.println("Type another value: ");
        int second = this.reader.readInteger();

        System.out.println("Sum of the values: " + (first + second));
        this.calculationsDone++;
    }

    private void difference() {
        System.out.println("Type a value: ");
        int first = this.reader.readInteger();

        System.out.println("Type another value: ");
        int second = this.reader.readInteger();

        System.out.println("Difference of the values: " + (first - second));
        this.calculationsDone++;
    }

    private void product() {
        System.out.println("Type a value: ");
        int first = this.reader.readInteger();

        System.out.println("Type another value: ");
        int second = this.reader.readInteger();

        System.out.println("Product of the values: " + (first * second));
        this.calculationsDone++;
    }

    private void statistics() {
        System.out.println("Calculations done " + calculationsDone);

    }
}
