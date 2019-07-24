package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (name == null || name.length() > 40 || name.isEmpty() || age > 120 || age < 0) {
            throw new IllegalArgumentException();
        }
        this.age = age;
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }
}
/* POST-SUBMIT NOTES */
 /*
1. EMPTY NAME
        Remember, when checking for empty string use name.isEmpty() rather than
        name.equals("");
2. DON'T USE 'THIS'
        Problem, exception is not being thrown because if statements are looking for 
        this.name and this.age within the constructor. Remove '.this'!
3. NULL GOES FIRST
        Null has to be checked for first. What if null is the second test? What
        happens to a name length that is less than 40 but still null?
 */
