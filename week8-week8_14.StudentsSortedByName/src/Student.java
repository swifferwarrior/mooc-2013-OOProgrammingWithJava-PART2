public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    //@Override
    public int compareTo(Student other){
        return this.name.compareToIgnoreCase(other.getName());
    }
    
}

/* POST-SUBMIT NOTES */
/*
1. COMPARED TO METHOD
        String has it's own .compareTo() method, but regardless the method will
        return a 1, 0 , or -1. This means it will still return an integer.
*/