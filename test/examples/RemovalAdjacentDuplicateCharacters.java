package test.examples;

public class RemovalAdjacentDuplicateCharacters{

    int i, k = 0;
     public static String remove(String s){
        char[] values = s.toCharArray();
        char[] tempArray = new char[values.length];
        int k=0;
        int i=0;
        for(i=1;i<values.length;i++){
            if(values[i-1] != values[i]){
                tempArray[k++] = values[i-1];
            }else {
                // remove adjacent duplicates
                while (i < values.length && values[i - 1] == values[i]) {
                    i++;
                }
            }
        }

        if(i<=values.length) {
            tempArray[k++] = values[i - 1];
        }

        return String.valueOf(tempArray);
    }
   public static void main(String args[]){

         System.out.println(remove("raamu")); //op:rmu
  }
}