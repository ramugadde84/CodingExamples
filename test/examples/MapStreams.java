package test.examples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapStreams {

    public static void mapEntrySet(Map<Integer,Integer> params){
        params.entrySet().stream().forEach(p -> System.out.println(p.getKey() + " " +
                p.getValue()));
    }

    public static void findMaxDuplicateKeyValue(List<Integer> values){
        Map<Integer,Integer> params = values.stream().collect(Collectors.groupingBy(Function.identity()
                ,Collectors.summingInt(e->1)));

        Integer maxDuplicateValue = params.entrySet().stream()
                .max(Comparator.comparing(e-> e.getValue()))
                 .map(e -> e.getKey()).stream().findFirst().get();

        System.out.println("Max duplicate value:"+maxDuplicateValue);
    }
    public static void main(String[] args) {
        Map<Integer,Integer> params =new HashMap<>();
        params.put(1,1);
        params.put(2,2);
        params.put(3,4);
       mapEntrySet(params);

       findMaxDuplicateKeyValue(Arrays.asList(1,1,2,2,2,3,4,5,6));
    }
}
