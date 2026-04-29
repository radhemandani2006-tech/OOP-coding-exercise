import java.util.LinkedList;

public class practical32 {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {

        return list.contains(element);
    }

    public static void main(String[] args) {

        LinkedList<Integer> rollNumbers = new LinkedList<Integer>();

        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);
        rollNumbers.add(104);

        System.out.println("Searching in Roll Numbers:");

        System.out.println("103 exists: " + searchElement(rollNumbers, 103));
        System.out.println("110 exists: " + searchElement(rollNumbers, 110));

        LinkedList<String> names = new LinkedList<String>();

        names.add("Radhe");
        names.add("Krishna");
        names.add("Mohan");

        System.out.println("\nSearching in Names:");

        System.out.println("Krishna exists: " + searchElement(names, "Krishna"));
        System.out.println("Ram exists: " + searchElement(names, "Ram"));
    }
}
