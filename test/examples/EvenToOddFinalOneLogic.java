package test.examples;
//Write a Java program start with an integer n, divide n by 2 if n is even
// or multiply by 3 and add 1 if n is odd, repeat the process until n = 1.
public class EvenToOddFinalOneLogic {

    public static void findIterationFindingOne(int value){
        int count=0;

        while(value!=1) {
            if(value%2==0){
                ++count;
                value = value/2;
            }else{
                ++count;
                value = (3*value+1)/2;
            }
        }

        if(value==1) {
            System.out.println("The iteration to become value:" + value + " to one:"
                    + count);
        }
    }

    public static void main(String[] args) {
            findIterationFindingOne(9);
    }
}
