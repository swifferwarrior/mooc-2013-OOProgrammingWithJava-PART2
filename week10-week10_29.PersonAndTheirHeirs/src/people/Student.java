package people;

public class Student extends Person {
    
    private int credits;

    public Student(String name, String contactInfo) {
        super(name, contactInfo);
        this.credits = credits;
    }
    
    public void study(){
        credits++;
    }
    
    public int credits(){
        return this.credits;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "  credits " + this.credits;
    }
    
}
