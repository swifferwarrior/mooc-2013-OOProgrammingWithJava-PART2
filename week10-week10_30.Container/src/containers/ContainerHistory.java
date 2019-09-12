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
        return this.history.toString();
    }

    public double maxValue() {
        //returns the greatest value in the container history. If history is empty, returns 0;
        if (history.isEmpty()) {
            return 0;
        }

        double maxValue = this.history.get(0);
        for (double number : this.history) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        return maxValue;
    }

    public double minValue() {
        //returns the smallest value in teh container history. If the history is empty, returns 0;
        if (history.isEmpty()) {
            return 0;
        }

        double minValue = this.history.get(0);
        for (double number : this.history) {
            if (number < minValue) {
                minValue = number;
            }
        }
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

        double maxFluctuation = 0;
        double i = 0;
        
        for (double number : this.history) {
            //double contender = this.history.get((int) (i+1));
            double fluctuation = number - (this.history.get((int) (i + 1)));
            if (fluctuation < 0) {
                fluctuation *= (-1);
            }
            if (fluctuation > maxFluctuation){
                maxFluctuation = fluctuation;
            }
            i++;
            if (i >= this.history.size()-1){
                break;
            }
        }
        return maxFluctuation;
    }

    public double variance() {
        //returns the sampel variance of the container history values.
        //if the history is empty or contains one value, returns 0;
        if (this.history.size() <= 1) {
            return 0;
        }
        double sampleSum = 0;
        double avg = this.average();
        for (double number : this.history) {
            double sample = (number - avg) * (number - avg);
            sampleSum += sample;
        }
        double variance = (sampleSum / (this.history.size() - 1));
        return variance;

    }
}
