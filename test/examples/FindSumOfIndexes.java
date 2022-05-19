package test.examples;

import java.util.HashMap;
import java.util.Map;

public class FindSumOfIndexes {

    public static void findSumOfIndex(int[] a,int sumValue){
        Map<Integer,Integer> params =new HashMap<>();

        for(int i=0;i<a.length;i++){
            if(params.containsKey(a[i])){
                int index = params.get(a[i]);
                System.out.println("Two indexes are:"+ index +" "+ i);
                break;
            }else{
                int finder = sumValue-a[i];
                params.put(finder,i);
            }
        }


    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        findSumOfIndex(a,5);
    }
}
