package StreamAPI;

import java.util.HashMap;
import java.util.Map;

public class countRepeatedElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5,5,5,5, 6};
        Map<Integer, Integer> element = new HashMap<>();
        for (int j : arr) {
            element.put(j, element.getOrDefault(j, 0) + 1);
        }
        element.forEach((key, value)->
                System.out.println("element : "+key + " count : "+value));
    }
}
