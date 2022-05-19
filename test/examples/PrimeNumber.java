package test.examples;

public class PrimeNumber {

    public void primeNumbers(){
        for(int i=2;i<30;i++){
            int count=1;
            for(int j=2;j<i;j++){
                if(i%j ==0){
                    count=0;
                    break;
                }

            }if(count==1){
                System.out.print(i + " ");

            }
        }
    }
    public static void main(String[] args) {

    }

}


