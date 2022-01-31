import java.awt.List;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        ArrayList<Bundle> bundles = new ArrayList<Bundle>();
        bundles.add(new Bundle("dude1", new Date(65), new Person[] {
            new Person("Person 1", new int[] {1, 2, 3, 4}),
            new Person("Person 2", new int[] {5, 6, 7, 8}),
            new Person("Person 3", new int[] {9, 10, 11, 12})
        }));
        bundles.add(new Bundle("dude2", new Date(1234), new Person[] {
            new Person("Person 1", new int[] {1, 2, 3, 4}),
            new Person("Person 2", new int[] {5, 6, 7, 8}),
            new Person("Person 3", new int[] {9, 10, 11, 12}),
            new Person("Person 1", new int[] {1, 2, 3, 4}),
            new Person("Person 2", new int[] {5, 6, 7, 8}),
            new Person("Person 3", new int[] {9, 10, 11, 12}),
            new Person("Person 1", new int[] {1, 2, 3, 4}),
            new Person("Person 2", new int[] {5, 6, 7, 8}),
            new Person("Person 3", new int[] {9, 10, 11, 12})
        }));
        bundles.add(new Bundle("dude3", new Date(12345), new Person[] {
            new Person("Person 1", new int[] {1, 2, 33, 4}),
            new Person("Person 2", new int[] {5, 63, 7, 8}),
            new Person("Person 3", new int[] {9, 10, 113, 12})
        }));
		}

    }

    class Bundle {
        String name;
        Date birthdate;
        Person[] Persons;

        public Bundle(String name, Date birthdate, Person[] Persons) {
            this.name = name;
            this.birthdate = birthdate;
            this.Persons = Persons;
        }

    }

    class Person {
        String name;
        int[] counts;

        public Person(String name, int[] counts) {
            this.name = name;
            this.counts = counts;
        }
    }
