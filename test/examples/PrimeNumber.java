package test.examples;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {

    public static void primeNumbersJava8(){
        IntStream.range(2,10).filter(number -> !
                IntStream.rangeClosed(2, number / 2)
                        .anyMatch(i -> number % i == 0))
                .forEach(data ->System.out.println(data));
    }

    public static void primeNumbers() {
        for (int i = 2; i < 30; i++) {
            int count = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = 0;
                    break;
                }

            }
            if (count == 1) {
                System.out.print(i + " ");

            }
        }
    }

    public static void main(String[] args) {
        primeNumbersJava8();

        //IntStream.rangeClosed(2,2).forEach(value -> System.out.println(value));
    }

}


