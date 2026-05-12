package StreamAPI;

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
//        element.forEach((key, value)->
//                System.out.println("element : "+key + " count : "+value));

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
//        result.forEach((key, value)->
//                System.out.println("char: "+key+", count: "+ value));
        // doing same with the stream api
        Map<Character, Long> output =  str.chars()
                .filter(Character::isLetter)
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));
        System.out.println(output);
    }
}
