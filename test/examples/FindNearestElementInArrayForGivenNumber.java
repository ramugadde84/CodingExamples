package test.examples;

import java.util.*;

public class FindNearestElementInArrayForGivenNumber {


    public static int findNearestElement(int[] a,int number){
        Map<Integer,Integer> params =new HashMap<>();
        for(int i=0;i<a.length;i++){
            params.put(Math.abs(a[i]-number),a[i]);
        }

        List<Integer> keySetList = new ArrayList<>(params.keySet());
        Collections.sort(keySetList);

        return params.get(keySetList.get(0));
    }

    public static void main(String[] args) {
        int[] e = {1,3,4,5,6,7};
        System.out.println("Nearest element:"+
                findNearestElement(e,8));
    }
}
