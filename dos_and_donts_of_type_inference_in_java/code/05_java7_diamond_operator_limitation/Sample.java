import java.util.*;

public class Sample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>() {
        }; //ERROR in Java 7 & 8

        names.add("Jack");
        names.add("Jill");

        System.out.println(names);
    }
}
