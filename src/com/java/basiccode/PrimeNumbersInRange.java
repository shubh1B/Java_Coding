public class PrimeNumbersInRange {
    public static void main (String[]args){

        int rem;
        int pncount=0;


        for(int i=3;i<=100;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                rem=i%j;
                if(rem==0){
                    count++;
                }
            }
            if(count==2){
                pncount++;

            }

        }
        System.out.println("Prime number count is:" + pncount);

    }
}
