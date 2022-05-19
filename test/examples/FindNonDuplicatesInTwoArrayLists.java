package test.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNonDuplicatesInTwoArrayLists {

    public static  List<Integer>
    findNonDuplicatesInArrayLists(List<Integer> values,List<Integer> values1){

        List<Integer> nonDuplicatesList =new ArrayList<>();

        nonDuplicatesList.addAll(values.stream().filter(value -> values1.stream().noneMatch(value1 ->
                value1.equals(value))).collect(Collectors.toList()));

        nonDuplicatesList.addAll(values1.stream().filter(value1 -> values.stream()
                .noneMatch(value -> value.equals(value1))).collect(Collectors.toList()));

        return nonDuplicatesList;

    }


    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4);

        List<Integer> values1 = Arrays.asList(4,5,6);

        System.out.println(findNonDuplicatesInArrayLists(values,values1));
    }
}
