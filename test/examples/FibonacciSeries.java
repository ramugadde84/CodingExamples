package test.examples;

public class FibonacciSeries {

    public static void printFibonacciSeries(int n){

        int firstValue = 0;
        int secondValue = 1;

        for(int i=1;i<n;i++){
            System.out.print(firstValue + " ");
            int nextValue = firstValue + secondValue;
            firstValue =  secondValue;
            secondValue = nextValue;
        }
    }

    public static void main(String[] args) {
        printFibonacciSeries(10);
    }
}
