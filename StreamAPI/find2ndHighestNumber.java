package StreamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class find2ndHighestNumber {
    public static void main(String[] args) {
        List<Integer> number = List.of(2,3,10,26,48,4, 94,6,3,2);
        Optional<Integer> result = number.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        result.ifPresent(System.out::println);
//       output: 48

        int[] arr = {2,3,10,26,48,4,101, 100, 87, 94,6,3,2};
        int largest = 0;
        int secondLargest = 0;
        for (int element : arr) {
            if(element > largest){
                secondLargest = largest;
                largest = element;
            }
            else{
                if(element > secondLargest && secondLargest != largest){
                    secondLargest = element;
                }
            }
        }
        System.out.println(largest +"  "+secondLargest);
    }
    //output: 101  100
}
