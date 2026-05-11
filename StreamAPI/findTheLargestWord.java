package StreamAPI;

import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findTheLargestWord {
    public static void main(String[] args) {
        String str = "Hello world, this is a Java Stream API example.";

        String result = Stream.of(str.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");

        System.out.println(result);

        //find length of each word in the string
       Map<String,Integer> element =  Stream.of(str.split(" "))
                .collect(Collectors.toMap(
                        word -> word,
                        String:: length
                ));
       element.forEach((key, value)->
               System.out.println("word : "+key + " length : "+value)
       );
    }
}
