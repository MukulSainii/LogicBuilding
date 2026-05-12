package StreamAPI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class countRepeatedElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5,5,5,5, 6};
        Map<Integer, Integer> element = new HashMap<>();
        for (int j : arr) {
            element.put(j, element.getOrDefault(j, 0) + 1);
        }
        element.forEach((key, value)->
                System.out.println("element : "+key + " count : "+value));

        //count occurrence of each character in a string
        String str = "hello mukul , how are you doing today?";
        Map <Character, Integer> result  = new HashMap<>();
        for(int i=0; i < str.length(); i++){
            char c = str.charAt(i);
//            if you want to ignore space then you can add condition here
            if(Character.isLetter(c)){
                result.put(c, result.getOrDefault(c, 0) + 1);
            }
        }
        result.forEach((key, value)->
                System.out.println("char: "+key+", count: "+ value));
        // doing same with the stream api
        Map<Character, Long> output =  str.chars()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));
        System.out.println(output);

        // find the count of single character in the string
        String str1 = "sachinemukulmm";
        long result1  = str1.toLowerCase()
                . chars()
                .mapToObj(c-> (char)c)
                .filter(s-> s == 'm')
                .count();
        System.out.println("result1 : "+result1);

        // if you have to find the count of character in from the list of strings
        String[] strArray =  {"hello", "world", "java", "stream", "api"};
        long result2 =  Arrays.stream(strArray)
                .flatMapToInt(String::chars)
                .mapToObj(c->(char)c)
                .filter(c-> c == 'a')
                .count();
        System.out.println("result2 : "+result2 );
    }
}
