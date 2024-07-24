import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamApiApp {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Sam", 30),
                new Person("Fred", 25),
                new Person("Awal", 35),
                new Person("Bright", 50)
        );

        Comparator<Person> comparator = new NameComparator();

        List<String> result = persons.stream()
                .sorted(comparator)
                .filter(p -> p.getAge() >= 30)
                .map(p -> p.getName().toUpperCase())
                .toList();

        result.forEach(System.out::println);
    }
}
