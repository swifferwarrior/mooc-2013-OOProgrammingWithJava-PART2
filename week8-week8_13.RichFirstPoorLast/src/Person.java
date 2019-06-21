public class Person implements Comparable <Person>{

    private int salary;
    private String name;

    public Person(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return name + " " + salary;
    }
    
    @Override
    public int compareTo(Person other){
        return other.getSalary() - this.salary;
    }
}

/* POST-SUBMIT NOTES */
/* 
1. COMPARABLE GENERIC
        Don't forget to add "implements Comparable<T> to the class prior to the 
        compareTo() method and Override the provided one.
2. COMPARING THE TWO PERSONS
        Why does it matter that it is other - this vs. this - other?
*/