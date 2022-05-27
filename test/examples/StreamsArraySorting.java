package test.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StreamsArraySorting {


    public static void findMinNumbersFromArray(int a[]) {
        System.out.println("Min:" +
                Arrays.stream(a).min().getAsInt());

        System.out.println("Max:" +
                Arrays.stream(a).max().getAsInt());

        System.out.println(Arrays.toString(Arrays.stream(a).sorted().toArray()));

    }

    public static void findSecondMaxNumber(Integer a[]){
        System.out.println("Second max element:"+Arrays.asList(a).stream()
                .sorted(Collections.reverseOrder())
                .distinct()
                .limit(2)
                .skip(1)
                .findFirst()
                .get());

    }


    public static void findSecondMaxNumberWithoutUsingSorting(Integer a[]){
        Integer firstMaxValue =
                Arrays.asList(a).stream().max(Comparator.comparing(Integer::valueOf)).get();

        Integer secondMaxValue=
                Arrays.asList(a).stream().filter(value -> value < firstMaxValue)
                        .max(Comparator.comparing(Integer::valueOf)).get();


        System.out.println("Second max value with out using sorted:"+secondMaxValue);
    }

    public static void findMinNumbersFromIntegerArray(Integer a[]) {
        System.out.println("Min:" +
                Arrays.stream(a).min(Comparator.comparing(Integer::valueOf)).get());

        System.out.println("Max:" +
                Arrays.stream(a).max(Comparator.comparing(Integer::valueOf)).get());

    }


    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        findMinNumbersFromArray(a);

        Integer b[] = {1, 2, 3, 4, 5};
        findSecondMaxNumberWithoutUsingSorting(b);

    }
}
