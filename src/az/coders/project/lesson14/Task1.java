package az.coders.project.lesson14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        List number= Arrays.asList(1,2,3,6,4,5,7);
        Stream<Integer> array = number.stream();



         class ReverseListExample {
            public static void main(String[] args) {
                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

                // Reverse the elements of the list
                List<Integer> reversedList = numbers.stream()
                        .collect(
                                ArrayList::new,   // Supplier to create a new list
                                (result, element) -> result.add(0, element),   // Accumulator to add elements at the beginning of the list
                                ArrayList::addAll   // Combiner to combine lists (unused in this case)
                        );

                // Print the reversed list
                System.out.println(reversedList);
            }
        }



    }


}
