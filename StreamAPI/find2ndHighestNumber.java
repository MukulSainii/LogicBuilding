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

    }
}
