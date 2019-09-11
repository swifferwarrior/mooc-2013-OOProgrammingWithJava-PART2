package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        //adds the parameter situation to the end of the container history
        this.history.add(situation);
    }

    public void reset() {
        //deletes container history records
        this.history.removeAll(history);
    }

    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        //returns the greatest value in the container history. If history is empty, returns 0;
        List<Double> descendingValue = this.history;
        Collections.sort(history);
        if (history.isEmpty()) {
            return 0;
        }

        double maxValue = descendingValue.get(0);
        return maxValue;
    }

    public double minValue() {
        //returns the smallest value in teh container history. If the history is empty, returns 0;
        List<Double> ascendingValue = this.history;
        Collections.sort(history);

        if (history.isEmpty()) {
            return 0;
        }

        double minValue = ascendingValue.get(ascendingValue.size() - 1);
        return minValue;
    }

    public double average() {
        //returns average of the values in the container history. If empty, returns 0;
        if (history.isEmpty()) {
            return 0;
        }

        double sum = 0;
        double amount = 0;
        for (double situation : this.history) {
            sum += situation;
            amount++;
        }
        return sum / amount;
    }

    public double greatestFluctuation() {
        //returns absolute value of the single greatest fluctuation in the container history
        //if history is empty or contains one value, returns 0
        if (this.history.size() <= 1) {
            return 0;
        }
        
        List<Double> fluctuations = new ArrayList<Double>();
        for (double number : this.history){
            double fluctuation = number - (this.history.indexOf(number + 1));
            if (fluctuation < 0){
                fluctuation = fluctuation * -1;
            }
            fluctuations.add(fluctuation);
        }
        Collections.sort(fluctuations);
        return fluctuations.get(0);
    }

    public double variance() {
        //returns the sampel variance of the container history values.
        //if the history is empty or contains one value, returns 0;
        if (this.history.size() <= 1) {
            return 0;
        }
        int n = 0;
        double sampleSum = 0;
        double avg = average();
        for (double number : this.history) {
            double sample = (number - avg) * (number - avg);
            sampleSum += sample;
            n++;
        }
        double variance = (sampleSum / (n - 1));
        return variance;

    }
}
