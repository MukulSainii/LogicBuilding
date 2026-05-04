package StreamAPI;

import java.util.Comparator;
import java.util.stream.Stream;

public class findTheLargestWord {
    public static void main(String[] args) {
        String str = "Hello world, this is a Java Stream API example.";

        String result = Stream.of(str.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println(result);
    }
}
