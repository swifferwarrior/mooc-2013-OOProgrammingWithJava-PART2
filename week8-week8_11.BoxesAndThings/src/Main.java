
public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Fedor Dostojevski", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);

        System.out.println("");
        Box box = new Box(10);

        box.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
        
        System.out.println("");
        
        Box box2 = new Box(20);
        box2.add(new Book("Hayao Miyazaki", "Totoro", 3));
        box2.add(new Book("Dunno Arigato", "Akira", 15));
        System.out.println(box2);
        
        System.out.println("");
        
        Box metabox = new Box (100);
        metabox.add(box);
        metabox.add(box2);
        System.out.println(metabox);
        
        System.out.println("");
        
        /*metabox.add(metabox);
        System.out.println(metabox);*/

    }
}

/* POST SUBMIT NOTES */
/*
1. STACK OVERFLOW
    Metabox is placed within metabox is placed within metabox...
        This continues until the heap of objects at the end of the address grow to the point
        where they collide with the variables in the stack at the beginning of the
        address, meaning they "overflow". Kind of like a snake eating itself.
        What will it do when it gets to the end?
*/
