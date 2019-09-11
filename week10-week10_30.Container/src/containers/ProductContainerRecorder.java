package containers;

public class ProductContainerRecorder extends ProductContainer {
    
    private ContainerHistory history;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.history = new ContainerHistory();
        this.history.add(initialVolume);
        super.addToTheContainer(initialVolume);
    }
    
    public String history() {
        return this.history.toString();
    }
    
    public void addToTheContainer(double amount) {
        //works like method in Container, but new situation is recorded in the history
        super.addToTheContainer(amount);
        this.history.add(super.getVolume());
    }
    
    public void printAnalysis(){
        //prints the history information regarding the product
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history);
        System.out.println("Greatest product amount: " + this.history.maxValue());
        System.out.println("Smallest product amount: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
        System.out.println("Greatest change: " + this.history.greatestFluctuation());
        System.out.println("Variance : " + this.history.variance());
    }
}
